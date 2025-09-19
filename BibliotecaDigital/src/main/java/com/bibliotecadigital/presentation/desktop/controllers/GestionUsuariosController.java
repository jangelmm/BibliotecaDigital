/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosView;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosViewInterface;
import com.bibliotecadigital.domain.service.UsuarioRepository;
import java.util.List;

/**
 *
 * @author Manu Hdz
 */
public class GestionUsuariosController {
    private final UsuarioRepository usuarioRepo; // <-- Cambia a la interfaz específica
    private final GestionUsuariosViewInterface vista;

    public GestionUsuariosController(UsuarioRepository usuarioRepo, GestionUsuariosViewInterface vista) {
        this.usuarioRepo = usuarioRepo;
        this.vista = vista;
        
        this.vista.addCrearListener(e -> crearUsuario());
        this.vista.addModificarListener(e -> modificarUsuario());
        this.vista.addEliminarListener(e -> eliminarUsuario());
        
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        vista.mostrarUsuarios(usuarioRepo.findAll()); // Usa el nuevo repositorio
    }
    
    private void eliminarUsuario() {
        Usuario seleccionado = vista.getUsuarioSeleccionado();

    if (seleccionado != null && vista.confirmarEliminacion(seleccionado.getNombre())) {
        // Llamamos al servicio para eliminar de la BD
        usuarioRepo.delete(seleccionado);

        // Refrescamos la tabla
        cargarUsuarios();

        vista.mostrarMensaje("Usuario eliminado correctamente.");
    } else {
        vista.mostrarMensaje("Seleccione un usuario para eliminar.");
    }
    }
    
    private void crearUsuario() {
        GestionUsuariosView.NuevoUsuarioDialog dialog = ((GestionUsuariosView) vista).new NuevoUsuarioDialog(vista.getFrame());
        dialog.setVisible(true);

        Usuario nuevo = dialog.getUsuarioCreado();
        if (nuevo != null) {
            try {

                usuarioRepo.save(nuevo);

                vista.mostrarMensaje("Usuario agregado correctamente");
                cargarUsuarios(); // refresca tabla desde BD

            } catch (Exception ex) {
                // Capturar excepciones de la BD, como un email duplicado
                vista.mostrarMensaje("No se pudo agregar usuario. ¿Email duplicado? Error: " + ex.getMessage());
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
                usuarioRepo.save(editado);

                // Refrescamos la tabla
                cargarUsuarios();

                vista.mostrarMensaje("Usuario actualizado correctamente.");
            }
        } else {
            vista.mostrarMensaje("Seleccione un usuario para modificar.");
        }
    }
    
}
