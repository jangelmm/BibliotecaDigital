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
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HU12JpaRepositoryTest {

    private static EntityManagerFactory emf;
    private JpaBibliotecaRepository repository;

    @BeforeAll
    static void setUpAll() {
        // Se crea el EMF una sola vez para todas las pruebas
        emf = Persistence.createEntityManagerFactory("biblioteca-pu");
    }

    @AfterAll
    static void tearDownAll() {
        if (emf != null) {
            emf.close();
        }
    }

    @BeforeEach
    void setUp() {
        // Se crea una nueva instancia del repositorio para cada test
        repository = new JpaBibliotecaRepository();
        // Limpiar la base de datos antes de cada prueba para asegurar el aislamiento
        clearDatabase();
    }
    
    private void clearDatabase() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Prestamo").executeUpdate();
        em.createQuery("DELETE FROM MaterialBiblioteca").executeUpdate();
        em.createQuery("DELETE FROM Autor").executeUpdate();
        em.createQuery("DELETE FROM Usuario").executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

    @Test
    @DisplayName("Debería registrar un usuario y encontrarlo por email")
    void testRegistrarYBuscarUsuario() {
        // Act
        boolean registrado = repository.registrarUsuario("Ana JPA", "ana.jpa@mail.com", "pass123", RolUsuario.CLIENTE);
        Usuario encontrado = repository.buscarUsuarioPorEmail("ana.jpa@mail.com");

        // Assert
        assertTrue(registrado);
        assertNotNull(encontrado);
        assertEquals("Ana JPA", encontrado.getNombre());
    }
    
    @Test
    @DisplayName("Debería crear un préstamo y marcar los materiales como no disponibles")
    void testCrearPrestamoYVerificarDisponibilidad() {
        // Arrange
        repository.registrarUsuario("Beto JPA", "beto.jpa@mail.com", "pass123", RolUsuario.CLIENTE);
        Usuario usuario = repository.buscarUsuarioPorEmail("beto.jpa@mail.com");

        Libro libro = new Libro(0, "Libro para Prestar", 2025, "/ruta/jpa.pdf", "Ed. JPA", 100);
        libro.agregarAutor(new Autor(0, "Autor JPA"));
        repository.registrarMaterial(libro);

        // Act
        repository.crearPrestamo(usuario, List.of(libro));
        
        // Assert
        MaterialBiblioteca materialPrestado = repository.buscarMaterialPorId(libro.getId());
        assertFalse(materialPrestado.isDisponible(), "El material debería estar marcado como no disponible en la BD.");
        assertEquals(1, repository.listarPrestamos().size(), "Debería haber un préstamo registrado.");
    }
}