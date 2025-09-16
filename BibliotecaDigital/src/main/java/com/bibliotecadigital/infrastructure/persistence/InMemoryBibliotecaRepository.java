/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

import com.bibliotecadigital.domain.model.*; // Importa todos los modelos
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryBibliotecaRepository implements BibliotecaService {
    private List<MaterialBiblioteca> materiales;
    private List<Autor> autores;
    private AtomicInteger materialIdCounter;
    private AtomicInteger autorIdCounter;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos; 
    private AtomicInteger prestamoIdCounter; 
    
    public InMemoryBibliotecaRepository() {
        this.materiales = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.materialIdCounter = new AtomicInteger(1);
        this.autorIdCounter = new AtomicInteger(1);
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.prestamoIdCounter = new AtomicInteger(1);
    }
    
    @Override
    public MaterialBiblioteca registrarMaterial(MaterialBiblioteca material) {
        if (!validarMaterial(material)) {
            throw new IllegalArgumentException("Datos del material incompletos o inválidos");
        }
        
        // Asignar ID único si no tiene uno
        if (material.getId() == 0) {
            material.setId(materialIdCounter.getAndIncrement());
        }
        
        materiales.add(material);
        return material;
    }
    
    @Override
    public MaterialBiblioteca buscarMaterialPorId(int id) {
        return materiales.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    @Override
    public List<MaterialBiblioteca> listarMateriales() {
        return new ArrayList<>(materiales);
    }
    
    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            return new ArrayList<>();
        }
        
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        String tituloBusqueda = titulo.toLowerCase().trim();
        
        for (MaterialBiblioteca material : materiales) {
            if (material.getTitulo().toLowerCase().contains(tituloBusqueda)) {
                resultados.add(material);
            }
        }
        return resultados;
    }
    
    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            return new ArrayList<>();
        }
        
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        String autorBusqueda = autor.toLowerCase().trim();
        
        for (MaterialBiblioteca material : materiales) {
            for (Autor a : material.getAutores()) {
                if (a.getNombre().toLowerCase().contains(autorBusqueda)) {
                    resultados.add(material);
                    break;
                }
            }
        }
        return resultados;
    }
    
    @Override
    public Autor registrarAutor(Autor autor) {
        if (autor.getNombre() == null || autor.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del autor es obligatorio");
        }
        
        // Asignar ID único si no tiene uno
        if (autor.getId() == 0) {
            autor.setId(autorIdCounter.getAndIncrement());
        }
        
        autores.add(autor);
        return autor;
    }
    
    @Override
    public Autor buscarAutorPorId(int id) {
        return autores.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    @Override
    public List<Autor> listarAutores() {
        return new ArrayList<>(autores);
    }
    
    @Override
    public boolean validarMaterial(MaterialBiblioteca material) {
        if (material == null) return false;
        if (material.getTitulo() == null || material.getTitulo().trim().isEmpty()) return false;
        if (material.getAnio() <= 0) return false;
        if (material.getRutaArchivo() == null || material.getRutaArchivo().trim().isEmpty()) return false;
        if (material.getAutores() == null || material.getAutores().isEmpty()) return false;
        return true;
    }
    
    @Override
    public boolean registrarUsuario(String nombre, String email, String password, RolUsuario rol) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                return false; // ya existe
            }
        }
        Usuario nuevo = new Usuario(nombre, email, password, rol);
        usuarios.add(nuevo);
        return true;
    }

    
    @Override
    public boolean actualizarRolUsuario(String email, RolUsuario nuevoRol) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                u.setRol(nuevoRol);
                return true;
            }
        }
        return false; // usuario no encontrado
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
    
    @Override
    public Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        if (usuario == null || materiales == null || materiales.isEmpty()) {
            throw new IllegalArgumentException("Usuario y lista de materiales no pueden ser nulos o vacíos.");
        }

        // 1. Validar que todos los materiales estén disponibles
        for (MaterialBiblioteca material : materiales) {
            if (!material.isDisponible()) {
                throw new IllegalStateException("El material '" + material.getTitulo() + "' (ID: " + material.getId() + ") no está disponible.");
            }
        }

        // 2. Crear el préstamo
        Prestamo nuevoPrestamo = new Prestamo(prestamoIdCounter.getAndIncrement(), usuario, materiales);
        
        // 3. Actualizar el estado de los materiales
        for (MaterialBiblioteca material : materiales) {
            material.setDisponible(false);
        }

        // 4. Guardar y retornar el préstamo
        this.prestamos.add(nuevoPrestamo);
        return nuevoPrestamo;
    }

    @Override
    public List<Prestamo> listarPrestamos() {
        return new ArrayList<>(prestamos);
    }
    
    @Override
    public boolean registrarDevolucion(Prestamo prestamo, MaterialBiblioteca material) {
        if (prestamo == null || material == null) {
            throw new IllegalArgumentException("El préstamo y el material no pueden ser nulos.");
        }

        // 1. Validar que el material pertenece al préstamo
        if (!prestamo.getMateriales().contains(material)) {
            throw new IllegalArgumentException("El material no pertenece al préstamo especificado.");
        }

        // 2. Validar que el material no haya sido devuelto ya
        if (material.isDisponible()) {
            throw new IllegalStateException("El material '" + material.getTitulo() + "' ya figura como disponible.");
        }

        // 3. Actualizar el estado del material
        material.setDisponible(true);

        // 4. Verificar si el préstamo se ha completado
        boolean todosDevueltos = true;
        for (MaterialBiblioteca m : prestamo.getMateriales()) {
            if (!m.isDisponible()) {
                todosDevueltos = false;
                break;
            }
        }

        if (todosDevueltos) {
            prestamo.setFechaDevolucion(LocalDate.now());
        }

        return true;
    }
    
    @Override
    public Autor actualizarAutor(Autor autor) {
        return null;
    }

    @Override
    public void eliminarAutor(int id) {
        
    }
    
    @Override
    public MaterialBiblioteca actualizarMaterial(MaterialBiblioteca material) {
        return null;
    }

    @Override
    public void eliminarMaterial(int id) {
        
    }
    
}