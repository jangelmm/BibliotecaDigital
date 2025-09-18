/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author jesus
 */

public class HU3BibliotecaDigitalTest {

    private InMemoryBibliotecaRepository biblioteca;
    private Usuario usuario;
    private Libro libro1;
    private Video video1;

    @BeforeEach
    void setUp() {
        biblioteca = new InMemoryBibliotecaRepository();

        // Crear un usuario de prueba
        biblioteca.registrarUsuario(new Usuario("Ana Cliente", "ana@mail.com", "abc123", RolUsuario.CLIENTE));
        usuario = biblioteca.buscarUsuarioPorEmail("ana@mail.com");

        // Crear materiales de prueba
        Autor autor = new Autor(1, "Autor de Prueba");
        libro1 = new Libro(1, "Libro de Prueba", 2025, "/ruta/libro.pdf", "Ed. Prueba", 100);
        libro1.agregarAutor(autor);

        video1 = new Video(2, "Video de Prueba", 2025, "/ruta/video.mp4", 90, "MP4");
        video1.agregarAutor(autor);
        
        biblioteca.registrarMaterial(libro1);
        biblioteca.registrarMaterial(video1);
    }

    @Test
    void testCrearPrestamoExitosoConMultiplesMateriales() {
        // Arrange
        List<MaterialBiblioteca> materialesAPrestar = List.of(libro1, video1);

        // Act
        Prestamo prestamo = biblioteca.crearPrestamo(usuario, materialesAPrestar);

        // Assert
        assertNotNull(prestamo);
        assertEquals(1, prestamo.getId());
        assertEquals(usuario, prestamo.getUsuario());
        assertEquals(2, prestamo.getMateriales().size());
        assertFalse(libro1.isDisponible(), "El libro debería marcarse como no disponible.");
        assertFalse(video1.isDisponible(), "El video debería marcarse como no disponible.");
        assertEquals(1, biblioteca.listarPrestamos().size());
    }

    @Test
    void testCrearPrestamoFallaSiUnMaterialNoEstaDisponible() {
        // Arrange: prestamos el libro primero
        biblioteca.crearPrestamo(usuario, List.of(libro1));
        
        // Act & Assert: intentamos prestar el libro de nuevo junto con el video
        List<MaterialBiblioteca> segundoIntento = List.of(libro1, video1);
        
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            biblioteca.crearPrestamo(usuario, segundoIntento);
        });

        assertEquals("El material 'Libro de Prueba' (ID: 1) no está disponible.", exception.getMessage());
        assertTrue(video1.isDisponible(), "El video debería permanecer disponible ya que el préstamo falló.");
    }
    
    @Test
    void testCrearPrestamoFallaConUsuarioNulo() {
        // Arrange
        List<MaterialBiblioteca> materiales = List.of(libro1);
        
        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.crearPrestamo(null, materiales);
        });
        
        assertEquals("Usuario y lista de materiales no pueden ser nulos o vacíos.", exception.getMessage());
    }
}