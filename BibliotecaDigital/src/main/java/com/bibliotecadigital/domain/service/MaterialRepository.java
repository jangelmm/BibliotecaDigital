/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import java.util.List;
import java.util.Optional;

public interface MaterialRepository {
    MaterialBiblioteca save(MaterialBiblioteca material);
    Optional<MaterialBiblioteca> findById(int id);
    List<MaterialBiblioteca> findAll();
    List<MaterialBiblioteca> findByTitulo(String titulo);
    void deleteById(int id);
    void saveWithAutores(MaterialBiblioteca material, List<Integer> autorIds);
}