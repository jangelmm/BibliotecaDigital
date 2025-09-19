package com.bibliotecadigital.presentation.desktop.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuView extends JFrame {

    private JButton btnGestionarAutores;
    private JButton btnGestionarMateriales;
    private JButton btnGestionarUsuarios;
    private JButton btnGestionarPrestamos;

    public MenuView() {
        setTitle("Biblioteca Digital - Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10)); // 4 filas, 1 columna

        btnGestionarAutores = new JButton("Gestionar Autores");
        btnGestionarMateriales = new JButton("Gestionar Materiales");
        btnGestionarUsuarios = new JButton("Gestionar Usuarios");
        btnGestionarPrestamos = new JButton("Gestionar Préstamos");

        add(btnGestionarAutores);
        add(btnGestionarMateriales);
        add(btnGestionarUsuarios);
        add(btnGestionarPrestamos);
    }
    
    // Métodos para que el controlador añada los listeners
    public void addGestionarAutoresListener(ActionListener listener) {
        btnGestionarAutores.addActionListener(listener);
    }
    public void addGestionarMaterialesListener(ActionListener listener) {
        btnGestionarMateriales.addActionListener(listener);
    }
    public void addGestionarUsuariosListener(ActionListener listener) {
        btnGestionarUsuarios.addActionListener(listener);
    }
    public void addGestionarPrestamosListener(ActionListener listener) {
        btnGestionarPrestamos.addActionListener(listener);
    }
}