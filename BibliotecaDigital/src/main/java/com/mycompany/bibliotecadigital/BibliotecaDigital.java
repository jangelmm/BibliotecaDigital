/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecadigital;

/**
 *
 * @author jesus
 */
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;

public class BibliotecaDigital {

    public static void main(String[] args) {
        // Ahora la aplicación arranca con el repositorio que usa la base de datos
        BibliotecaService servicio = new JpaBibliotecaRepository();
        
        System.out.println("¡Sistema de Biblioteca Digital iniciado con persistencia en base de datos!");
        
        // Aquí iría la inicialización de la GUI (HU-13 en adelante)
        // Ejemplo:
        // GestionMaterialesView vista = new GestionMaterialesView();
        // GestionMaterialesController controlador = new GestionMaterialesController(servicio, vista);
        // vista.setVisible(true);
    }
}
