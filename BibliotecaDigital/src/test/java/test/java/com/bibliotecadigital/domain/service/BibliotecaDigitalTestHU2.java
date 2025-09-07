package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.MaterialController;
import java.util.List;
import java.util.Scanner;

public class BibliotecaDigitalTestHU2 {
    private static MaterialController controlador;

    public static void main(String[] args) {
        BibliotecaService servicio = new InMemoryBibliotecaRepository();
        controlador = new MaterialController(servicio);
        cargarDatosDePrueba();
        iniciarMenu();
    }

    private static void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n== BÚSQUEDA EN BIBLIOTECA ==");
            System.out.println("1. Buscar por Título");
            System.out.println("2. Buscar por Autor");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
                switch (opcion) {
                    case 1 -> buscarPorTitulo(scanner);
                    case 2 -> buscarPorAutor(scanner);
                    case 3 -> System.out.println("Programa terminado");
                    default -> System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
        scanner.close();
    }

    private static void buscarPorTitulo(Scanner scanner) {
        System.out.print("Ingrese título: ");
        String titulo = scanner.nextLine().trim();
        List<MaterialBiblioteca> resultados = controlador.buscarMaterialesPorTitulo(titulo);
        mostrarResultados(resultados);
    }

    private static void buscarPorAutor(Scanner scanner) {
        System.out.print("Ingrese autor: ");
        String autor = scanner.nextLine().trim();
        List<MaterialBiblioteca> resultados = controlador.buscarMaterialesPorAutor(autor);
        mostrarResultados(resultados);
    }

    private static void mostrarResultados(List<MaterialBiblioteca> resultados) {
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron resultados");
            return;
        }

        System.out.println("\nResultados encontrados: " + resultados.size());
        for (MaterialBiblioteca material : resultados) {
            System.out.println("------------------");
            System.out.println(material.mostrarInformacion());
        }
    }

    private static void cargarDatosDePrueba() {
        // Autores
        Autor garcia = controlador.registrarAutor(new Autor(0, "Gabriel García Márquez"));
        Autor beethoven = controlador.registrarAutor(new Autor(0, "Ludwig van Beethoven"));
        Autor natgeo = controlador.registrarAutor(new Autor(0, "National Geographic"));
        Autor spielberg = controlador.registrarAutor(new Autor(0, "Steven Spielberg"));

        // 1. Libros
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/libros/cien_anios.pdf", "Sudamericana", 496);
        libro.agregarAutor(garcia);
        controlador.registrarMaterial(libro);

        // 2. Revistas
        Revista revista1 = new Revista(0, "National Geographic: Amazonas", 2023, 
                                     "/revistas/natgeo_2023.pdf", "National Geographic", 1);
        revista1.agregarAutor(natgeo);
        controlador.registrarMaterial(revista1);

        Revista revista2 = new Revista(0, "Cien maravillas del mundo", 2023, 
                                     "/revistas/maravillas.pdf", "Discovery", 12);
        revista2.agregarAutor(natgeo);
        controlador.registrarMaterial(revista2);

        // 3. Videos
        Video video1 = new Video(0, "Jurassic Park", 1993, 
                                "/videos/jurassic.mp4", 127, "MP4");
        video1.agregarAutor(spielberg);
        controlador.registrarMaterial(video1);

        Video video2 = new Video(0, "Cien años de cine", 2020, 
                                "/videos/historia_cine.mp4", 180, "MP4");
        video2.agregarAutor(spielberg);
        controlador.registrarMaterial(video2);

        // 4. Audios
        Audio audio1 = new Audio(0, "Sinfonía No. 5", 1808, 
                                "/audios/sinfonia5.mp3", 45, "MP3");
        audio1.agregarAutor(beethoven);
        controlador.registrarMaterial(audio1);

        Audio audio2 = new Audio(0, "Cien melodías clásicas", 2022, 
                                "/audios/melodias.mp3", 120, "MP3");
        audio2.agregarAutor(beethoven);
        controlador.registrarMaterial(audio2);

        System.out.println("\nDatos de prueba cargados:");
        System.out.println("- 4 autores diferentes");
        System.out.println("- 7 materiales:");
        System.out.println("  * 1 libro");
        System.out.println("  * 2 revistas");
        System.out.println("  * 2 videos");
        System.out.println("  * 2 audios");
        
        System.out.println("\nEjemplos de búsqueda:");
        System.out.println("1. Búsqueda por título parcial:");
        System.out.println("   - 'Cien' (4 materiales diferentes)");
        System.out.println("   - 'National' (1 revista)");
        
        System.out.println("\n2. Búsqueda por título exacto:");
        System.out.println("   - 'Sinfonía No. 5' (1 audio)");
        System.out.println("   - 'Jurassic Park' (1 video)");
        
        System.out.println("\n3. Búsqueda por autor parcial:");
        System.out.println("   - 'Steven' (2 videos)");
        System.out.println("   - 'National' (2 revistas)");
        
        System.out.println("\n4. Búsqueda por autor exacto:");
        System.out.println("   - 'Ludwig van Beethoven' (2 audios)");
        System.out.println("   - 'Steven Spielberg' (2 videos)");
    }
}