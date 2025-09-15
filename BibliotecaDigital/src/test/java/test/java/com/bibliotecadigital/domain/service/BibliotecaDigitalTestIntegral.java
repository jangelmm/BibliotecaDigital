/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.model.Video;
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.MaterialController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp EliteBook
 */
public class BibliotecaDigitalTestIntegral {
    private static MaterialController controlador;
    private static BibliotecaService servicio;
    private static InMemoryBibliotecaRepository biblioteca;
    private static AuthenticationService auth;
    private static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        biblioteca = new InMemoryBibliotecaRepository();
        auth = new AuthenticationService(biblioteca);
        menuInicioSesion();
        
    }
    
    private static void iniciarMenu() {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\n== LISTAR MATERIALES DE LA BIBLIOTECA ==");
            System.out.println("1. Listar todos los materiales");
            System.out.println("2. Filtrar por tipo de material");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        listarMateriales();
                        break;
                    case 2:
                        listarMaterialesPorTipo();
                        break;
                    case 3:
                        System.out.println("Programa terminado\n");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
    }
    
    private static void listarMateriales() {
        List<MaterialBiblioteca> lista = servicio.listarMateriales();
        System.out.println("\n\t\t\t=== Lista de todos los materiales ===");
        imprimirTablaMateriales(lista);
    }
    
    private static void listarMaterialesPorTipo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de material a filtrar (Libro, Revista, Video, Audio): ");
        String tipo = scanner.nextLine().trim();

        List<MaterialBiblioteca> todos = servicio.listarMateriales(); // lista todo
        List<MaterialBiblioteca> filtrados = new ArrayList<>();

        for (MaterialBiblioteca m : todos) {
            if (m.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                filtrados.add(m);
            }
        }

        if (filtrados.isEmpty()) {
            System.out.println("No hay materiales de tipo '" + tipo + "'.");
        } else {
            System.out.println("\n\t\t\t=== Lista de materiales de tipo " + tipo + " ===");
            imprimirTablaMateriales(filtrados);
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
    
    // Método para imprimir tabla, reutilizable
    private static void imprimirTablaMateriales(List<MaterialBiblioteca> materiales) {
        if (materiales.isEmpty()) {
            System.out.println("No hay materiales para mostrar.");
            return;
        }

        // Encabezados
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-4s | %-30s | %-25s | %-4s | %-10s | %-10s | %-30s%n",
                          "ID", "Título", "Autor(es)", "Año", "Tipo", "Estado", "Ruta de archivo");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        // Filas con datos
        for (MaterialBiblioteca m : materiales) {
            String autoresStr = m.getAutores().isEmpty() ? "-" :
                                String.join(", ", m.getAutores().stream().map(a -> a.getNombre()).toArray(String[]::new));
            String tipo = m.getClass().getSimpleName();
            String estado = m.isDisponible() ? "Disponible" : "Prestado";

            System.out.printf("%-4d | %-30s | %-25s | %-4d | %-10s | %-10s | %-30s%n",
                              m.getId(), m.getTitulo(), autoresStr, m.getAnio(), tipo, estado, m.getRutaArchivo());
        }
    }
    
    private static void menuInicioSesion(){
        //Se registran 2 usuario por defecto
        int eleccion = 0;
        while (eleccion != 3){ 
            eleccion = 0;
            System.out.println("Bienvenido al sistema de biblioteca"
                + "\n Que desea realizar? "
                + "\n 1. Inicio Sesion"
                + "\n 2. Registrar Nuevo Usuario"
                + "\n 3. Salir");
            try{
                eleccion = Integer.parseInt(sc.nextLine());
                switch(eleccion){
                    case 1: inicioSesion(); break;
                    case 2: registrarUsuario(); break;
                    case 3: System.exit(0); break;
                    default: break;
                }
            }catch(Exception e){
                System.out.println("Ingrese valores numericos");
            }  
        }
    }
    
    private static void inicioSesion(){
        biblioteca.registrarUsuario("Carlos Admin", "carlos@mail.com", "12345", RolUsuario.ADMINISTRADOR);
        biblioteca.registrarUsuario("Ana Cliente", "ana@mail.com", "abc123", RolUsuario.CLIENTE);
    
        boolean loginExitoso = false;
        
        while(!loginExitoso){
            System.out.print("Correo del Usuario: ");
            String email = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            
            Usuario user = auth.login(email,password);
            if(user!= null){ 
                loginExitoso = true;
                System.out.println("\n Bienvenido "+ user.getNombre() + " \n");
                servicio = new InMemoryBibliotecaRepository();
                controlador = new MaterialController(servicio);
                cargarDatosDePrueba(); // Carga lo mismo que HU2
                iniciarMenu();
            }
            else System.out.println("Datos Incorrectos");
        }
    }
    
    private static void registrarUsuario(){
        String nombre, correo, password;
        RolUsuario rol = null;

        System.out.println("\n REGISTRO DE UN NUEVO USUARIO");
        System.out.println("");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Correo: ");
        correo = sc.nextLine();
        System.out.println("Password: ");     
        password = sc.nextLine();

        // Selección de rol
        System.out.println("Seleccione el rol:");
        System.out.println("1. Administrador");
        System.out.println("2. Encargado");
        System.out.println("3. Cliente");
        System.out.print("Opción: ");

        try {
            int opcionRol = Integer.parseInt(sc.nextLine());
            switch(opcionRol) {
                case 1: rol = RolUsuario.ADMINISTRADOR; break;
                case 2: rol = RolUsuario.ENCARGADO; break;
                case 3: rol = RolUsuario.CLIENTE; break;
                default: 
                    System.out.println("Opción inválida, se asignará rol de Cliente");
                    rol = RolUsuario.CLIENTE;
            }
        } catch (NumberFormatException e) {
            System.out.println("Opción inválida, se asignará rol de Cliente");
            rol = RolUsuario.CLIENTE;
        }

        boolean exito = biblioteca.registrarUsuario(nombre, correo, password, rol);
        if (exito) {
            System.out.println("Usuario registrado con rol: " + rol);
        } else {
            System.out.println("Error: el usuario ya existe");
        }
    }
    
    private static void prueba(){
        System.out.println("Prueba");
    }
}
