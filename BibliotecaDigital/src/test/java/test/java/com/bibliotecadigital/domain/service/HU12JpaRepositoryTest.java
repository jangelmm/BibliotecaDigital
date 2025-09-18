package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// 1. Hereda de la clase base
public class HU12JpaRepositoryTest extends BaseJpaTest {

    // 2. El 'repository' y la limpieza de la BD ya no se configuran aquí, se heredan.
    
    @Test
    @DisplayName("Debería registrar un usuario y encontrarlo por email")
    void testRegistrarYBuscarUsuario() {
        // Act
        repository.registrarUsuario(new Usuario("Ana JPA", "ana.jpa@mail.com", "pass123", RolUsuario.CLIENTE));
        Usuario encontrado = repository.buscarUsuarioPorEmail("ana.jpa@mail.com");

        // Assert
        assertNotNull(encontrado);
        assertEquals("Ana JPA", encontrado.getNombre());
    }
    
    @Test
    @DisplayName("Debería crear un préstamo y marcar los materiales como no disponibles")
    void testCrearPrestamoYVerificarDisponibilidad() {
        // Arrange
        repository.registrarUsuario(new Usuario("Beto JPA", "beto.jpa@mail.com", "pass123", RolUsuario.CLIENTE));
        Usuario usuario = repository.buscarUsuarioPorEmail("beto.jpa@mail.com");

        Libro libro = new Libro(0, "Libro para Prestar", 2025, "/ruta/jpa.pdf", "Ed. JPA", 100);
        libro.agregarAutor(new Autor(0, "Autor JPA"));
        repository.registrarMaterial(libro);

        // Act
        repository.crearPrestamo(usuario, List.of(libro));
        
        // Assert
        MaterialBiblioteca materialPrestado = repository.buscarMaterialPorId(libro.getId());
        assertFalse(materialPrestado.isDisponible());
    }
}