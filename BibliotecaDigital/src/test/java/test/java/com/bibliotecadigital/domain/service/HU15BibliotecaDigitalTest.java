package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.GestionUsuariosController;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manu hdz
 */
public class HU15BibliotecaDigitalTest {
    public static void main(String[] args) {
        // 1. Crear la Vista
        GestionUsuariosView vista = new GestionUsuariosView();
        // 2. Crear un servicio (puede ser dummy o real)
        BibliotecaService servicio = new InMemoryBibliotecaRepository();
        
        JpaBibliotecaRepository baseDatos = new JpaBibliotecaRepository();

        // 3. Crear el Controlador
        GestionUsuariosController controlador = new GestionUsuariosController(servicio, vista, baseDatos);

        // 4. Mostrar la ventana
        vista.setVisible(true);
    }
}
