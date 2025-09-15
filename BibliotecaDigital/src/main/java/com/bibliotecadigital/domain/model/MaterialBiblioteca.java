/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

import java.util.ArrayList;
import java.util.List;

public abstract class MaterialBiblioteca {
    protected int id;
    protected String titulo;
    protected int anio;
    protected String rutaArchivo;
    protected List<Autor> autores;
    protected boolean disponible;
    
    public MaterialBiblioteca(int id, String titulo, int anio, String rutaArchivo) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.rutaArchivo = rutaArchivo;
        this.autores = new ArrayList<>();
        this.disponible = true;
    }
    
    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }
    
    public String getRutaArchivo() { return rutaArchivo; }
    public void setRutaArchivo(String rutaArchivo) { this.rutaArchivo = rutaArchivo; }
    
    public List<Autor> getAutores() { return autores; }
    public void setAutores(List<Autor> autores) { this.autores = autores; }
    
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    
    public void agregarAutor(Autor autor) {
        if (!autores.contains(autor)) {
            autores.add(autor);
        }
    }
    
    public void removerAutor(Autor autor) {
        autores.remove(autor);
    }
    
    /**
     * Formatea el nombre de un autor al estilo APA (Apellido, I.).
     * Este método es 'protected' para que solo las subclases puedan usarlo.
     * @param nombreCompleto El nombre completo del autor, ej. "Gabriel García Márquez".
     * @return El nombre formateado, ej. "García Márquez, G.".
     */
    protected String formatearNombreAutorAPA(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.trim().isEmpty()) {
            return "";
        }
        String[] partes = nombreCompleto.trim().split("\\s+");
        if (partes.length == 1) {
            return partes[0]; // Maneja nombres únicos como "Platón"
        }
        
        String nombre = partes[0];
        String inicial = nombre.substring(0, 1) + ".";
        
        StringBuilder apellidos = new StringBuilder();
        for (int i = 1; i < partes.length; i++) {
            apellidos.append(partes[i]).append(" ");
        }
        
        return apellidos.toString().trim() + ", " + inicial;
    }
    
    // Métodos abstractos
    public abstract String mostrarInformacion();
    public abstract String generarCitaAPA();
    
    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Año: " + anio + 
               ", Autores: " + autores + ", Disponible: " + disponible;
    }
}