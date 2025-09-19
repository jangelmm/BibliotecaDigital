/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.service.MaterialRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaMaterialRepository implements MaterialRepository {

    private final EntityManagerFactory emf;

    public JpaMaterialRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // Métodos de utilidad para manejar el EntityManager y las transacciones
    private <T> T execute(Function<EntityManager, T> action) {
        EntityManager em = emf.createEntityManager();
        try { return action.apply(em); } 
        finally { em.close(); }
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public MaterialBiblioteca save(MaterialBiblioteca material) {
        executeInsideTransaction(em -> {
            // Re-asociar los autores a la sesión actual de persistencia
            List<Autor> autoresGestionados = new ArrayList<>();
            if (material.getAutores() != null) {
                for (Autor autor : material.getAutores()) {
                    // Busca la versión "fresca" del autor en la BD y la añade
                    autoresGestionados.add(em.find(Autor.class, autor.getId()));
                }
            }
            material.setAutores(autoresGestionados);

            // Merge es la operación correcta aquí: inserta si es nuevo, actualiza si existe
            em.merge(material);
        });
        return material;
    }

    @Override
    public void saveWithAutores(MaterialBiblioteca material, List<Integer> autorIds) {
        executeInsideTransaction(em -> {
            List<Autor> autoresGestionados = new ArrayList<>();
            for (Integer idAutor : autorIds) {
                Autor autor = em.find(Autor.class, idAutor);
                if (autor != null) {
                    autoresGestionados.add(autor);
                }
            }
            material.setAutores(autoresGestionados);
            em.persist(material);
        });
    }

    @Override
    public Optional<MaterialBiblioteca> findById(int id) {
        return Optional.ofNullable(execute(em -> em.find(MaterialBiblioteca.class, id)));
    }

    @Override
    public List<MaterialBiblioteca> findAll() {
        return execute(em -> em.createQuery("SELECT m FROM MaterialBiblioteca m", MaterialBiblioteca.class).getResultList());
    }
    
    @Override
    public List<MaterialBiblioteca> findByTitulo(String titulo) {
        return execute(em -> {
            TypedQuery<MaterialBiblioteca> query = em.createQuery(
                "SELECT m FROM MaterialBiblioteca m WHERE lower(m.titulo) LIKE lower(:titulo)", MaterialBiblioteca.class);
            query.setParameter("titulo", "%" + titulo + "%");
            return query.getResultList();
        });
    }

    @Override
    public void deleteById(int id) {
        executeInsideTransaction(em -> {
            // 1. Busca el material que se va a borrar dentro de la transacción actual.
            MaterialBiblioteca materialParaBorrar = em.find(MaterialBiblioteca.class, id);
            if (materialParaBorrar != null) {

                // 2. Busca todos los préstamos que contengan este material.
                TypedQuery<Prestamo> query = em.createQuery(
                    "SELECT p FROM Prestamo p WHERE :material MEMBER OF p.materiales", Prestamo.class);
                query.setParameter("material", materialParaBorrar);
                List<Prestamo> prestamosAsociados = query.getResultList();

                // 3. Itera sobre cada préstamo encontrado y elimina la referencia al material.
                for (Prestamo prestamo : prestamosAsociados) {
                    prestamo.getMateriales().remove(materialParaBorrar);
                    em.merge(prestamo); // Actualiza el préstamo en la BD sin el material
                }

                // 4. Ahora que no hay referencias, borra el material de forma segura.
                em.remove(materialParaBorrar);
            }
        });
    }
}