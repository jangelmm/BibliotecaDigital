/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.Usuario;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Manu Hdz
 */
public interface GestionUsuariosViewInterface {
    void addCrearListener(ActionListener listener);
    void addModificarListener(ActionListener listener);
    void addEliminarListener(ActionListener listener);
    
    // Métodos para que el Controlador actualice la Vista
    void mostrarUsuarios(List<Usuario> usuarios);
    void mostrarMensaje(String mensaje);
    
    // Métodos para que el Controlador obtenga datos de la Vista
    Usuario getUsuarioSeleccionado();
    String pedirNuevoNombreUsuario(String nombreActual);
    boolean confirmarEliminacion(String nombreAutor);
    
    // Métodos para controlar la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
}
