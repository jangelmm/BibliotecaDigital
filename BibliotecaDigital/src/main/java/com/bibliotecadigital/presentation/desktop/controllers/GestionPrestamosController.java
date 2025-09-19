package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.MaterialRepository;
import com.bibliotecadigital.domain.service.PrestamoRepository;
import com.bibliotecadigital.domain.service.UsuarioRepository;
import com.bibliotecadigital.presentation.desktop.views.GestionPrestamosView;
import com.bibliotecadigital.presentation.desktop.views.GestionPrestamosViewInterface;
import java.time.LocalDate;
import java.util.List;

public class GestionPrestamosController {
    
    private final PrestamoRepository prestamoRepo;
    private final UsuarioRepository usuarioRepo;
    private final MaterialRepository materialRepo;
    private final GestionPrestamosViewInterface vista;
    
    public GestionPrestamosController(PrestamoRepository prestamoRepo, 
                                      UsuarioRepository usuarioRepo, 
                                      MaterialRepository materialRepo, 
                                      GestionPrestamosViewInterface vista) {
        this.prestamoRepo = prestamoRepo;
        this.usuarioRepo = usuarioRepo;
        this.materialRepo = materialRepo;
        this.vista = vista;
        
        // Pasa la referencia de este controlador a la vista
        if (vista instanceof GestionPrestamosView) {
            ((GestionPrestamosView) vista).setController(this);
        }
        
        this.vista.addNuevoPrestamoListener(e -> abrirDialogoNuevoPrestamo());
        this.vista.addFinalizarPrestamoListener(e -> finalizarPrestamoSeleccionado());
        this.vista.addRefrescarListener(e -> cargarPrestamos());
        
        cargarPrestamos();
    }
    
    public void cargarPrestamos() {
        vista.mostrarPrestamos(prestamoRepo.findAll());
    }
    
    private void abrirDialogoNuevoPrestamo() {
        vista.abrirDialogoNuevoPrestamo();
    }
    
    public void crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        if (usuario == null || materiales == null || materiales.isEmpty()) {
            vista.mostrarError("Debe seleccionar un usuario y al menos un material.");
            return;
        }
        
        Prestamo nuevoPrestamo = new Prestamo(usuario, materiales);
        prestamoRepo.save(nuevoPrestamo);
        
        vista.mostrarMensaje("Préstamo creado correctamente con ID: " + nuevoPrestamo.getId());
        cargarPrestamos();
    }
    
    private void finalizarPrestamoSeleccionado() {
        Prestamo prestamo = vista.getPrestamoSeleccionado();
        
        if (prestamo == null) {
            vista.mostrarError("Por favor, seleccione un préstamo para finalizar.");
            return;
        }
        
        if (prestamo.getFechaDevolucion() != null) {
            vista.mostrarError("El préstamo seleccionado ya está finalizado.");
            return;
        }
        
        if (vista.confirmarFinalizacionPrestamo(prestamo)) {
            prestamo.setFechaDevolucion(LocalDate.now());
            prestamoRepo.save(prestamo);
            
            vista.mostrarMensaje("Préstamo finalizado correctamente.");
            cargarPrestamos();
        }
    }
    
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepo.findAll();
    }
    
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        return materialRepo.findByTitulo(titulo);
    }

    public Prestamo buscarPrestamoPorId(int id) {
        return prestamoRepo.findById(id).orElse(null);
    }
}