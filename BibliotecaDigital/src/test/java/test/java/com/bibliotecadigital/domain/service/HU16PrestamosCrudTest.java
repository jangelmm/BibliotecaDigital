/*

Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package test.java.com.bibliotecadigital.domain.service;
import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.GestionPrestamosController;
import com.bibliotecadigital.presentation.desktop.views.GestionPrestamosView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**

Clase de prueba para la gestión de préstamos

Esta clase crea datos de ejemplo y lanza la interfaz de gestión de préstamos

para probar su funcionamiento de manera independiente
*/
public class HU16PrestamosCrudTest {

public static void main(String[] args) {
// Configurar el Look and Feel del sistema
try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
e.printStackTrace();
}

// Crear instancia del repositorio en memoria
BibliotecaService servicio = new InMemoryBibliotecaRepository();

// Cargar datos de prueba
cargarDatosPrueba(servicio);

// Iniciar la interfaz gráfica en el hilo de eventos de Swing
SwingUtilities.invokeLater(() -> {
// Crear la vista de gestión de préstamos
GestionPrestamosView vistaPrestamos = new GestionPrestamosView();

// Crear el controlador y conectarlo con la vista
GestionPrestamosController controller = new GestionPrestamosController(servicio, vistaPrestamos);
vistaPrestamos.setController(controller);

// Mostrar la ventana
vistaPrestamos.setVisible(true);
});
}

/**

Carga datos de prueba en el repositorio

@param servicio Servicio de biblioteca donde cargar los datos
*/
private static void cargarDatosPrueba(BibliotecaService servicio) {
    // Crear algunos autores
    Autor autor1 = new Autor(0, "Gabriel García Márquez");
    Autor autor2 = new Autor(0, "Isabel Allende");
    Autor autor3 = new Autor(0, "Jorge Luis Borges");

    servicio.registrarAutor(autor1);
    servicio.registrarAutor(autor2);
    servicio.registrarAutor(autor3);

    // Crear algunos materiales con los constructores correctos
    Libro libro1 = new Libro(0, "Cien años de soledad", 1967, "/ruta/cien_anios.pdf",
    "Editorial Sudamericana", 471);
    libro1.agregarAutor(autor1);

    Libro libro2 = new Libro(0, "La casa de los espíritus", 1982, "/ruta/casa_espiritus.pdf",
    "Plaza & Janés", 442);
    libro2.agregarAutor(autor2);

    // Constructor correcto para Revista: id, titulo, anio, rutaArchivo, editorial, numero
    Revista revista1 = new Revista(0, "El Aleph", 1945, "/ruta/aleph.pdf",
    "Editorial Sur", 5);
    revista1.agregarAutor(autor3);

    servicio.registrarMaterial(libro1);
    servicio.registrarMaterial(libro2);
    servicio.registrarMaterial(revista1);

    // Crear algunos usuarios con los roles correctos: ADMINISTRADOR, CLIENTE, ENCARGADO
    servicio.registrarUsuario("Admin", "admin@biblioteca.com", "admin123", RolUsuario.ADMINISTRADOR);
    servicio.registrarUsuario("Juan Pérez", "juan@ejemplo.com", "clave123", RolUsuario.CLIENTE);
    servicio.registrarUsuario("Ana García", "ana@ejemplo.com", "clave456", RolUsuario.ENCARGADO);

    // Crear un préstamo para mostrar en la interfaz
    Usuario usuario = servicio.buscarUsuarioPorEmail("juan@ejemplo.com");
    List<MaterialBiblioteca> materialesPrestamo = new ArrayList<>();
    materialesPrestamo.add(libro1);

    if (usuario != null) {
    servicio.crearPrestamo(usuario, materialesPrestamo);
    }

    }

}