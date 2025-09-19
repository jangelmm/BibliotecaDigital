/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecadigital;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.presentation.desktop.controllers.MenuController;
import com.bibliotecadigital.presentation.desktop.views.MenuView;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BibliotecaDigital {

    public static void main(String[] args) {
        // 1. El EntityManagerFactory se crea UNA SOLA VEZ
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca-pu");

        // 2. Lanzar la aplicación GUI
        java.awt.EventQueue.invokeLater(() -> {
            // 3. Instanciar la Vista del Menú
            MenuView menu = new MenuView();

            // 4. Instanciar el Controlador del Menú, pasándole el EMF
            new MenuController(menu, emf);

            // 5. Hacer visible el Menú
            menu.setVisible(true);
        });
    }
}