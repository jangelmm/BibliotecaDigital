package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.presentation.desktop.controllers.GestionAutoresController;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// --- INICIO DE LA CLASE MOCK ---
/**
 * Esta es nuestra clase de simulación (el "banco de pruebas").
 * Implementa la interfaz para que el Controlador pueda hablar con ella,
 * pero no es un JFrame real. Sus métodos están vacíos o devuelven valores
 * que nosotros controlamos desde el test.
 */
class MockGestionAutoresView implements GestionAutoresViewInterface {
    public String nombrePedido;
    public Autor autorSeleccionado;
    public boolean confirmacionDada = true;

    @Override public void mostrarAutores(java.util.List<Autor> autores) { /* No hace nada */ }
    @Override public void addNuevoListener(java.awt.event.ActionListener listener) { /* No hace nada */ }
    @Override public void addEditarListener(java.awt.event.ActionListener listener) { /* No hace nada */ }
    @Override public void addEliminarListener(java.awt.event.ActionListener listener) { /* No hace nada */ }
    @Override public void mostrarMensaje(String mensaje) { /* No hace nada */ }
    @Override public Autor getAutorSeleccionado() { return autorSeleccionado; }
    @Override public String pedirNuevoNombreAutor(String n) { return nombrePedido; }
    @Override public boolean confirmarEliminacion(String n) { return confirmacionDada; }
    @Override public javax.swing.JFrame getFrame() { return null; }
    @Override public void setVisible(boolean v) { /* No hace nada */ }
}
// --- FIN DE LA CLASE MOCK ---


// --- INICIO DE LA CLASE DE TEST ---
public class HU14AutoresCrudTest extends BaseJpaTest {
    
    private MockGestionAutoresView vistaMock;
    private GestionAutoresController controlador;

    @BeforeEach
    void setUpController() {
        super.setUp(); 
        vistaMock = new MockGestionAutoresView();
        controlador = new GestionAutoresController(repository, vistaMock);
    }

    @Test
    void testCrearYEncontrarAutorDesdeController() {
        // Arrange: Preparamos nuestro 'banco de pruebas' (el Mock).
        // Le decimos que cuando el controlador le pida un nombre, devuelva "Gabriel García Márquez".
        vistaMock.nombrePedido = "Gabriel García Márquez";
        
        // Act: Le decimos al 'motor' (Controlador) que haga su trabajo.
        // El controlador llamará a vistaMock.pedirNuevoNombreAutor() y recibirá la respuesta que preparamos.
        controlador.crearNuevoAutor();
        
        // Assert: Verificamos el resultado en la base de datos real.
        // Comprobamos que el controlador tomó el nombre del mock y lo guardó correctamente.
        assertFalse(repository.listarAutores().isEmpty());
        assertEquals("Gabriel García Márquez", repository.listarAutores().get(0).getNombre());
    }
}