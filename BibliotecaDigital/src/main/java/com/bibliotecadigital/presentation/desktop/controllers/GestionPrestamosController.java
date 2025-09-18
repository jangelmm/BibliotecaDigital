/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.presentation.desktop.views.GestionPrestamosViewInterface;

import java.util.List;
import java.util.ArrayList;

/**
 * Controlador para la gestión de préstamos.
 * Conecta la vista con los servicios de la aplicación.
 */
public class GestionPrestamosController {
    
    public final BibliotecaService servicio;
    private final GestionPrestamosViewInterface vista;
    
    /**
     * Constructor del controlador
     * @param servicio Servicio de biblioteca para operaciones CRUD
     * @param vista Vista para la interacción con el usuario
     */
    public GestionPrestamosController(BibliotecaService servicio, GestionPrestamosViewInterface vista) {
        this.servicio = servicio;
        this.vista = vista;
        
        // Registrar los listeners en la vista
        this.vista.addNuevoPrestamoListener(e -> abrirDialogoNuevoPrestamo());
        this.vista.addFinalizarPrestamoListener(e -> finalizarPrestamoSeleccionado());
        this.vista.addRefrescarListener(e -> cargarPrestamos());
        
        // Cargar los préstamos iniciales
        cargarPrestamos();
    }
    
    /**
     * Carga todos los préstamos y los muestra en la vista
     */
    public void cargarPrestamos() {
        vista.mostrarPrestamos(servicio.listarPrestamos());
    }
    
    /**
     * Abre el diálogo para crear un nuevo préstamo
     */
    private void abrirDialogoNuevoPrestamo() {
        vista.abrirDialogoNuevoPrestamo();
    }
    
    /**
     * Crea un nuevo préstamo con los datos proporcionados
     * @param usuario Usuario que realiza el préstamo
     * @param materiales Lista de materiales a prestar
     */
    public void crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        if (usuario == null) {
            vista.mostrarError("Debe seleccionar un usuario");
            return;
        }
        
        if (materiales == null || materiales.isEmpty()) {
            vista.mostrarError("Debe seleccionar al menos un material");
            return;
        }
        
        // La validación de disponibilidad se realiza en el servicio,
        // pero verificamos previamente para dar un mensaje más específico
        for (MaterialBiblioteca material : materiales) {
            if (!material.isDisponible()) {
                vista.mostrarError("El material '" + material.getTitulo() + "' no está disponible");
                return;
            }
        }
        
        // Crear el préstamo utilizando el servicio
        Prestamo nuevoPrestamo = servicio.crearPrestamo(usuario, materiales);
        
        if (nuevoPrestamo != null) {
            vista.mostrarMensaje("Préstamo creado correctamente");
            cargarPrestamos(); // Refrescar la tabla
        } else {
            vista.mostrarError("No se pudo crear el préstamo");
        }
    }
    
    /**
     * Finaliza el préstamo seleccionado
     */
    private void finalizarPrestamoSeleccionado() {
        Prestamo prestamo = vista.getPrestamoSeleccionado();
        
        if (prestamo == null) {
            vista.mostrarError("Por favor, seleccione un préstamo para finalizar.");
            return;
        }
        
        if (prestamo.getFechaDevolucion() != null) {
            vista.mostrarError("El préstamo seleccionado ya está finalizado");
            return;
        }
        
        if (vista.confirmarFinalizacionPrestamo(prestamo)) {
            boolean todosDevueltos = true;
            
            for (MaterialBiblioteca material : prestamo.getMateriales()) {
                boolean devuelto = servicio.registrarDevolucion(prestamo, material);
                if (!devuelto) {
                    todosDevueltos = false;
                    vista.mostrarError("Error al registrar la devolución del material: " + material.getTitulo());
                    break;
                }
            }
            
            if (todosDevueltos) {
                vista.mostrarMensaje("Préstamo finalizado correctamente");
                cargarPrestamos(); // Refrescar la tabla
            }
        }
    }
    
    /**
     * Obtiene usuarios para mostrar en la interfaz, filtrados por rol.
     * Nota: Este método es provisional hasta tener un método adecuado en el servicio.
     * @return Lista de usuarios disponibles
     */
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> todosLosUsuarios = new ArrayList<>();
        List<Usuario> usuariosFiltrados = new ArrayList<>();

        // 1. Crear usuarios de prueba si no existen (para garantizar que haya datos)
        // Esto solo se ejecuta la primera vez que se llame al método
        if (servicio.buscarUsuarioPorEmail("admin@biblioteca.com") == null) {
            servicio.registrarUsuario(new Usuario ("Administrador", "admin@biblioteca.com", "admin123", RolUsuario.ADMINISTRADOR));
        }

        if (servicio.buscarUsuarioPorEmail("cliente@biblioteca.com") == null) {
            servicio.registrarUsuario(new Usuario ("Cliente", "cliente@biblioteca.com", "cliente123", RolUsuario.CLIENTE));
        }

        if (servicio.buscarUsuarioPorEmail("encargado@biblioteca.com") == null) {
            servicio.registrarUsuario(new Usuario ("Encargado", "encargado@biblioteca.com", "encargado123", RolUsuario.ENCARGADO));
        }

        // 2. Buscar usuarios conocidos por correo y añadirlos a la lista
        Usuario admin = servicio.buscarUsuarioPorEmail("admin@biblioteca.com");
        if (admin != null) todosLosUsuarios.add(admin);

        Usuario cliente = servicio.buscarUsuarioPorEmail("cliente@biblioteca.com");
        if (cliente != null) todosLosUsuarios.add(cliente);

        Usuario encargado = servicio.buscarUsuarioPorEmail("encargado@biblioteca.com");
        if (encargado != null) todosLosUsuarios.add(encargado);

        // 3. Filtrar usuarios según su rol
        for (Usuario u : todosLosUsuarios) {
            // Solo mostrar clientes y administradores para préstamos
            if (u.getRol() == RolUsuario.CLIENTE || u.getRol() == RolUsuario.ADMINISTRADOR) {
                usuariosFiltrados.add(u);
            }
        }

        // 4. Imprimir información
        System.out.println("Usuarios filtrados encontrados: " + usuariosFiltrados.size());
        for (Usuario u : usuariosFiltrados) {
            System.out.println("  - " + u.getNombre() + " (" + u.getRol() + ")");
        }

        return usuariosFiltrados;
    }
    
    public Prestamo buscarPrestamoPorId(int id) {
        List<Prestamo> prestamos = servicio.listarPrestamos();
        for (Prestamo p : prestamos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    /**
     * Busca materiales por título
     * @param titulo Título o parte del título a buscar
     * @return Lista de materiales que coinciden con la búsqueda
     */
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        return servicio.buscarMaterialesPorTitulo(titulo);
    }
}