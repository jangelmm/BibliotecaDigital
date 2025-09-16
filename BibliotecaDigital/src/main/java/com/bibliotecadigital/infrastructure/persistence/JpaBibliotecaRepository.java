/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 * Lo ideal es tener un JPAController por cada Clase en domain.model, sin embargo debido a que ya urge los CRUD, pues se usa una clase DIOS, al simplificar la lógica se conoce como
 * "Patrón de Repositorio"
 */

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.BibliotecaService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.function.Consumer;

public class JpaBibliotecaRepository implements BibliotecaService {

    // El EntityManagerFactory es pesado y se crea una sola vez para toda la aplicación.
    private final EntityManagerFactory emf;

    public JpaBibliotecaRepository() {
        // "biblioteca-pu" es el nombre que definimos en persistence.xml
        this.emf = Persistence.createEntityManagerFactory("biblioteca-pu");
    }

    /**
     * Mejora de Diseño: Método de utilidad para manejar transacciones.
     * Esto asegura que cada operación de escritura (guardar, actualizar, borrar)
     * se ejecute dentro de una transacción segura, con begin, commit y rollback.
     */
    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public MaterialBiblioteca registrarMaterial(MaterialBiblioteca material) {
        executeInsideTransaction(em -> em.persist(material));
        return material;
    }

    @Override
    public MaterialBiblioteca buscarMaterialPorId(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(MaterialBiblioteca.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<MaterialBiblioteca> listarMateriales() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<MaterialBiblioteca> query = em.createQuery("SELECT m FROM MaterialBiblioteca m", MaterialBiblioteca.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    
    
    // Metodos nuevos para el CRUD de Materiales -------------------------------
    @Override
    public MaterialBiblioteca actualizarMaterial(MaterialBiblioteca material) {
        final MaterialBiblioteca[] materialAct = new MaterialBiblioteca[1];
        executeInsideTransaction(em -> {
            materialAct[0] = em.merge(material);
        });
        return materialAct[0];
    }
    
    @Override
    public void eliminarMaterial(int id) {
        executeInsideTransaction(em -> {
            MaterialBiblioteca material = em.find(MaterialBiblioteca.class, id);
            if (material != null) {
                em.remove(material);
            }
        });
    }
    // -------------------------------------------------------------------------
    
    @Override
    public boolean registrarUsuario(String nombre, String email, String password, RolUsuario rol) {
        // La lógica de validación de email duplicado es mejor en la capa de servicio,
        // pero por ahora la implementamos aquí para seguir el contrato.
        if (buscarUsuarioPorEmail(email) != null) {
            return false; // Usuario ya existe
        }
        Usuario nuevoUsuario = new Usuario(nombre, email, password, rol);
        executeInsideTransaction(em -> em.persist(nuevoUsuario));
        return true;
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class);
            query.setParameter("email", email);
            return query.getSingleResult();
        } catch (jakarta.persistence.NoResultException e) {
            return null; // No se encontró el usuario
        } finally {
            em.close();
        }
    }

    @Override
    public Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        final Prestamo[] nuevoPrestamo = new Prestamo[1];
        executeInsideTransaction(em -> {
            // Se asegura de que las entidades estén gestionadas por el EntityManager actual
            Usuario usuarioPersistido = em.find(Usuario.class, usuario.getId());
            
            for (MaterialBiblioteca material : materiales) {
                if (!material.isDisponible()) {
                    throw new IllegalStateException("El material '" + material.getTitulo() + "' no está disponible.");
                }
                material.setDisponible(false);
                em.merge(material); // Actualiza el estado del material en la BD
            }

            Prestamo p = new Prestamo(0, usuarioPersistido, materiales);
            em.persist(p);
            nuevoPrestamo[0] = p;
        });
        return nuevoPrestamo[0];
    }

    // ... Aquí irían las implementaciones del resto de métodos de BibliotecaService
    // (listarPrestamos, registrarDevolucion, registrarAutor, etc.)
    // siguiendo los mismos patrones.

    @Override
    public List<Prestamo> listarPrestamos() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p FROM Prestamo p", Prestamo.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public boolean registrarDevolucion(Prestamo prestamo, MaterialBiblioteca material) {
        executeInsideTransaction(em -> {
            // Se obtienen las versiones más recientes de la BD
            Prestamo p = em.find(Prestamo.class, prestamo.getId());
            MaterialBiblioteca m = em.find(MaterialBiblioteca.class, material.getId());

            if (p == null || m == null || !p.getMateriales().contains(m)) {
                throw new IllegalArgumentException("El material no pertenece al préstamo.");
            }
            m.setDisponible(true);
            em.merge(m);
            // Lógica para cerrar el préstamo si todos han sido devueltos
        });
        return true;
    }
    
    @Override
    public Autor registrarAutor(Autor autor) {
        executeInsideTransaction(em -> em.persist(autor));
        return autor;
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        final Autor[] autorActualizado = new Autor[1];
        executeInsideTransaction(em -> {
            autorActualizado[0] = em.merge(autor);
        });
        return autorActualizado[0];
    }

    @Override
    public void eliminarAutor(int id) {
        executeInsideTransaction(em -> {
            Autor autor = em.find(Autor.class, id);
            if (autor != null) {
                em.remove(autor);
            }
        });
    }

    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<MaterialBiblioteca> query = em.createQuery(
                "SELECT m FROM MaterialBiblioteca m WHERE lower(m.titulo) LIKE lower(:titulo)", 
                MaterialBiblioteca.class
            );
            query.setParameter("titulo", "%" + titulo + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorAutor(String nombreAutor) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<MaterialBiblioteca> query = em.createQuery(
                "SELECT m FROM MaterialBiblioteca m JOIN m.autores a WHERE lower(a.nombre) LIKE lower(:nombreAutor)", 
                MaterialBiblioteca.class
            );
            query.setParameter("nombreAutor", "%" + nombreAutor + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Autor buscarAutorPorId(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Autor.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Autor> listarAutores() {
        EntityManager em = emf.createEntityManager();
        try {
            // Esta es la implementación que corrige tu error
            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a", Autor.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public boolean actualizarRolUsuario(String email, RolUsuario nuevoRol) {
        final boolean[] exito = {false};
        executeInsideTransaction(em -> {
            Usuario usuario = buscarUsuarioPorEmail(email);
            if (usuario != null) {
                usuario.setRol(nuevoRol);
                em.merge(usuario);
                exito[0] = true;
            }
        });
        return exito[0];
    }
    
    // El método validarMaterial no interactúa con JPA, su lógica puede quedar como está
    // o ser movida a una capa de validación más adelante.
    @Override
    public boolean validarMaterial(MaterialBiblioteca material) {
        if (material == null) return false;
        if (material.getTitulo() == null || material.getTitulo().trim().isEmpty()) return false;
        if (material.getAnio() <= 0) return false;
        if (material.getRutaArchivo() == null || material.getRutaArchivo().trim().isEmpty()) return false;
        if (material.getAutores() == null || material.getAutores().isEmpty()) return false;
        return true;
    }
}