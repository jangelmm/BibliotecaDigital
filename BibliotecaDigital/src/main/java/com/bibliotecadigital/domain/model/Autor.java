/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// En: src/main/java/com/bibliotecadigital/domain/model/Autor.java

package com.bibliotecadigital.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity // <-- 1. Anotación para decirle a JPA que esta clase es una tabla
public class Autor {

    @Id // <-- 2. Anotación para marcar el campo 'id' como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Le dice a la BD que genere el ID automáticamente
    private int id;
    
    private String nombre;
    
    public Autor() {
        // <-- 4. Constructor vacío, OBLIGATORIO para JPA
    }
    
    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    // Getters y setters (sin cambios)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    // equals, hashCode y toString (sin cambios)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return id == autor.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}