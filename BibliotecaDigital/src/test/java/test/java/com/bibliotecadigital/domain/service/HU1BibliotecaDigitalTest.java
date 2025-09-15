package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.MaterialController;

public class HU1BibliotecaDigitalTest {
    public static void main(String[] args) {
        // Tu código de demostración aquí
        BibliotecaService servicio = new InMemoryBibliotecaRepository();
        MaterialController controlador = new MaterialController(servicio);

        // Registrar autores
        Autor autor1 = controlador.registrarAutor(new Autor(0, "Gabriel García Márquez"));
        Autor autor2 = controlador.registrarAutor(new Autor(0, "Mario Vargas Llosa"));

        // Registrar un libro
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor1);

        Libro registrado = (Libro) controlador.registrarMaterial(libro);
        System.out.println("Libro registrado: " + registrado.getTitulo());

        // Resto del código...
    }
}