/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.service.AutorRepository;
import com.bibliotecadigital.domain.service.MaterialRepository;
import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.Video;
import com.bibliotecadigital.presentation.desktop.views.GestionMaterialesViewInterface;
import java.util.List;

/**
 *
 * @author Diego Garcia
 */
public class GestionMaterialesController {
    
    private final MaterialRepository materialRepo;
    private final AutorRepository autorRepo;
    private final GestionMaterialesViewInterface vista;

    // El constructor ahora pide los repositorios específicos que necesita
    public GestionMaterialesController(MaterialRepository materialRepo, AutorRepository autorRepo, GestionMaterialesViewInterface vista) {
        this.materialRepo = materialRepo;
        this.autorRepo = autorRepo;
        this.vista = vista;
        
        this.vista.addNuevoListener(e -> crearNuevoMaterial());
        this.vista.addEditarListener(e -> editarMaterialSeleccionado());
        this.vista.addEliminarListener(e -> eliminarMaterialSeleccionado());
        
        cargarMateriales();
    }

    public void cargarMateriales() {
        vista.mostrarMateriales(materialRepo.findAll());
    }

    public void crearNuevoMaterial() {
        // Pasamos valores "vacíos" o neutros porque es creación
        String tipo = vista.pedirTipoMaterial("").trim().toLowerCase(); // libro/revista/video/audio
        String titulo = vista.pedirNuevoTituloMaterial("");
        int anio = vista.pedirAnioMaterial(0);
        String rutaArchivo = vista.pedirRutaArchivo("");
        boolean disponible = true; // disponible por default
        
        // --- NUEVO FLUJO PARA AUTORES ---
        List<Autor> autoresSeleccionados = vista.pedirSeleccionAutores(autorRepo.findAll());
        if (autoresSeleccionados == null || autoresSeleccionados.isEmpty()) {
            vista.mostrarMensaje("La selección de autores fue cancelada o está vacía. No se creó el material.");
            return;
        }

        MaterialBiblioteca material = null;

        System.out.println("tipo: " + tipo);

        switch (tipo) {
            case "libro":
                String editorial = vista.pedirEditorial("");  // ahora recibe parámetro
                Integer numPaginas = vista.pedirNumPaginas(null);   // ahora recibe parámetro
                material = new Libro(0, titulo, anio, rutaArchivo, editorial, numPaginas);
                break;

            case "revista":
                String edit = vista.pedirEditorial("");     // parámetro
                int numero = vista.pedirNumero(0);          // parámetro
                material = new Revista(0, titulo, anio, rutaArchivo, edit, numero);
                break;

            case "video":
                float duracion = vista.pedirDuracion(0f);   // parámetro
                String formato = vista.pedirFormato("");    // parámetro
                material = new Video(0, titulo, anio, rutaArchivo, duracion, formato);
                break;

            case "audio":
                float dur = vista.pedirDuracion(0f);       // parámetro
                String form = vista.pedirFormato("");      // parámetro
                material = new Audio(0, titulo, anio, rutaArchivo, dur, form);
                break;

            default:
                vista.mostrarMensaje("Tipo de material no válido.");
        }

        System.out.println("Creando material tipo: " + tipo);

        if (material != null) {
            material.setAutores(autoresSeleccionados);
            // Usa el método 'save' que ahora es más potente
            materialRepo.save(material); 
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

        // Editar título
        String nuevoTitulo = vista.pedirNuevoTituloMaterial(materialSeleccionado.getTitulo());
        if (nuevoTitulo != null && !nuevoTitulo.trim().isEmpty()) {
            materialSeleccionado.setTitulo(nuevoTitulo);
        }

        // Editar estado
        boolean nuevoDisponible = vista.pedirEstadoMaterial(materialSeleccionado.isDisponible());
        materialSeleccionado.setDisponible(nuevoDisponible);

        // Editar año
        int nuevoAnio = vista.pedirAnioMaterial(materialSeleccionado.getAnio());
        if (nuevoAnio > 0) { // Puedes agregar más validaciones si quieres
            materialSeleccionado.setAnio(nuevoAnio);
        }

        // Editar ruta de archivo
        String nuevaRuta = vista.pedirRutaArchivo(materialSeleccionado.getRutaArchivo());
        if (nuevaRuta != null && !nuevaRuta.trim().isEmpty()) {
            materialSeleccionado.setRutaArchivo(nuevaRuta);
        }
        
        // Editar autores (opcional)
        //List<Integer> nuevosIdsAutores = vista.pedirIdsAutores(materialSeleccionado.getAutores());
        //servicio.actualizarAutores(materialSeleccionado, nuevosIdsAutores);

        // Editar atributos según el tipo
        if (materialSeleccionado instanceof Libro libro) {
            String nuevaEditorial = vista.pedirEditorial(libro.getEditorial());
            libro.setEditorial(nuevaEditorial);
            int nuevasPaginas = vista.pedirNumPaginas(libro.getNumPaginas());
            libro.setNumPaginas(nuevasPaginas);
        } else if (materialSeleccionado instanceof Revista revista) {
            String nuevaEditorial = vista.pedirEditorial(revista.getEditorial());
            revista.setEditorial(nuevaEditorial);
            int nuevoNumero = vista.pedirNumero(revista.getNumero());
            revista.setNumero(nuevoNumero);
        } else if (materialSeleccionado instanceof Audio audio) {
            float nuevaDuracion = vista.pedirDuracion(audio.getDuracion());
            audio.setDuracion(nuevaDuracion);
            String nuevoFormato = vista.pedirFormato(audio.getFormato());
            audio.setFormato(nuevoFormato);
        } else if (materialSeleccionado instanceof Video video) {
            float nuevaDuracion = vista.pedirDuracion(video.getDuracion());
            video.setDuracion(nuevaDuracion);
            String nuevoFormato = vista.pedirFormato(video.getFormato());
            video.setFormato(nuevoFormato);
        }

        // Guardar cambios
        materialRepo.save(materialSeleccionado);
        cargarMateriales(); // Refrescar la tabla
        vista.mostrarMensaje("Material actualizado exitosamente.");

    }
    
    public void eliminarMaterialSeleccionado() {
        MaterialBiblioteca materialSeleccionado = vista.getMaterialSeleccionado();
        if (materialSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un material para eliminar.");
            return;
        }

        if (vista.confirmarEliminacion(materialSeleccionado.getTitulo())) {
            try {
                materialRepo.deleteById(materialSeleccionado.getId());
                cargarMateriales(); // Refrescar la tabla
                vista.mostrarMensaje("Material eliminado exitosamente.");
            } catch (Exception e) {
                // Manejar el caso de que un material no se pueda borrar por tener prestamos asociados
                vista.mostrarMensaje("Error: No se puede eliminar el material, probablemente tiene un prestamo asociados.");
            }
        }
    }
    
}
