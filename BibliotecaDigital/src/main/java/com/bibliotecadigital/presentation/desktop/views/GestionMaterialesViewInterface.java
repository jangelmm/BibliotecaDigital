/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Diego Garcia
 */
public interface GestionMaterialesViewInterface {
    
    // Métodos para que el Controlador registre listeners
    void addNuevoListener(ActionListener listener);
    void addEditarListener(ActionListener listener);
    void addEliminarListener(ActionListener listener);
    
    // Métodos para que el Controlador actualice la Vista
    void mostrarMateriales(List<MaterialBiblioteca> materiales);
    void mostrarMensaje(String mensaje);
    
    // Métodos para que el Controlador obtenga datos de la Vista ---------------
    // Para todos los materiales
    MaterialBiblioteca getMaterialSeleccionado();
    String pedirTipoMaterial();
    String pedirNuevoTituloMaterial(String tituloActual);
    int pedirAnioMaterial();
    String pedirRutaArchivo();
    List<Integer> pedirIdsAutores();
    
    // Para Libro
    String pedirEditorial();
    int pedirNumPaginas();
    
    // Para Revista
    int pedirNumero();
    
    // Para Video y Audio
    float pedirDuracion();
    String pedirFormato();
    // -------------------------------------------------------------------------
    
    boolean confirmarEliminacion(String tituloMaterial);
    
    // Métodos para controlar la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
}
