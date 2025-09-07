/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

public class Revista extends MaterialBiblioteca {
    private String editorial;
    private int numero;
    
    public Revista(int id, String titulo, int anio, String rutaArchivo, 
                   String editorial, int numero) {
        super(id, titulo, anio, rutaArchivo);
        this.editorial = editorial;
        this.numero = numero;
    }
    
    // Getters y setters específicos
    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }
    
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    
    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("REVISTA\n");
        info.append("ID: ").append(id).append("\n");
        info.append("Título: ").append(titulo).append("\n");
        info.append("Año: ").append(anio).append("\n");
        info.append("Autores: ").append(autores).append("\n");
        info.append("Editorial: ").append(editorial).append("\n");
        info.append("Número: ").append(numero).append("\n");
        info.append("Ruta de archivo: ").append(rutaArchivo).append("\n");
        info.append("Disponible: ").append(disponible ? "Sí" : "No").append("\n");
        return info.toString();
    }
    
    @Override
    public String generarCitaAPA() {
        if (autores.isEmpty()) {
            return titulo + " (" + anio + "). " + editorial + ", " + numero + ".";
        }
        
        StringBuilder cita = new StringBuilder();
        cita.append(autores.get(0).getNombre());
        
        if (autores.size() > 1) {
            cita.append(" et al.");
        }
        
        cita.append(" (").append(anio).append("). ");
        cita.append(titulo).append(". ");
        cita.append(editorial).append(", ").append(numero).append(".");
        
        return cita.toString();
    }
}