/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

/**
 *
 * @author jesus
 */

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "prestamo_material",
        joinColumns = @JoinColumn(name = "prestamo_id"),
        inverseJoinColumns = @JoinColumn(name = "material_id")
    )
    private List<MaterialBiblioteca> materiales;
    
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    /**
     * Constructor vacío, OBLIGATORIO para JPA.
     */
    public Prestamo() {
    }

    /**
     * CONSTRUCTOR NUEVO: Para crear préstamos donde la BD genera el ID.
     * Este es el que tu controlador necesita.
     */
    public Prestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = LocalDate.now();
    }
    
    /**
     * Constructor original, útil para pruebas o casos específicos.
     */
    public Prestamo(int id, Usuario usuario, List<MaterialBiblioteca> materiales) {
        this.id = id;
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = LocalDate.now();
    }

    // --- Getters y Setters ---
    public int getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public List<MaterialBiblioteca> getMateriales() { return materiales; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(LocalDate fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }
}