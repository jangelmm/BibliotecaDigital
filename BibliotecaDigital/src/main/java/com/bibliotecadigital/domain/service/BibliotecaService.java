package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import java.util.List;

public interface BibliotecaService {
    // Métodos para materiales
    MaterialBiblioteca registrarMaterial(MaterialBiblioteca material);
    MaterialBiblioteca buscarMaterialPorId(int id);
    List<MaterialBiblioteca> listarMateriales();
    List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo);
    List<MaterialBiblioteca> buscarMaterialesPorAutor(String autor);
    
    // Métodos para autores
    Autor registrarAutor(Autor autor);
    Autor buscarAutorPorId(int id);
    List<Autor> listarAutores();
    Autor actualizarAutor(Autor autor);
    void eliminarAutor(int id);
    
    // Métodos para usuarios
    boolean registrarUsuario(Usuario usuario);
    Usuario buscarUsuarioPorEmail(String email);
    List<Usuario> listarUsuarios();
    boolean actualizarRolUsuario(String email, RolUsuario nuevoRol);
    void eliminarUsuario(Usuario usuario);
    
    // Métodos de validación
    boolean validarMaterial(MaterialBiblioteca material);
    
    // Métodos para préstamos
    Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales);
    List<Prestamo> listarPrestamos();
    
    // Método para devoluciones
    boolean registrarDevolucion(Prestamo prestamo, MaterialBiblioteca material);
}