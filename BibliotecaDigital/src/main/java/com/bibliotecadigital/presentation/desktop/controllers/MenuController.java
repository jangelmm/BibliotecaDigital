package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.service.*;
import com.bibliotecadigital.infrastructure.persistence.JpaAutorRepository;
import com.bibliotecadigital.infrastructure.persistence.JpaMaterialRepository;
import com.bibliotecadigital.infrastructure.persistence.JpaPrestamoRepository;
import com.bibliotecadigital.infrastructure.persistence.JpaUsuarioRepository;
import com.bibliotecadigital.presentation.desktop.views.*;
import jakarta.persistence.EntityManagerFactory;
import javax.swing.JFrame;

public class MenuController {

    private final MenuView menuView;
    private final EntityManagerFactory emf;

    public MenuController(MenuView menuView, EntityManagerFactory emf) {
        this.menuView = menuView;
        this.emf = emf;
        
        // Asignar acciones a los botones del menú
        this.menuView.addGestionarAutoresListener(e -> abrirGestionAutores());
        this.menuView.addGestionarMaterialesListener(e -> abrirGestionMateriales());
        this.menuView.addGestionarUsuariosListener(e -> abrirGestionUsuarios());
        this.menuView.addGestionarPrestamosListener(e -> abrirGestionPrestamos());
    }

    private void abrirGestionAutores() {
        AutorRepository autorRepo = new JpaAutorRepository(emf);
        GestionAutoresViewInterface vista = new GestionAutoresView();
        new GestionAutoresController(autorRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana
        vista.getFrame().setSize(1000, 500);
        vista.getFrame().setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    private void abrirGestionMateriales() {
        MaterialRepository materialRepo = new JpaMaterialRepository(emf);
        AutorRepository autorRepo = new JpaAutorRepository(emf);
        GestionMaterialesViewInterface vista = new GestionMaterialesView();
        new GestionMaterialesController(materialRepo, autorRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.getFrame().setSize(1000, 500);
        vista.getFrame().setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    private void abrirGestionUsuarios() {
        UsuarioRepository usuarioRepo = new JpaUsuarioRepository(emf);
        GestionUsuariosViewInterface vista = new GestionUsuariosView();
        new GestionUsuariosController(usuarioRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.getFrame().setSize(1000, 500);
        vista.getFrame().setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    private void abrirGestionPrestamos() {
        PrestamoRepository prestamoRepo = new JpaPrestamoRepository(emf);
        UsuarioRepository usuarioRepo = new JpaUsuarioRepository(emf);
        MaterialRepository materialRepo = new JpaMaterialRepository(emf);
        GestionPrestamosViewInterface vista = new GestionPrestamosView();
        new GestionPrestamosController(prestamoRepo, usuarioRepo, materialRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.getFrame().setSize(1000, 500);
        vista.getFrame().setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}