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
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HU4BibliotecaDigitalTest {

    private InMemoryBibliotecaRepository biblioteca;
    private Usuario usuario;
    private Libro libro;
    private Video video;
    private Prestamo prestamo;

    @BeforeEach
    void setUp() {
        biblioteca = new InMemoryBibliotecaRepository();
        
        // Crear usuario y materiales
        biblioteca.registrarUsuario("Ana Cliente", "ana@mail.com", "abc123", RolUsuario.CLIENTE);
        usuario = biblioteca.buscarUsuarioPorEmail("ana@mail.com");

        Autor autor = new Autor(1, "Autor de Prueba");
        libro = new Libro(1, "Libro a Devolver", 2025, "/ruta/libro.pdf", "Ed. Prueba", 100);
        libro.agregarAutor(autor);
        
        video = new Video(2, "Video a Devolver", 2025, "/ruta/video.mp4", 90, "MP4");
        video.agregarAutor(autor);

        biblioteca.registrarMaterial(libro);
        biblioteca.registrarMaterial(video);
        
        // Crear un préstamo con ambos materiales
        prestamo = biblioteca.crearPrestamo(usuario, List.of(libro, video));
    }

    @Test
    void testDevolucionParcialExitosa() {
        // Act: Devolver solo el libro
        boolean resultado = biblioteca.registrarDevolucion(prestamo, libro);

        // Assert
        assertTrue(resultado, "La devolución debería ser exitosa.");
        assertTrue(libro.isDisponible(), "El libro devuelto debe estar disponible.");
        assertFalse(video.isDisponible(), "El video no devuelto debe seguir no disponible.");
        assertNull(prestamo.getFechaDevolucion(), "El préstamo no debe cerrarse en una devolución parcial.");
    }

    @Test
    void testDevolucionCompletaCierraElPrestamo() {
        // Act: Devolver ambos materiales
        biblioteca.registrarDevolucion(prestamo, libro);
        biblioteca.registrarDevolucion(prestamo, video);
        
        // Assert
        assertTrue(libro.isDisponible(), "El libro devuelto debe estar disponible.");
        assertTrue(video.isDisponible(), "El video devuelto debe estar disponible.");
        assertNotNull(prestamo.getFechaDevolucion(), "El préstamo debe tener una fecha de devolución al completarse.");
    }

    @Test
    void testDevolucionFallaSiMaterialNoPerteneceAlPrestamo() {
        // Arrange: Crear un material extra que no está en el préstamo
        Revista revista = new Revista(3, "Revista Aparte", 2025, "/ruta/revista.pdf", "Ed. Otra", 10);
        revista.agregarAutor(new Autor(2, "Otro Autor"));
        biblioteca.registrarMaterial(revista);

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.registrarDevolucion(prestamo, revista);
        });
        
        assertEquals("El material no pertenece al préstamo especificado.", exception.getMessage());
    }

    @Test
    void testDevolucionFallaSiMaterialYaFueDevuelto() {
        // Arrange: Devolvemos el libro una vez
        biblioteca.registrarDevolucion(prestamo, libro);
        
        // Act & Assert: Intentamos devolverlo de nuevo
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            biblioteca.registrarDevolucion(prestamo, libro);
        });
        
        assertEquals("El material 'Libro a Devolver' ya figura como disponible.", exception.getMessage());
    }
}