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
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;

public class GestionAutoresController {

    private final BibliotecaService servicio;
    private final GestionAutoresViewInterface vista;

    public GestionAutoresController(BibliotecaService servicio, GestionAutoresViewInterface vista) {
        this.servicio = servicio;
        this.vista = vista;
        
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addNuevoListener(e -> crearNuevoAutor());
        this.vista.addEditarListener(e -> editarAutorSeleccionado());
        this.vista.addEliminarListener(e -> eliminarAutorSeleccionado());
        
        // Cargar los datos iniciales
        cargarAutores();
    }

    public void cargarAutores() {
        vista.mostrarAutores(servicio.listarAutores());
    }

    public void crearNuevoAutor() {
        String nombre = vista.pedirNuevoNombreAutor("");
        if (nombre != null && !nombre.trim().isEmpty()) {
            servicio.registrarAutor(new Autor(0, nombre));
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
            servicio.actualizarAutor(autorSeleccionado);
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
                servicio.eliminarAutor(autorSeleccionado.getId());
                cargarAutores(); // Refrescar la tabla
                vista.mostrarMensaje("Autor eliminado exitosamente.");
            } catch (Exception e) {
                // Manejar el caso de que un autor no se pueda borrar por tener libros asociados
                vista.mostrarMensaje("Error: No se puede eliminar el autor, probablemente tiene materiales asociados.");
            }
        }
    }
}