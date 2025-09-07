/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.util.List;

public class MaterialController {
    private BibliotecaService bibliotecaService;
    
    public MaterialController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }
    
    public MaterialBiblioteca registrarMaterial(MaterialBiblioteca material) {
        return bibliotecaService.registrarMaterial(material);
    }
    
    public MaterialBiblioteca buscarMaterialPorId(int id) {
        return bibliotecaService.buscarMaterialPorId(id);
    }
    
    public List<MaterialBiblioteca> listarMateriales() {
        return bibliotecaService.listarMateriales();
    }
    
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        return bibliotecaService.buscarMaterialesPorTitulo(titulo);
    }
    
    public List<MaterialBiblioteca> buscarMaterialesPorAutor(String autor) {
        return bibliotecaService.buscarMaterialesPorAutor(autor);
    }
    
    public Autor registrarAutor(Autor autor) {
        return bibliotecaService.registrarAutor(autor);
    }
    
    public Autor buscarAutorPorId(int id) {
        return bibliotecaService.buscarAutorPorId(id);
    }
    
    public List<Autor> listarAutores() {
        return bibliotecaService.listarAutores();
    }
}