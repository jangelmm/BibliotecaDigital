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
 * @author Jesus-Mtz
 */
public class AuthenticationService {
    private InMemoryBibliotecaRepository biblioteca;

    public AuthenticationService(InMemoryBibliotecaRepository biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Usuario login(String email, String password) {
        Usuario usuario = biblioteca.buscarUsuarioPorEmail(email);
        if (usuario != null && usuario.verificarPassword(password)) {
            return usuario; // login correcto
        }
        return null; // login fallido
    }
    
    public boolean tienePermiso(Usuario usuario, String funcionalidad) {
        if (usuario == null) return false;
        
        switch(usuario.getRol()) {
            case ADMINISTRADOR:
                return true; // Los administradores tienen acceso a todo
            case ENCARGADO:
                return !funcionalidad.equals("configuracion_sistema");
            case CLIENTE:
                return funcionalidad.equals("buscar_materiales") || 
                       funcionalidad.equals("prestar_material") ||
                       funcionalidad.equals("devolver_material");
            default:
                return false;
        }
    }
}