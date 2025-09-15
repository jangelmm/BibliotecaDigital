/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecadigital;

/**
 *
 * @author jesus
 */

// --- IMPORTS NECESARIOS ---
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.GestionAutoresController;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresView; // <-- Asegúrate de importar la clase concreta
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;

public class BibliotecaDigital {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            // 1. Instanciar el Repositorio (Modelo)
            BibliotecaService servicio = new JpaBibliotecaRepository();

            // 2. Instanciar la Vista
            // Se crea un objeto de la clase CONCRETA (GestionAutoresView)...
            // ...y se asigna a una variable del tipo de la INTERFAZ.
            // Esta es la mejor práctica.
            GestionAutoresViewInterface vistaAutores = new GestionAutoresView();

            // 3. Instanciar el Controlador, inyectando Modelo y Vista
            new GestionAutoresController(servicio, vistaAutores);

            // 4. Hacer visible la GUI
            // El método setVisible debe ser parte de tu interfaz
            vistaAutores.setVisible(true); 
        });
    }
}