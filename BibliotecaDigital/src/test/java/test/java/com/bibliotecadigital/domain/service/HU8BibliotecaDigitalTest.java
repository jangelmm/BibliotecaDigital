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
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HU8BibliotecaDigitalTest {

    private InMemoryBibliotecaRepository biblioteca;
    private AuthenticationService auth;

    @BeforeEach
    void setUp() {
        biblioteca = new InMemoryBibliotecaRepository();
        auth = new AuthenticationService(biblioteca);
    }

    @Test
    @DisplayName("Prueba de integración: Flujo completo desde registro hasta devolución.")
    void testFlujoCompleto_RegistroHastaDevolucion() {

        // === PASO 1: REGISTRO DE USUARIOS Y MATERIALES ===
        System.out.println("PASO 1: Registrando usuarios y materiales...");
        biblioteca.registrarUsuario("Admin Carlos", "admin@mail.com", "passAdmin", RolUsuario.ADMINISTRADOR);
        biblioteca.registrarUsuario("Cliente Ana", "cliente@mail.com", "passCliente", RolUsuario.CLIENTE);

        Autor autor = biblioteca.registrarAutor(new Autor(0, "Autor Integral"));
        Libro libro = new Libro(0, "Libro Integral", 2025, "/ruta/libro.pdf", "Ed. Test", 150);
        libro.agregarAutor(autor);
        Video video = new Video(0, "Video Integral", 2025, "/ruta/video.mp4", 120, "MP4");
        video.agregarAutor(autor);

        // Simula que el admin registra los materiales
        biblioteca.registrarMaterial(libro);
        biblioteca.registrarMaterial(video);

        assertNotNull(biblioteca.buscarUsuarioPorEmail("admin@mail.com"));
        assertNotNull(biblioteca.buscarMaterialesPorTitulo("Libro Integral").get(0));
        System.out.println("-> OK: Usuarios y materiales registrados.");

        // === PASO 2: LOGIN Y CREACIÓN DE PRÉSTAMO ===
        System.out.println("\nPASO 2: Cliente inicia sesión y realiza un préstamo...");
        Usuario clienteLogueado = auth.login("cliente@mail.com", "passCliente");
        assertNotNull(clienteLogueado);
        
        List<MaterialBiblioteca> materialesAPrestar = List.of(libro, video);
        Prestamo prestamo = biblioteca.crearPrestamo(clienteLogueado, materialesAPrestar);

        assertNotNull(prestamo);
        assertEquals(1, biblioteca.listarPrestamos().size());
        assertFalse(libro.isDisponible(), "El libro debe estar no disponible después del préstamo.");
        assertFalse(video.isDisponible(), "El video debe estar no disponible después del préstamo.");
        System.out.println("-> OK: Préstamo creado exitosamente. Materiales no disponibles.");

        // === PASO 3: DEVOLUCIÓN PARCIAL ===
        System.out.println("\nPASO 3: Cliente realiza una devolución parcial (solo el libro)...");
        boolean devolucionLibro = biblioteca.registrarDevolucion(prestamo, libro);

        assertTrue(devolucionLibro);
        assertTrue(libro.isDisponible(), "El libro devuelto debe estar disponible.");
        assertFalse(video.isDisponible(), "El video no devuelto debe permanecer no disponible.");
        assertNull(prestamo.getFechaDevolucion(), "El préstamo no debe cerrarse tras una devolución parcial.");
        System.out.println("-> OK: Devolución parcial correcta.");

        // === PASO 4: DEVOLUCIÓN COMPLETA ===
        System.out.println("\nPASO 4: Cliente realiza la devolución final (el video)...");
        boolean devolucionVideo = biblioteca.registrarDevolucion(prestamo, video);
        
        assertTrue(devolucionVideo);
        assertTrue(video.isDisponible(), "El video ahora debe estar disponible.");
        assertNotNull(prestamo.getFechaDevolucion(), "El préstamo debe tener fecha de devolución al completarse.");
        System.out.println("-> OK: Devolución completa correcta. Préstamo cerrado.");
        
        System.out.println("\n✅ FLUJO DE INTEGRACIÓN COMPLETADO EXITOSAMENTE.");
    }
}