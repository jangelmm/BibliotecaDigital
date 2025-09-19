/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.service.AutorRepository;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;

public class GestionAutoresController {

    private final AutorRepository autorRepo;
    private final GestionAutoresViewInterface vista;

    public GestionAutoresController(AutorRepository autorRepo, GestionAutoresViewInterface vista) {
        this.autorRepo = autorRepo;
        this.vista = vista;
        
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addNuevoListener(e -> crearNuevoAutor());
        this.vista.addEditarListener(e -> editarAutorSeleccionado());
        this.vista.addEliminarListener(e -> eliminarAutorSeleccionado());
        
        // Cargar los datos iniciales
        cargarAutores();
    }

    public void cargarAutores() {
        vista.mostrarAutores(autorRepo.findAll());
    }

    public void crearNuevoAutor() {
        String nombre = vista.pedirNuevoNombreAutor("");
        if (nombre != null && !nombre.trim().isEmpty()) {
            autorRepo.save(new Autor(0, nombre));
            cargarAutores(); // Refrescar la tabla
            vista.mostrarMensaje("Autor creado exitosamente.");
        }
    }

    public void editarAutorSeleccionado() {
        Autor autorSeleccionado = vista.getAutorSeleccionado();
        if (autorSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un autor para editar.");
            return;
        }
        
        String nuevoNombre = vista.pedirNuevoNombreAutor(autorSeleccionado.getNombre());
        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            autorSeleccionado.setNombre(nuevoNombre);
            autorRepo.save(autorSeleccionado);
            cargarAutores(); // Refrescar la tabla
            vista.mostrarMensaje("Autor actualizado exitosamente.");
        }
    }

    public void eliminarAutorSeleccionado() {
        Autor autorSeleccionado = vista.getAutorSeleccionado();
        if (autorSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un autor para eliminar.");
            return;
        }

        if (vista.confirmarEliminacion(autorSeleccionado.getNombre())) {
            try {
                autorRepo.deleteById(autorSeleccionado.getId());
                cargarAutores(); // Refrescar la tabla
                vista.mostrarMensaje("Autor eliminado exitosamente.");
            } catch (Exception e) {
                // Manejar el caso de que un autor no se pueda borrar por tener libros asociados
                vista.mostrarMensaje("Error: No se puede eliminar el autor, probablemente tiene materiales asociados.");
            }
        }
    }
}