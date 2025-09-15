/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Manu-Hdz
 * @version 2.0
 * @author Jesus
 */

import jakarta.persistence.*;
import org.mindrot.jbcrypt.BCrypt;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String nombre;

    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private RolUsuario rol;

    public Usuario() {} // Constructor vacío requerido por JPA

    // Tu constructor original
    public Usuario(String nombre, String email, String passwordPlano, RolUsuario rol) {
        this.nombre = nombre;
        this.email = email;
        this.passwordHash = BCrypt.hashpw(passwordPlano, BCrypt.gensalt());
        this.rol = rol;
    }

    // --- Getters y Setters ---
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public RolUsuario getRol() { return rol; }
    public void setRol(RolUsuario rol) { this.rol = rol; }
    public boolean verificarPassword(String passwordIngresada) {
        return BCrypt.checkpw(passwordIngresada, this.passwordHash);
    }
}