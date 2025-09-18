/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

/**
 * Interfaz que define los métodos que debe implementar la vista para la gestión de préstamos.
 */
public interface GestionPrestamosViewInterface {
    
    // Métodos para registrar listeners
    void addNuevoPrestamoListener(ActionListener listener);
    void addFinalizarPrestamoListener(ActionListener listener);
    void addRefrescarListener(ActionListener listener);
    
    // Métodos para actualizar la vista
    void mostrarPrestamos(List<Prestamo> prestamos);
    void mostrarMensaje(String mensaje);
    void mostrarError(String mensaje);
    
    // Métodos para obtener información
    Prestamo getPrestamoSeleccionado();
    
    // Métodos para diálogos de préstamo
    void abrirDialogoNuevoPrestamo();
    boolean confirmarFinalizacionPrestamo(Prestamo prestamo);
    
    // Métodos de control de la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
    void actualizarListaPrestamos();
}