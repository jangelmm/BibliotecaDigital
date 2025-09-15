/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

public interface GestionAutoresViewInterface {
    
    // Métodos para que el Controlador registre listeners
    void addNuevoListener(ActionListener listener);
    void addEditarListener(ActionListener listener);
    void addEliminarListener(ActionListener listener);
    
    // Métodos para que el Controlador actualice la Vista
    void mostrarAutores(List<Autor> autores);
    void mostrarMensaje(String mensaje);
    
    // Métodos para que el Controlador obtenga datos de la Vista
    Autor getAutorSeleccionado();
    String pedirNuevoNombreAutor(String nombreActual);
    boolean confirmarEliminacion(String nombreAutor);
    
    // Métodos para controlar la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
}