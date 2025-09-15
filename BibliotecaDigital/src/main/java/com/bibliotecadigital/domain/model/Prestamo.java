/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

/**
 *
 * @author jesus
 */

import java.time.LocalDate;
import java.util.List;

public class Prestamo {
    private final int id;
    private final Usuario usuario;
    private final List<MaterialBiblioteca> materiales;
    private final LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion; // Puede ser nula hasta que se devuelva todo

    public Prestamo(int id, Usuario usuario, List<MaterialBiblioteca> materiales) {
        this.id = id;
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = LocalDate.now();
    }

    // Getters
    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<MaterialBiblioteca> getMateriales() {
        return materiales;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}