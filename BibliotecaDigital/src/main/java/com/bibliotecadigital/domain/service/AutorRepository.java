/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import java.util.List;
import java.util.Optional;

public interface AutorRepository {
    Autor save(Autor autor);
    Optional<Autor> findById(int id);
    List<Autor> findAll();
    void deleteById(int id);
}