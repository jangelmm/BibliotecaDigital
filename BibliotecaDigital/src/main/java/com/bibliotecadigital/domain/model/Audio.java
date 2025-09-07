/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

public class Audio extends MaterialBiblioteca {
    private float duracion;
    private String formato;
    
    public Audio(int id, String titulo, int anio, String rutaArchivo, 
                 float duracion, String formato) {
        super(id, titulo, anio, rutaArchivo);
        this.duracion = duracion;
        this.formato = formato;
    }
    
    // Getters y setters específicos
    public float getDuracion() { return duracion; }
    public void setDuracion(float duracion) { this.duracion = duracion; }
    
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    
    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("AUDIO\n");
        info.append("ID: ").append(id).append("\n");
        info.append("Título: ").append(titulo).append("\n");
        info.append("Año: ").append(anio).append("\n");
        info.append("Autores: ").append(autores).append("\n");
        info.append("Duración: ").append(duracion).append(" minutos\n");
        info.append("Formato: ").append(formato).append("\n");
        info.append("Ruta de archivo: ").append(rutaArchivo).append("\n");
        info.append("Disponible: ").append(disponible ? "Sí" : "No").append("\n");
        return info.toString();
    }
    
    @Override
    public String generarCitaAPA() {
        if (autores.isEmpty()) {
            return titulo + " [" + formato + "]. (" + anio + ").";
        }
        
        StringBuilder cita = new StringBuilder();
        cita.append(autores.get(0).getNombre());
        
        if (autores.size() > 1) {
            cita.append(" et al.");
        }
        
        cita.append(" (").append(anio).append("). ");
        cita.append(titulo).append(" [").append(formato).append("].");
        
        return cita.toString();
    }
}