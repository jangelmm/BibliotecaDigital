/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

import java.time.LocalDate;
import java.util.List;

/**
 * @author HFernandoCR
 */

public class Prestamo {
    private int id;
    private Usuario usuario;
    private List<MaterialBiblioteca> materiales;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    
    public Prestamo(int id, Usuario usuario, List<MaterialBiblioteca> materiales,
            LocalDate fechaPrestamo, LocalDate fechaDevolucion ){
        this.id = id;
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}

    public List<MaterialBiblioteca> getMateriales() {return materiales;}
    public void setMateriales(List<MaterialBiblioteca> materiales) {this.materiales = materiales;}

    public LocalDate getFechaPrestamo() {return fechaPrestamo;}
    public void setFechaPrestamo(LocalDate fechaPrestamo) {this.fechaPrestamo = fechaPrestamo;}

    public LocalDate getFechaDevolucion() {return fechaDevolucion;}
    public void setFechaDevolucion(LocalDate fechaDevolucion) {this.fechaDevolucion = fechaDevolucion;}
    
}
