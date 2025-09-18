/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.presentation.desktop.controllers.GestionMaterialesController;
import com.bibliotecadigital.presentation.desktop.views.GestionMaterialesViewInterface;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego Garcia
 */

// --- INICIO DE LA CLASE MOCK ---
/**
 * Esta es nuestra clase de simulación (el "banco de pruebas").
 * Implementa la interfaz para que el Controlador pueda hablar con ella,
 * pero no es un JFrame real. Sus métodos están vacíos o devuelven valores
 * que nosotros controlamos desde el test.
 */
class MockGestionMaterialesView implements GestionMaterialesViewInterface {
    public String tipoPedido;
    public String tituloPedido;
    public int anioPedido;
    public String rutaArchivoPedido;
    public java.util.List<Integer> idsAutoresPedidos = Collections.emptyList();
    public String editorialPedido;
    public Integer numPaginasPedido;
    public boolean confirmacionDada = true;
    public boolean disponible = true;
    public MaterialBiblioteca materialSeleccionado;

    @Override public void addNuevoListener(java.awt.event.ActionListener listener) { /* No hace nada */ }
    @Override public void addEditarListener(java.awt.event.ActionListener listener) { /* No hace nada */ }
    @Override public void addEliminarListener(java.awt.event.ActionListener listener) { /* No hace nada */ }
    
    @Override public void mostrarMateriales(java.util.List<MaterialBiblioteca> materiales) { /* No hace nada */ }
    @Override public void mostrarMensaje(String mensaje) { /* No hace nada */ }
    @Override public MaterialBiblioteca getMaterialSeleccionado() { return materialSeleccionado; }
    @Override public boolean confirmarEliminacion(String n) { return confirmacionDada; }
    @Override public javax.swing.JFrame getFrame() { return null; }
    @Override public void setVisible(boolean v) { /* No hace nada */ }

    // Datos que pide el controlador
    @Override public String pedirTipoMaterial(String tipoActual) { return tipoPedido; }
    @Override public String pedirNuevoTituloMaterial(String tituloActual) { return tituloPedido; }
    @Override public int pedirAnioMaterial(int anioActual) { return anioPedido; }
    @Override public String pedirRutaArchivo(String ruta) { return rutaArchivoPedido; }
    @Override public java.util.List<Integer> pedirIdsAutores() { return idsAutoresPedidos; }
    @Override public String pedirEditorial(String editorialActual) { return editorialPedido; }
    @Override public Integer pedirNumPaginas(Integer numPaginasActual) { return numPaginasPedido; }
    @Override public int pedirNumero(int numeroActual) { return 0; } // No aplica en este test
    @Override public float pedirDuracion(float duracionActual) { return 0; } // No aplica en este test
    @Override public String pedirFormato(String formatoActual) { return null; } // No aplica en este test
    @Override public boolean pedirEstadoMaterial(boolean estadoActual) { return disponible; }
}
// --- FIN DE LA CLASE MOCK ---

public class HU13MaterialesCrudTest extends BaseJpaTest{
    
    
    private MockGestionMaterialesView vistaMock;
    private GestionMaterialesController controlador;

    @BeforeEach
    void setUpController() {
        super.setUp();
        
        // Crear un autor en la BD de prueba
        //repository.registrarAutor(new com.bibliotecadigital.domain.model.Autor(5, "Gabriel García Márquez"));
    
        
        vistaMock = new MockGestionMaterialesView();
        controlador = new GestionMaterialesController(repository, vistaMock);
    }
    

    @Test
    void testCrearYEncontrarLibroDesdeController() {
        vistaMock.tipoPedido = "libro"; // minúscula
        vistaMock.tituloPedido = "Cien Años de Soledad";
        vistaMock.anioPedido = 1967;
        vistaMock.rutaArchivoPedido = "/ruta/ficticia.pdf";
        vistaMock.editorialPedido = "Sudamericana";
        vistaMock.numPaginasPedido = 417;
        vistaMock.idsAutoresPedidos = java.util.List.of(1); // autor existente

        controlador.crearNuevoMaterial();

        assertFalse(repository.listarMateriales().isEmpty());
        MaterialBiblioteca material = repository.listarMateriales().get(0);
        assertEquals("Cien Años de Soledad", material.getTitulo());
        assertEquals(1967, material.getAnio());
        assertTrue(material instanceof Libro);
        Libro libro = (Libro) material;
        assertEquals("Sudamericana", libro.getEditorial());
        assertEquals(417, libro.getNumPaginas());
    }
    
    /*
    @Test
    void testCrearYEncontrarAudioDesdeController() {
        vistaMock.tipoPedido = "audio"; // minúscula
        vistaMock.tituloPedido = "Podcast Ejemplo";
        vistaMock.anioPedido = 2023;
        vistaMock.rutaArchivoPedido = "/ruta/audio.mp3";
        vistaMock.idsAutoresPedidos = java.util.List.of(1); // lista vacía

        controlador.crearNuevoMaterial();

        MaterialBiblioteca material = repository.listarMateriales().get(0);
        assertEquals("Podcast Ejemplo", material.getTitulo());
        assertEquals(2023, material.getAnio());
        assertTrue(material instanceof com.bibliotecadigital.domain.model.Audio);
    }

    @Test
    void testCrearYEncontrarRevistaDesdeController() {
        vistaMock.tipoPedido = "revista"; // minúscula
        vistaMock.tituloPedido = "Revista Ciencia";
        vistaMock.anioPedido = 2024;
        vistaMock.rutaArchivoPedido = "/ruta/revista.pdf";
        vistaMock.editorialPedido = "Editorial Científica";
        vistaMock.idsAutoresPedidos = java.util.List.of(1); // lista vacía

        controlador.crearNuevoMaterial();

        MaterialBiblioteca material = repository.listarMateriales().get(0);
        assertEquals("Revista Ciencia", material.getTitulo());
        assertEquals(2024, material.getAnio());
        assertTrue(material instanceof com.bibliotecadigital.domain.model.Revista);
    }

    @Test
    void testCrearYEncontrarVideoDesdeController() {
        vistaMock.tipoPedido = "video"; // minúscula
        vistaMock.tituloPedido = "Documental Ejemplo";
        vistaMock.anioPedido = 2022;
        vistaMock.rutaArchivoPedido = "/ruta/video.mp4";
        vistaMock.idsAutoresPedidos = java.util.List.of(1); // lista vacía

        controlador.crearNuevoMaterial();

        MaterialBiblioteca material = repository.listarMateriales().get(0);
        assertEquals("Documental Ejemplo", material.getTitulo());
        assertEquals(2022, material.getAnio());
        assertTrue(material instanceof com.bibliotecadigital.domain.model.Video);
    }
    */
}
