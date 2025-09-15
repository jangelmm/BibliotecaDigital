package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class BibliotecaDigitalTestHU10 {

    private InMemoryBibliotecaRepository biblioteca;
    private AuthenticationService auth;

    @BeforeEach
    void setUp() {
        biblioteca = new InMemoryBibliotecaRepository();
        auth = new AuthenticationService(biblioteca);
    }

    @Test
    void testRegistrarUsuarioConRol() {
        boolean resultado = biblioteca.registrarUsuario("Admin", "admin@mail.com", "admin123", RolUsuario.ADMINISTRADOR);
        assertTrue(resultado);
        
        Usuario usuario = biblioteca.buscarUsuarioPorEmail("admin@mail.com");
        assertNotNull(usuario);
        assertEquals(RolUsuario.ADMINISTRADOR, usuario.getRol());
    }
    
    @Test
    void testActualizarRolUsuario() {
        biblioteca.registrarUsuario("Usuario", "user@mail.com", "user123", RolUsuario.CLIENTE);
        
        boolean resultado = biblioteca.actualizarRolUsuario("user@mail.com", RolUsuario.ENCARGADO);
        assertTrue(resultado);
        
        Usuario usuario = biblioteca.buscarUsuarioPorEmail("user@mail.com");
        assertEquals(RolUsuario.ENCARGADO, usuario.getRol());
    }
    
    @Test
    void testVerificacionPermisosAdministrador() {
        biblioteca.registrarUsuario("Admin", "admin@mail.com", "admin123", RolUsuario.ADMINISTRADOR);
        Usuario admin = auth.login("admin@mail.com", "admin123");
        
        // Simulación de la lógica de permisos mejorada con Enum
        assertTrue(auth.tienePermiso(admin, "configuracion_sistema"));
        assertTrue(auth.tienePermiso(admin, "gestion_usuarios"));
        assertTrue(auth.tienePermiso(admin, "buscar_materiales"));
    }
    
    @Test
    void testVerificacionPermisosCliente() {
        biblioteca.registrarUsuario("Cliente", "cliente@mail.com", "cliente123", RolUsuario.CLIENTE);
        Usuario cliente = auth.login("cliente@mail.com", "cliente123");
        
        assertTrue(auth.tienePermiso(cliente, "buscar_materiales"));
        assertFalse(auth.tienePermiso(cliente, "configuracion_sistema"));
        assertFalse(auth.tienePermiso(cliente, "gestion_usuarios"));
    }
    
    @Test
    void testVerificacionPermisosEncargado() {
        biblioteca.registrarUsuario("Encargado", "encargado@mail.com", "encargado123", RolUsuario.ENCARGADO);
        Usuario encargado = auth.login("encargado@mail.com", "encargado123");
        
        assertTrue(auth.tienePermiso(encargado, "gestion_usuarios"));
        assertTrue(auth.tienePermiso(encargado, "buscar_materiales"));
        assertFalse(auth.tienePermiso(encargado, "configuracion_sistema"));
    }

    /**
     * Método main para ejecutar los tests manualmente desde la consola o el IDE.
     * Simula el comportamiento de JUnit al crear una nueva instancia para cada test.
     */
    public static void main(String[] args) {
        System.out.println("--- Ejecutando Pruebas de HU10 Manualmente ---");

        // --- Test 1 ---
        try {
            System.out.print("Ejecutando: testRegistrarUsuarioConRol... ");
            BibliotecaDigitalTestHU10 test1 = new BibliotecaDigitalTestHU10();
            test1.setUp();
            test1.testRegistrarUsuarioConRol();
            System.out.println(" PASSED");
        } catch (AssertionError e) {
            System.out.println(" FAILED");
            System.out.println("   Causa: " + e.getMessage());
        }

        // --- Test 2 ---
        try {
            System.out.print("Ejecutando: testActualizarRolUsuario... ");
            BibliotecaDigitalTestHU10 test2 = new BibliotecaDigitalTestHU10();
            test2.setUp();
            test2.testActualizarRolUsuario();
            System.out.println(" PASSED");
        } catch (AssertionError e) {
            System.out.println(" FAILED");
            System.out.println("   Causa: " + e.getMessage());
        }

        // --- Test 3 ---
        try {
            System.out.print("Ejecutando: testVerificacionPermisosAdministrador... ");
            BibliotecaDigitalTestHU10 test3 = new BibliotecaDigitalTestHU10();
            test3.setUp();
            test3.testVerificacionPermisosAdministrador();
            System.out.println(" PASSED");
        } catch (AssertionError e) {
            System.out.println(" FAILED");
            System.out.println("   Causa: " + e.getMessage());
        }

        // --- Test 4 ---
        try {
            System.out.print("Ejecutando: testVerificacionPermisosCliente... ");
            BibliotecaDigitalTestHU10 test4 = new BibliotecaDigitalTestHU10();
            test4.setUp();
            test4.testVerificacionPermisosCliente();
            System.out.println(" PASSED");
        } catch (AssertionError e) {
            System.out.println(" FAILED");
            System.out.println("   Causa: " + e.getMessage());
        }

        // --- Test 5 ---
        try {
            System.out.print("Ejecutando: testVerificacionPermisosEncargado... ");
            BibliotecaDigitalTestHU10 test5 = new BibliotecaDigitalTestHU10();
            test5.setUp();
            test5.testVerificacionPermisosEncargado();
            System.out.println(" PASSED");
        } catch (AssertionError e) {
            System.out.println(" FAILED");
            System.out.println("   Causa: " + e.getMessage());
        }

        System.out.println("--- Pruebas Finalizadas ---");
    }
}