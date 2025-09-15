# **HU8 – Pruebas de Integración del Sistema**

## 1 Análisis de requerimientos

**Objetivo de la HU8:**
Validar la interoperabilidad de las funcionalidades clave del sistema (`Registro`, `Autenticación`, `Préstamo`, `Devolución`) a través de una única prueba de integración que simule un flujo de trabajo completo y realista de la biblioteca.

**Criterios de aceptación:**

  * Una única prueba debe simular un escenario de uso completo "de principio a fin".
  * El escenario debe incluir: registro de usuarios con diferentes roles, registro de materiales, login, creación de un préstamo consolidado, y la devolución parcial y completa de dicho préstamo.
  * La prueba debe verificar con aserciones el estado del sistema (ej. disponibilidad de materiales, estado de los préstamos) en cada paso clave del flujo.

-----

## 2 Diseño

**Clases involucradas:**

| Clase | Responsabilidad |
| :--- | :--- |
| `InMemoryBibliotecaRepository` | Actúa como el sistema central que gestiona todos los datos y la lógica de negocio durante la prueba. |
| `AuthenticationService` | Se utiliza para simular el login de los usuarios y verificar sus identidades. |
| `Usuario`, `RolUsuario` | Representan a los actores (administrador, cliente) que interactúan con el sistema. |
| `Libro`, `Video`, `Autor` | Son los objetos de dominio que se crean, se prestan y se devuelven durante el flujo de la prueba. |
| `Prestamo` | Es el objeto central que se crea, se gestiona y se cierra a lo largo del ciclo de vida del préstamo. |

**Flujo de ejecución de la prueba:**

```
1. SETUP: Se inicializa el repositorio y el servicio de autenticación.
2. REGISTRO DE USUARIOS: Se registra un usuario ADMINISTRADOR y un CLIENTE.
3. REGISTRO DE MATERIALES: Se simula que el admin registra dos materiales (un libro y un video).
4. LOGIN Y PRÉSTAMO: El CLIENTE inicia sesión y solicita un préstamo con ambos materiales.
   -> VERIFICAR: El préstamo existe y los materiales ya no están disponibles.
5. DEVOLUCIÓN PARCIAL: El CLIENTE devuelve solo el libro.
   -> VERIFICAR: El libro está disponible, el video no, y el préstamo sigue activo.
6. DEVOLUCIÓN COMPLETA: El CLIENTE devuelve el video restante.
   -> VERIFICAR: Ambos materiales están disponibles y el préstamo se marca como cerrado.
```

-----

## 3 Codificación

Esta Historia de Usuario no introduce ni modifica código en la aplicación principal (`src/main/java`), ya que su objetivo es validar el comportamiento existente. Toda la codificación se realiza en un nuevo archivo de prueba.

-----

## 4 Compilación

El proceso de compilación no cambia. Se utiliza el comando estándar de Maven para compilar todo el proyecto, incluyendo las nuevas clases de prueba.

**Comandos de compilación:**

```bash
mvn clean install
```

-----

## 5 Pruebas

### **5.1 Test de Integración con JUnit**

`src/test/java/test/java/com/bibliotecadigital/domain/service/BibliotecaDigitalTestHU8_Integracion.java`:

```java
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaDigitalTestHU8_Integracion {

    private InMemoryBibliotecaRepository biblioteca;
    private AuthenticationService auth;

    @BeforeEach
    void setUp() {
        biblioteca = new InMemoryBibliotecaRepository();
        auth = new AuthenticationService(biblioteca);
    }

    @Test
    @DisplayName("Prueba de integración: Flujo completo desde registro hasta devolución.")
    void testFlujoCompleto_RegistroHastaDevolucion() {

        // === PASO 1: REGISTRO DE USUARIOS Y MATERIALES ===
        System.out.println("PASO 1: Registrando usuarios y materiales...");
        biblioteca.registrarUsuario("Admin Carlos", "admin@mail.com", "passAdmin", RolUsuario.ADMINISTRADOR);
        biblioteca.registrarUsuario("Cliente Ana", "cliente@mail.com", "passCliente", RolUsuario.CLIENTE);

        Autor autor = biblioteca.registrarAutor(new Autor(0, "Autor Integral"));
        Libro libro = new Libro(0, "Libro Integral", 2025, "/ruta/libro.pdf", "Ed. Test", 150);
        libro.agregarAutor(autor);
        Video video = new Video(0, "Video Integral", 2025, "/ruta/video.mp4", 120, "MP4");
        video.agregarAutor(autor);

        // Simula que el admin registra los materiales
        biblioteca.registrarMaterial(libro);
        biblioteca.registrarMaterial(video);

        assertNotNull(biblioteca.buscarUsuarioPorEmail("admin@mail.com"));
        assertNotNull(biblioteca.buscarMaterialesPorTitulo("Libro Integral").get(0));
        System.out.println("-> OK: Usuarios y materiales registrados.");

        // === PASO 2: LOGIN Y CREACIÓN DE PRÉSTAMO ===
        System.out.println("\nPASO 2: Cliente inicia sesión y realiza un préstamo...");
        Usuario clienteLogueado = auth.login("cliente@mail.com", "passCliente");
        assertNotNull(clienteLogueado);
        
        List<MaterialBiblioteca> materialesAPrestar = List.of(libro, video);
        Prestamo prestamo = biblioteca.crearPrestamo(clienteLogueado, materialesAPrestar);

        assertNotNull(prestamo);
        assertEquals(1, biblioteca.listarPrestamos().size());
        assertFalse(libro.isDisponible(), "El libro debe estar no disponible después del préstamo.");
        assertFalse(video.isDisponible(), "El video debe estar no disponible después del préstamo.");
        System.out.println("-> OK: Préstamo creado exitosamente. Materiales no disponibles.");

        // === PASO 3: DEVOLUCIÓN PARCIAL ===
        System.out.println("\nPASO 3: Cliente realiza una devolución parcial (solo el libro)...");
        boolean devolucionLibro = biblioteca.registrarDevolucion(prestamo, libro);

        assertTrue(devolucionLibro);
        assertTrue(libro.isDisponible(), "El libro devuelto debe estar disponible.");
        assertFalse(video.isDisponible(), "El video no devuelto debe permanecer no disponible.");
        assertNull(prestamo.getFechaDevolucion(), "El préstamo no debe cerrarse tras una devolución parcial.");
        System.out.println("-> OK: Devolución parcial correcta.");

        // === PASO 4: DEVOLUCIÓN COMPLETA ===
        System.out.println("\nPASO 4: Cliente realiza la devolución final (el video)...");
        boolean devolucionVideo = biblioteca.registrarDevolucion(prestamo, video);
        
        assertTrue(devolucionVideo);
        assertTrue(video.isDisponible(), "El video ahora debe estar disponible.");
        assertNotNull(prestamo.getFechaDevolucion(), "El préstamo debe tener fecha de devolución al completarse.");
        System.out.println("-> OK: Devolución completa correcta. Préstamo cerrado.");
        
        System.out.println("\n FLUJO DE INTEGRACIÓN COMPLETADO EXITOSAMENTE.");
    }
}
```

**Ejecutar tests:**

```bash
mvn test
```

**Resultado esperado:**

```
[INFO] --- surefire:3.0.0:test (default-test) @ BibliotecaDigital ---
[INFO] Running test.java.com.bibliotecadigital.domain.service.BibliotecaDigitalTestHU8_Integracion
PASO 1: Registrando usuarios y materiales...
-> OK: Usuarios y materiales registrados.

PASO 2: Cliente inicia sesión y realiza un préstamo...
-> OK: Préstamo creado exitosamente. Materiales no disponibles.

PASO 3: Cliente realiza una devolución parcial (solo el libro)...
-> OK: Devolución parcial correcta.

PASO 4: Cliente realiza la devolución final (el video)...
-> OK: Devolución completa correcta. Préstamo cerrado.

FLUJO DE INTEGRACIÓN COMPLETADO EXITOSAMENTE.
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

-----

**Conclusión:**

  * **HU8 está completamente implementada**: Se ha creado una prueba de integración que valida el flujo principal del sistema.
  * La prueba simula un escenario realista, confirmando que las funcionalidades de **registro de usuarios, gestión de materiales, préstamos y devoluciones interactúan correctamente** entre sí.
  * El éxito de esta prueba aumenta significativamente la confianza en la estabilidad y coherencia lógica de la aplicación en su estado actual.