/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.Video;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.presentation.desktop.views.GestionMaterialesViewInterface;
import java.util.List;

/**
 *
 * @author Diego Garcia
 */
public class GestionMaterialesController {
    
    private final BibliotecaService servicio;
    private final GestionMaterialesViewInterface vista;

    public GestionMaterialesController(BibliotecaService servicio, GestionMaterialesViewInterface vista) {
        this.servicio = servicio;
        this.vista = vista;
        
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addNuevoListener(e -> crearNuevoMaterial());
        this.vista.addEditarListener(e -> editarMaterialSeleccionado());
        this.vista.addEliminarListener(e -> eliminarMaterialSeleccionado());
        
        // Cargar los datos iniciales
        cargarMateriales();
    }

    public void cargarMateriales() {
        vista.mostrarMateriales(servicio.listarMateriales());
    }

    public void crearNuevoMaterial() {
        String tipo = vista.pedirTipoMaterial(); // (libro/Revista/Video/Audio)
        String titulo = vista.pedirNuevoTituloMaterial("");
        int anio = vista.pedirAnioMaterial();
        String rutaArchivo = vista.pedirRutaArchivo();
        boolean disponible = true; // disponible por default
        List<Integer> autorIds = vista.pedirIdsAutores(); // por ejemplo: [1, 2, 5]

        MaterialBiblioteca material = null;

        switch (tipo) {
            case "Libro":
                String editorial = vista.pedirEditorial();
                int numPaginas = vista.pedirNumPaginas();
                material = new Libro(0, titulo,  anio, rutaArchivo, editorial, numPaginas);
                break;

            case "Revista":
                String edit = vista.pedirEditorial();
                int numero = vista.pedirNumero();
                material = new Revista(0, titulo, anio, rutaArchivo, edit, numero);
                break;

            case "Video":
                float duracion = vista.pedirDuracion();
                String formato = vista.pedirFormato();
                material = new Video(0, titulo, anio, rutaArchivo, duracion, formato);
                break;
                
            case "Audio":
                float dur = vista.pedirDuracion();
                String form = vista.pedirFormato();
                material = new Audio(0, titulo, anio, rutaArchivo, dur, form);
                break;
        }

        if (material != null) {
            servicio.registrarMaterialConAutores(material, autorIds);
            cargarMateriales();
            vista.mostrarMensaje("Material creado exitosamente.");
        }
    }
    
    public void editarMaterialSeleccionado() {
        MaterialBiblioteca materialSeleccionado = vista.getMaterialSeleccionado();
        if (materialSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un material para editar.");
            return;
        }
       
        String nuevoTitulo = vista.pedirNuevoTituloMaterial(materialSeleccionado.getTitulo());
        if (nuevoTitulo != null && !nuevoTitulo.trim().isEmpty()) {
            materialSeleccionado.setTitulo(nuevoTitulo);
            servicio.actualizarMaterial(materialSeleccionado);
            cargarMateriales(); // Refrescar la tabla
            vista.mostrarMensaje("Material actualizado exitosamente.");
        }
    }
    
    public void eliminarMaterialSeleccionado() {
        MaterialBiblioteca materialSeleccionado = vista.getMaterialSeleccionado();
        if (materialSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un material para eliminar.");
            return;
        }

        if (vista.confirmarEliminacion(materialSeleccionado.getTitulo())) {
            try {
                servicio.eliminarMaterial(materialSeleccionado.getId());
                cargarMateriales(); // Refrescar la tabla
                vista.mostrarMensaje("Material eliminado exitosamente.");
            } catch (Exception e) {
                // Manejar el caso de que un material no se pueda borrar por tener prestamos asociados
                vista.mostrarMensaje("Error: No se puede eliminar el material, probablemente tiene un prestamo asociados.");
            }
        }
    }
    
    /*
    public List<Integer> pedirIdsAutores() {
        String input = JOptionPane.showInputDialog("Ingrese los IDs de los autores separados por coma:");
        if (input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }

        return Arrays.stream(input.split(","))
                     .map(String::trim)
                     .map(Integer::parseInt)
                     .collect(Collectors.toList());
    }
    */
    
    /*
    
    */
}
