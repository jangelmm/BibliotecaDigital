/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BibliotecaServiceTest {
    private InMemoryBibliotecaRepository bibliotecaService;
    
    @BeforeEach
    void setUp() {
        bibliotecaService = new InMemoryBibliotecaRepository();
    }
    
    @Test
    void testRegistrarMaterialValido() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        Libro registrado = (Libro) bibliotecaService.registrarMaterial(libro);
        
        assertNotNull(registrado);
        assertTrue(registrado.getId() > 0);
        assertEquals("Cien años de soledad", registrado.getTitulo());
        assertEquals(1967, registrado.getAnio());
        assertEquals("/ruta/cien-anios-soledad.pdf", registrado.getRutaArchivo());
        assertEquals("Editorial Sudamericana", registrado.getEditorial());
        assertEquals(432, registrado.getNumPaginas());
        assertTrue(registrado.isDisponible());
    }
    
    @Test
    void testRegistrarMaterialInvalido() {
        // Libro sin título (debería fallar)
        Libro libro = new Libro(0, "", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        
        assertThrows(IllegalArgumentException.class, () -> {
            bibliotecaService.registrarMaterial(libro);
        });
    }
    
    @Test
    void testRegistrarMaterialConMultiplesAutores() {
        Autor autor1 = new Autor(1, "Gabriel García Márquez");
        Autor autor2 = new Autor(2, "Mario Vargas Llosa");
        bibliotecaService.registrarAutor(autor1);
        bibliotecaService.registrarAutor(autor2);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor1);
        libro.agregarAutor(autor2);
        
        Libro registrado = (Libro) bibliotecaService.registrarMaterial(libro);
        
        assertNotNull(registrado);
        assertEquals(2, registrado.getAutores().size());
        assertTrue(registrado.getAutores().contains(autor1));
        assertTrue(registrado.getAutores().contains(autor2));
    }
    
    @Test
    void testBuscarMaterialPorId() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        Libro registrado = (Libro) bibliotecaService.registrarMaterial(libro);
        int id = registrado.getId();
        
        MaterialBiblioteca encontrado = bibliotecaService.buscarMaterialPorId(id);
        
        assertNotNull(encontrado);
        assertEquals(id, encontrado.getId());
        assertEquals("Cien años de soledad", encontrado.getTitulo());
    }
    
    @Test
    void testBuscarMaterialPorTitulo() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        bibliotecaService.registrarMaterial(libro);
        
        List<MaterialBiblioteca> resultados = bibliotecaService.buscarMaterialesPorTitulo("soledad");
        
        assertFalse(resultados.isEmpty());
        assertEquals("Cien años de soledad", resultados.get(0).getTitulo());
    }
    
    @Test
    void testBuscarMaterialPorAutor() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        bibliotecaService.registrarMaterial(libro);
        
        List<MaterialBiblioteca> resultados = bibliotecaService.buscarMaterialesPorAutor("García");
        
        assertFalse(resultados.isEmpty());
        assertEquals("Cien años de soledad", resultados.get(0).getTitulo());
    }
    
    @Test
    void testListarMateriales() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro1 = new Libro(0, "Cien años de soledad", 1967, 
                                "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro1.agregarAutor(autor);
        
        Libro libro2 = new Libro(0, "El amor en los tiempos del cólera", 1985, 
                                "/ruta/amor-tiempos-colera.pdf", "Editorial Oveja Negra", 368);
        libro2.agregarAutor(autor);
        
        bibliotecaService.registrarMaterial(libro1);
        bibliotecaService.registrarMaterial(libro2);
        
        List<MaterialBiblioteca> materiales = bibliotecaService.listarMateriales();
        
        assertEquals(2, materiales.size());
    }
    
    @Test
    void testRegistrarAutor() {
        Autor autor = new Autor(0, "Gabriel García Márquez");
        Autor registrado = bibliotecaService.registrarAutor(autor);
        
        assertNotNull(registrado);
        assertTrue(registrado.getId() > 0);
        assertEquals("Gabriel García Márquez", registrado.getNombre());
    }
    
    @Test
    void testBuscarAutorPorId() {
        Autor autor = new Autor(0, "Gabriel García Márquez");
        Autor registrado = bibliotecaService.registrarAutor(autor);
        int id = registrado.getId();
        
        Autor encontrado = bibliotecaService.buscarAutorPorId(id);
        
        assertNotNull(encontrado);
        assertEquals(id, encontrado.getId());
        assertEquals("Gabriel García Márquez", encontrado.getNombre());
    }
    
    @Test
    void testListarAutores() {
        Autor autor1 = new Autor(0, "Gabriel García Márquez");
        Autor autor2 = new Autor(0, "Mario Vargas Llosa");
        
        bibliotecaService.registrarAutor(autor1);
        bibliotecaService.registrarAutor(autor2);
        
        List<Autor> autores = bibliotecaService.listarAutores();
        
        assertEquals(2, autores.size());
    }
}