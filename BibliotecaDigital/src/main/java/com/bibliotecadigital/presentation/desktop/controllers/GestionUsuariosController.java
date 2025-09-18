/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosView;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosViewInterface;
import java.util.List;

/**
 *
 * @author Manu Hdz
 */
public class GestionUsuariosController {
    private final BibliotecaService servicio;
    private final JpaBibliotecaRepository baseDatos;
    private final GestionUsuariosViewInterface vista;

    public GestionUsuariosController(BibliotecaService servicio, GestionUsuariosViewInterface vista, JpaBibliotecaRepository baseDatos) {
        this.servicio = servicio;
        this.vista = vista;
        this.baseDatos = baseDatos;
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addCrearListener(e -> crearUsuario());
        this.vista.addModificarListener(e -> modificarUsuario());
        this.vista.addEliminarListener(e -> eliminarUsuario());
        
        // Cargar los datos iniciales
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        List<Usuario> usuarios = baseDatos.listarUsuarios();  // 🔹 Obtiene desde la BD
        vista.mostrarUsuarios(usuarios);                     // 🔹 Muestra en la tabla
    }
    
    private void eliminarUsuario() {
        Usuario seleccionado = vista.getUsuarioSeleccionado();

    if (seleccionado != null && vista.confirmarEliminacion(seleccionado.getNombre())) {
        // Llamamos al servicio para eliminar de la BD
        baseDatos.eliminarUsuario(seleccionado);

        // Refrescamos la tabla
        cargarUsuarios();

        vista.mostrarMensaje("Usuario eliminado correctamente.");
    } else {
        vista.mostrarMensaje("Seleccione un usuario para eliminar.");
    }
    }
    
    private void crearUsuario() {
        GestionUsuariosView.NuevoUsuarioDialog dialog = ((GestionUsuariosView) vista).new NuevoUsuarioDialog(vista.getFrame());
        
        dialog.setVisible(true); // bloquea hasta cerrar

        Usuario nuevo = dialog.getUsuarioCreado();
        if(nuevo != null) {
            boolean agregado = false;
            try {
                agregado = baseDatos.registrarUsuario(nuevo);
            } catch(Exception ex) {
                vista.mostrarMensaje("Error al agregar usuario: " + ex.getMessage());
            }

            if(agregado) {
                vista.mostrarMensaje("Usuario agregado correctamente");
                cargarUsuarios(); // refresca tabla desde BD
            } else {
                vista.mostrarMensaje("No se pudo agregar usuario. ¿Email duplicado?");
            }
        }
    }
    private void modificarUsuario() {
        Usuario seleccionado = vista.getUsuarioSeleccionado();
        if (seleccionado != null) {
            // Abrimos el diálogo de edición
            GestionUsuariosView.EditarUsuarioDialog dialog = ((GestionUsuariosView) vista).new EditarUsuarioDialog(vista.getFrame(), seleccionado);
            dialog.setVisible(true);

            // Si el usuario guardó los cambios
            Usuario editado = dialog.getUsuarioEditado();
            if (editado != null) {
                // Actualizamos en la BD
                baseDatos.actualizarUsuario(editado);

                // Refrescamos la tabla
                cargarUsuarios();

                vista.mostrarMensaje("Usuario actualizado correctamente.");
            }
        } else {
            vista.mostrarMensaje("Seleccione un usuario para modificar.");
        }
    }
    
}
