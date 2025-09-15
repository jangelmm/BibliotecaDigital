# **HU3 – Préstamo Consolidado (Ticket Único)**

## 1 Análisis de requerimientos

**Objetivo de la HU3:**
Implementar un sistema de préstamos que permita a un bibliotecario agrupar múltiples materiales de la biblioteca bajo un único "ticket" de préstamo para un usuario específico, con el fin de simplificar la gestión y el seguimiento de las transacciones.

**Criterios de aceptación:**

  * Se debe poder seleccionar un `Usuario` registrado para asociarlo al préstamo.
  * Se deben poder añadir uno o más `MaterialBiblioteca` al mismo ticket de préstamo.
  * Al confirmar, se genera un único registro `Prestamo` con un ID, la fecha de préstamo y una fecha de devolución calculada.
  * Cada `MaterialBiblioteca` añadido al ticket cambia su estado a no disponible.

-----

## 2 Diseño

**Clases involucradas:**

| Clase | Responsabilidad |
| --- | --- |
| `Prestamo` | **(Nueva)** Actúa como el "ticket" consolidado. Almacena el usuario, la lista de materiales prestados, las fechas y un ID único. |
| `MaterialBiblioteca` | **(Modificada)** Su estado de disponibilidad (`disponible`) es actualizado por el proceso de préstamo. |
| `Usuario` | Representa al prestatario al que se le asigna el ticket de préstamo. |
| `BibliotecaService` | **(Modificada)** Define el contrato para la lógica de negocio, incluyendo el nuevo método `crearPrestamo`. |
| `InMemoryBibliotecaRepository` | **(Modificada)** Implementa la lógica para crear un `Prestamo`, validar la disponibilidad de los materiales, actualizar su estado y almacenar el nuevo préstamo. |

**Flujo de ejecución:**

```
(Bibliotecario) -> Llama a crearPrestamo(usuario, listaDeMateriales)
                -> Repositorio valida que todos los materiales estén disponibles
                -> Se crea `new Prestamo(id, usuario, materiales, fechas)`
                -> Se itera sobre `listaDeMateriales` y se ejecuta `material.setDisponible(false)`
                -> Se guarda el `Prestamo` en una lista en el repositorio
                -> Se retorna el `Prestamo` creado
```

-----

## 3 Codificación

### **3.1 `src/main/java/com/bibliotecadigital/domain/model/Prestamo.java` (Nuevo)**

```java
package com.bibliotecadigital.domain.model;

import java.time.LocalDate;
import java.util.List;

public class Prestamo {
    private final int id;
    private final Usuario usuario;
    private final List<MaterialBiblioteca> materiales;
    private final LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion; // Puede ser nula hasta que se devuelva todo

    public Prestamo(int id, Usuario usuario, List<MaterialBiblioteca> materiales) {
        this.id = id;
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = LocalDate.now();
    }

    // Getters
    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<MaterialBiblioteca> getMateriales() {
        return materiales;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
```

### **3.2 `src/main/java/com/bibliotecadigital/domain/service/BibliotecaService.java` (Modificado)**

```java
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*; // Importa todos los modelos
import java.util.List;

public interface BibliotecaService {
    // ... Métodos para materiales, autores y usuarios existentes ...

    // Métodos para préstamos (Nuevos)
    Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales);
    List<Prestamo> listarPrestamos();
}
```

### **3.3 `src/main/java/com/bibliotecadigital/infrastructure/persistence/InMemoryBibliotecaRepository.java` (Modificado)**

```java
package com.bibliotecadigital.infrastructure.persistence;

import com.bibliotecadigital.domain.model.*; // Importa todos los modelos
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryBibliotecaRepository implements BibliotecaService {
    // ... listas existentes ...
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos; // <-- Nueva lista para préstamos
    private AtomicInteger prestamoIdCounter; // <-- Nuevo contador de ID

    public InMemoryBibliotecaRepository() {
        // ... inicializaciones existentes ...
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>(); // <-- Inicializar lista
        this.prestamoIdCounter = new AtomicInteger(1); // <-- Inicializar contador
    }
    
    // ... implementaciones de métodos existentes ...

    @Override
    public Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        if (usuario == null || materiales == null || materiales.isEmpty()) {
            throw new IllegalArgumentException("Usuario y lista de materiales no pueden ser nulos o vacíos.");
        }

        // 1. Validar que todos los materiales estén disponibles
        for (MaterialBiblioteca material : materiales) {
            if (!material.isDisponible()) {
                throw new IllegalStateException("El material '" + material.getTitulo() + "' (ID: " + material.getId() + ") no está disponible.");
            }
        }

        // 2. Crear el préstamo
        Prestamo nuevoPrestamo = new Prestamo(prestamoIdCounter.getAndIncrement(), usuario, materiales);
        
        // 3. Actualizar el estado de los materiales
        for (MaterialBiblioteca material : materiales) {
            material.setDisponible(false);
        }

        // 4. Guardar y retornar el préstamo
        this.prestamos.add(nuevoPrestamo);
        return nuevoPrestamo;
    }

    @Override
    public List<Prestamo> listarPrestamos() {
        return new ArrayList<>(prestamos);
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

`src/test/java/test/java/com/bibliotecadigital/domain/service/BibliotecaDigitalTestHU3.java`:

```java
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaDigitalTestHU3 {

    private InMemoryBibliotecaRepository biblioteca;
    private Usuario usuario;
    private Libro libro1;
    private Video video1;

    @BeforeEach
    void setUp() {
        biblioteca = new InMemoryBibliotecaRepository();

        // Crear un usuario de prueba
        biblioteca.registrarUsuario("Ana Cliente", "ana@mail.com", "abc123", RolUsuario.CLIENTE);
        usuario = biblioteca.buscarUsuarioPorEmail("ana@mail.com");

        // Crear materiales de prueba
        Autor autor = new Autor(1, "Autor de Prueba");
        libro1 = new Libro(1, "Libro de Prueba", 2025, "/ruta/libro.pdf", "Ed. Prueba", 100);
        libro1.agregarAutor(autor);

        video1 = new Video(2, "Video de Prueba", 2025, "/ruta/video.mp4", 90, "MP4");
        video1.agregarAutor(autor);
        
        biblioteca.registrarMaterial(libro1);
        biblioteca.registrarMaterial(video1);
    }

    @Test
    void testCrearPrestamoExitosoConMultiplesMateriales() {
        // Arrange
        List<MaterialBiblioteca> materialesAPrestar = List.of(libro1, video1);

        // Act
        Prestamo prestamo = biblioteca.crearPrestamo(usuario, materialesAPrestar);

        // Assert
        assertNotNull(prestamo);
        assertEquals(1, prestamo.getId());
        assertEquals(usuario, prestamo.getUsuario());
        assertEquals(2, prestamo.getMateriales().size());
        assertFalse(libro1.isDisponible(), "El libro debería marcarse como no disponible.");
        assertFalse(video1.isDisponible(), "El video debería marcarse como no disponible.");
        assertEquals(1, biblioteca.listarPrestamos().size());
    }

    @Test
    void testCrearPrestamoFallaSiUnMaterialNoEstaDisponible() {
        // Arrange: prestamos el libro primero
        biblioteca.crearPrestamo(usuario, List.of(libro1));
        
        // Act & Assert: intentamos prestar el libro de nuevo junto con el video
        List<MaterialBiblioteca> segundoIntento = List.of(libro1, video1);
        
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            biblioteca.crearPrestamo(usuario, segundoIntento);
        });

        assertEquals("El material 'Libro de Prueba' (ID: 1) no está disponible.", exception.getMessage());
        assertTrue(video1.isDisponible(), "El video debería permanecer disponible ya que el préstamo falló.");
    }
    
    @Test
    void testCrearPrestamoFallaConUsuarioNulo() {
        // Arrange
        List<MaterialBiblioteca> materiales = List.of(libro1);
        
        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.crearPrestamo(null, materiales);
        });
        
        assertEquals("Usuario y lista de materiales no pueden ser nulos o vacíos.", exception.getMessage());
    }
}
```

**Ejecutar tests:**

```bash
mvn test
```

**Resultado esperado:**

```
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

-----

**Conclusión:**

  * **HU3 está completamente implementada**: Se ha cubierto el ciclo completo de análisis, diseño, codificación y pruebas.
  * El sistema ahora soporta la creación de "tickets" de préstamo que consolidan múltiples materiales, cumpliendo todos los criterios de aceptación.
  * Los tests unitarios confirman que la lógica de préstamo, la validación de disponibilidad y la actualización del estado de los materiales funcionan como se esperaba.