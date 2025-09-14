/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;

/**
 *
 * @author Manu-hdz
 */
public class AuthenticationService {
    private InMemoryBibliotecaRepository biblioteca;

    public AuthenticationService(InMemoryBibliotecaRepository biblioteca) {
        this.biblioteca = biblioteca;
    }

    // Login de usuario
    public Usuario login(String email, String password) {
        Usuario usuario = biblioteca.buscarUsuarioPorEmail(email);
        if (usuario != null && usuario.verificarPassword(password)) {
            return usuario; // login correcto
        }
        return null; // login fallido
    }
}
