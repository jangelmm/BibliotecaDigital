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
import com.formdev.flatlaf.FlatIconColors;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javax.swing.UIManager;

public class BibliotecaDigital {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca-pu");

        
        java.awt.EventQueue.invokeLater(() -> {
            MenuView menu = new MenuView();
            new MenuController(menu, emf);
            menu.setVisible(true);
        });
    }
}