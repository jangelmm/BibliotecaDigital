/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryBibliotecaRepository implements BibliotecaService {
    private List<MaterialBiblioteca> materiales;
    private List<Autor> autores;
    private AtomicInteger materialIdCounter;
    private AtomicInteger autorIdCounter;
    private List<Usuario> usuarios;
    
    public InMemoryBibliotecaRepository() {
        this.materiales = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.materialIdCounter = new AtomicInteger(1);
        this.autorIdCounter = new AtomicInteger(1);
        this.usuarios = new ArrayList<>();
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
}