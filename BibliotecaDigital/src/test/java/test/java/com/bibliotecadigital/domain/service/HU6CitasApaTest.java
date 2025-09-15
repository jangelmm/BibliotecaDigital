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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HU6CitasApaTest {

    @Test
    void testCitaApaLibroUnAutor() {
        // Arrange
        Autor autor = new Autor(1, "Gabriel García Márquez");
        Libro libro = new Libro(101, "Cien años de soledad", 1967, "ruta", "Editorial Sudamericana", 496);
        libro.agregarAutor(autor);
        
        // Act
        String cita = libro.generarCitaAPA();
        
        // Assert
        assertEquals("García Márquez, G. (1967). Cien años de soledad. Editorial Sudamericana.", cita);
    }

    @Test
    void testCitaApaLibroMultiplesAutores() {
        // Arrange
        Autor autor1 = new Autor(1, "Erich Gamma");
        Autor autor2 = new Autor(2, "Richard Helm");
        Libro libro = new Libro(102, "Design Patterns", 1994, "ruta", "Addison-Wesley", 395);
        libro.agregarAutor(autor1);
        libro.agregarAutor(autor2);

        // Act
        String cita = libro.generarCitaAPA();

        // Assert
        assertEquals("Gamma, E. et al. (1994). Design Patterns. Addison-Wesley.", cita);
    }
    
    @Test
    void testCitaApaVideo() {
        // Arrange
        Autor autor = new Autor(1, "Steven Spielberg");
        Video video = new Video(201, "Jurassic Park", 1993, "ruta", 127, "MP4");
        video.agregarAutor(autor);

        // Act
        String cita = video.generarCitaAPA();
        
        // Assert
        assertEquals("Spielberg, S. (1993). Jurassic Park [Video].", cita);
    }
}