/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
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
    
    // Validaciones
    boolean validarMaterial(MaterialBiblioteca material);
}