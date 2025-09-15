/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HU7BibliotecaDigitalTest {

    private Autor autor;

    @BeforeEach
    void setUp() {
        autor = new Autor(1, "Autor de Prueba");
    }

    @Test
    void testMostrarInformacionLibro() {
        // Arrange
        Libro libro = new Libro(101, "El Gran Libro", 2025, "/libros/gran_libro.pdf", "Editorial Test", 350);
        libro.agregarAutor(autor);
        libro.setDisponible(false); // Para probar el estado

        // Act
        String info = libro.mostrarInformacion();

        // Assert
        assertTrue(info.contains("LIBRO"), "Debe indicar que es un LIBRO.");
        assertTrue(info.contains("Título: El Gran Libro"), "Debe mostrar el título correcto.");
        assertTrue(info.contains("Editorial: Editorial Test"), "Debe mostrar la editorial.");
        assertTrue(info.contains("Disponible: No"), "Debe mostrar el estado 'No disponible'.");
    }

    @Test
    void testMostrarInformacionVideo() {
        // Arrange
        Video video = new Video(202, "El Gran Video", 2024, "/videos/gran_video.mp4", 125.5f, "MP4");
        video.agregarAutor(autor);

        // Act
        String info = video.mostrarInformacion();

        // Assert
        assertTrue(info.contains("VIDEO"), "Debe indicar que es un VIDEO.");
        assertTrue(info.contains("Duración: 125.5 minutos"), "Debe mostrar la duración.");
        assertTrue(info.contains("Formato: MP4"), "Debe mostrar el formato.");
        assertTrue(info.contains("Disponible: Sí"), "Debe mostrar el estado 'Disponible'.");
    }
}