# **HU4 – Devolución de Materiales**

## 1 Análisis de requerimientos

**Objetivo de la HU4:**
Desarrollar la funcionalidad para que un usuario o bibliotecario pueda registrar la devolución de uno o más materiales pertenecientes a un "ticket" de préstamo, actualizando su disponibilidad en la biblioteca y el estado general del préstamo.

**Criterios de aceptación:**

  * El sistema debe permitir la devolución parcial de materiales de un mismo ticket de préstamo.
  * Al devolver un material, este se marca como disponible.
  * El ticket de préstamo se considera cerrado (marcando una fecha de devolución) únicamente cuando todos sus materiales han sido devueltos.
  * Se muestra un mensaje de confirmación por cada devolución exitosa.

-----

## 2 Diseño

**Clases involucradas:**

| Clase | Responsabilidad |
| :--- | :--- |
| `Prestamo` | **(Modificada)** Su estado es verificado durante la devolución. Se le asigna una `fechaDevolucion` cuando todos sus materiales son devueltos. |
| `MaterialBiblioteca` | **(Modificada)** Su atributo `disponible` se actualiza de `false` a `true` al ser devuelto. |
| `BibliotecaService` | **(Modificada)** Define el contrato para la lógica de negocio, incluyendo el nuevo método `registrarDevolucion`. |
| `InMemoryBibliotecaRepository` | **(Modificada)** Implementa la lógica para validar la devolución, actualizar el estado del material y verificar si el préstamo se ha completado. |

**Flujo de ejecución:**

```
(Usuario/Bibliotecario) -> Llama a registrarDevolucion(prestamo, materialADevolver)
                        -> Repositorio valida que el material pertenece al préstamo y no ha sido devuelto
                        -> Se ejecuta `materialADevolver.setDisponible(true)`
                        -> Se verifica si todos los materiales del `prestamo` ya están disponibles
                        -> (Si es así) Se actualiza el `prestamo` con la fecha de devolución actual
                        -> Se retorna `true` indicando éxito
```

-----

## 3 Codificación

### **3.1 `src/main/java/com/bibliotecadigital/domain/service/BibliotecaService.java` (Modificado)**

```java
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import java.util.List;

public interface BibliotecaService {
    // ... Métodos para materiales, autores y usuarios existentes ...

    // --- Métodos para préstamos ---
    Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales);
    List<Prestamo> listarPrestamos();
    
    // Método para devoluciones (Nuevo)
    boolean registrarDevolucion(Prestamo prestamo, MaterialBiblioteca material);
}
```

### **3.2 `src/main/java/com/bibliotecadigital/infrastructure/persistence/InMemoryBibliotecaRepository.java` (Modificado)**

```java
package com.bibliotecadigital.infrastructure.persistence;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryBibliotecaRepository implements BibliotecaService {
    // ... listas y contadores existentes ...
    
    // ... implementaciones de métodos existentes ...
    
    @Override
    public boolean registrarDevolucion(Prestamo prestamo, MaterialBiblioteca material) {
        if (prestamo == null || material == null) {
            throw new IllegalArgumentException("El préstamo y el material no pueden ser nulos.");
        }

        // 1. Validar que el material pertenece al préstamo
        if (!prestamo.getMateriales().contains(material)) {
            throw new IllegalArgumentException("El material no pertenece al préstamo especificado.");
        }

        // 2. Validar que el material no haya sido devuelto ya
        if (material.isDisponible()) {
            throw new IllegalStateException("El material '" + material.getTitulo() + "' ya figura como disponible.");
        }

        // 3. Actualizar el estado del material
        material.setDisponible(true);

        // 4. Verificar si el préstamo se ha completado
        boolean todosDevueltos = true;
        for (MaterialBiblioteca m : prestamo.getMateriales()) {
            if (!m.isDisponible()) {
                todosDevueltos = false;
                break;
            }
        }

        if (todosDevueltos) {
            prestamo.setFechaDevolucion(LocalDate.now());
        }

        return true;
    }
}
```

-----

## 4 Compilación

Para un proyecto Maven, no se requieren cambios en la configuración de compilación. El proceso sigue siendo el mismo.

**Comandos de compilación:**

```bash
mvn clean install
```

-----

## 5 Pruebas

### **5.1 Tests con JUnit**

`src/test/java/test/java/com/bibliotecadigital/domain/service/BibliotecaDigitalTestHU4.java`:

```java
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaDigitalTestHU4 {

    private InMemoryBibliotecaRepository biblioteca;
    private Usuario usuario;
    private Libro libro;
    private Video video;
    private Prestamo prestamo;

    @BeforeEach
    void setUp() {
        biblioteca = new InMemoryBibliotecaRepository();
        
        // Crear usuario y materiales
        biblioteca.registrarUsuario("Ana Cliente", "ana@mail.com", "abc123", RolUsuario.CLIENTE);
        usuario = biblioteca.buscarUsuarioPorEmail("ana@mail.com");

        Autor autor = new Autor(1, "Autor de Prueba");
        libro = new Libro(1, "Libro a Devolver", 2025, "/ruta/libro.pdf", "Ed. Prueba", 100);
        libro.agregarAutor(autor);
        
        video = new Video(2, "Video a Devolver", 2025, "/ruta/video.mp4", 90, "MP4");
        video.agregarAutor(autor);

        biblioteca.registrarMaterial(libro);
        biblioteca.registrarMaterial(video);
        
        // Crear un préstamo con ambos materiales
        prestamo = biblioteca.crearPrestamo(usuario, List.of(libro, video));
    }

    @Test
    void testDevolucionParcialExitosa() {
        // Act: Devolver solo el libro
        boolean resultado = biblioteca.registrarDevolucion(prestamo, libro);

        // Assert
        assertTrue(resultado, "La devolución debería ser exitosa.");
        assertTrue(libro.isDisponible(), "El libro devuelto debe estar disponible.");
        assertFalse(video.isDisponible(), "El video no devuelto debe seguir no disponible.");
        assertNull(prestamo.getFechaDevolucion(), "El préstamo no debe cerrarse en una devolución parcial.");
    }

    @Test
    void testDevolucionCompletaCierraElPrestamo() {
        // Act: Devolver ambos materiales
        biblioteca.registrarDevolucion(prestamo, libro);
        biblioteca.registrarDevolucion(prestamo, video);
        
        // Assert
        assertTrue(libro.isDisponible(), "El libro devuelto debe estar disponible.");
        assertTrue(video.isDisponible(), "El video devuelto debe estar disponible.");
        assertNotNull(prestamo.getFechaDevolucion(), "El préstamo debe tener una fecha de devolución al completarse.");
    }

    @Test
    void testDevolucionFallaSiMaterialNoPerteneceAlPrestamo() {
        // Arrange: Crear un material extra que no está en el préstamo
        Revista revista = new Revista(3, "Revista Aparte", 2025, "/ruta/revista.pdf", "Ed. Otra", 10);
        revista.agregarAutor(new Autor(2, "Otro Autor"));
        biblioteca.registrarMaterial(revista);

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.registrarDevolucion(prestamo, revista);
        });
        
        assertEquals("El material no pertenece al préstamo especificado.", exception.getMessage());
    }

    @Test
    void testDevolucionFallaSiMaterialYaFueDevuelto() {
        // Arrange: Devolvemos el libro una vez
        biblioteca.registrarDevolucion(prestamo, libro);
        
        // Act & Assert: Intentamos devolverlo de nuevo
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            biblioteca.registrarDevolucion(prestamo, libro);
        });
        
        assertEquals("El material 'Libro a Devolver' ya figura como disponible.", exception.getMessage());
    }
}
```

**Ejecutar tests:**

```bash
mvn test
```

**Resultado esperado:**

```
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

-----

**Conclusión:**

  * **HU4 está completamente implementada**: Se ha cubierto el ciclo completo de análisis, diseño, codificación y pruebas.
  * El sistema ahora soporta la devolución de materiales, tanto de forma parcial como completa, actualizando correctamente la disponibilidad y el estado del préstamo.
  * Los tests unitarios validan los casos de éxito y los escenarios de error, asegurando la robustez de la funcionalidad.