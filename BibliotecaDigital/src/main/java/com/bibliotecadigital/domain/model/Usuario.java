/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Manu-Hdz
 */
public class Usuario {
    private String nombre;
    private String email;
    private String passwordHash;

    public Usuario(String nombre, String email, String passwordPlano) {
        this.nombre = nombre;
        this.email = email;
        // Al crear un usuario, se guarda el hash y no la contraseña en texto plano
        this.passwordHash = BCrypt.hashpw(passwordPlano, BCrypt.gensalt());
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    // Verificar contraseña ingresada contra el hash almacenado
    public boolean verificarPassword(String passwordIngresada) {
        return BCrypt.checkpw(passwordIngresada, this.passwordHash);
    }
    
    
}
