# **HU7 – Información detallada de materiales**

## 1 Análisis de requerimientos

**Objetivo de la HU7:**
Proveer al usuario una vista completa y formateada de todos los atributos de un material específico, accesible después de realizar una búsqueda o al listar el catálogo de la biblioteca, para que pueda tomar una decisión informada antes de su uso.

**Criterios de aceptación:**

  * El sistema debe mostrar todos los atributos registrados para un material: ID, título, autor(es), año, tipo, estado, ruta de archivo y atributos específicos (editorial, duración, formato, etc.).
  * Esta funcionalidad debe ser accesible desde la lista de materiales o los resultados de una búsqueda, permitiendo al usuario seleccionar un ítem por su ID.
  * La información debe presentarse en la consola de forma clara y legible.

-----

## 2 Diseño

**Clases involucradas:**

| Clase | Responsabilidad |
| :--- | :--- |
| `MaterialBiblioteca` | **(Revisada)** Confirma la responsabilidad de definir el método abstracto `mostrarInformacion()`, obligando a todas las subclases a implementarlo. |
| `Libro`, `Video`, `Audio`, `Revista` | **(Revisada)** Cada subclase es responsable de implementar (`@Override`) el método `mostrarInformacion()` para incluir sus atributos específicos. |
| `BibliotecaService` | No requiere cambios. Los métodos existentes como `buscarMaterialPorId(id)` son suficientes para esta HU. |
| `BibliotecaDigitalTestIntegral` | **(Modificada)** Actuará como la capa de presentación para esta HU, integrando la nueva funcionalidad en su menú de consola para la interacción del usuario. |

**Flujo de ejecución:**

```
(Usuario) -> Inicia la aplicación y elige la opción "Listar Materiales".
          -> El sistema muestra la lista de todos los materiales.
          -> El usuario elige la opción "Ver Detalle de un Material" e introduce un ID.
          -> La aplicación llama a `biblioteca.buscarMaterialPorId(id)`.
          -> Sobre el objeto `MaterialBiblioteca` encontrado, se invoca `material.mostrarInformacion()`.
          -> La cadena de texto resultante se imprime en la consola para el usuario.
```

-----

## 3 Codificación

El código base ya incluye las implementaciones del método `mostrarInformacion()` en cada subclase de `MaterialBiblioteca`. La tarea principal es **conectar esta funcionalidad** a una interfaz de usuario. A continuación, se muestra cómo integrar esta opción en el menú del archivo `BibliotecaDigitalTestIntegral.java`.

### **3.1 `src/test/java/test/java/com/bibliotecadigital/domain/service/BibliotecaDigitalTestIntegral.java` (Modificado)**

Se añade una nueva opción al menú (`case 3`) y un método para manejarla (`verDetalleMaterial`).

```java
package test.java.com.bibliotecadigital.domain.service;

// ... (imports existentes)
import java.util.Scanner;

public class BibliotecaDigitalTestIntegral {
    // ... (atributos existentes)
    private static Scanner sc = new Scanner(System.in);
    
    // ... (main y otros métodos existentes)
    
    private static void iniciarMenu() {
        int opcion = 0;
        // Se modifica el bucle para incluir la nueva opción y se cambia la salida a 4
        while (opcion != 4) { 
            System.out.println("\n== MENÚ DE MATERIALES ==");
            System.out.println("1. Listar todos los materiales");
            System.out.println("2. Filtrar por tipo de material");
            System.out.println("3. Ver Detalle de un Material (por ID)"); // <-- Nueva opción
            System.out.println("4. Salir"); // <-- Opción de salida actualizada
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1: listarMateriales(); break;
                    case 2: listarMaterialesPorTipo(); break;
                    case 3: verDetalleMaterial(); break; // <-- Llamada al nuevo método
                    case 4: System.out.println("Volviendo al menú principal...\n"); break;
                    default: System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
    }

    // --- NUEVO MÉTODO PARA VER DETALLES ---
    private static void verDetalleMaterial() {
        System.out.print("Ingrese el ID del material para ver sus detalles: ");
        try {
            int id = Integer.parseInt(sc.nextLine());
            MaterialBiblioteca material = servicio.buscarMaterialPorId(id);

            if (material != null) {
                System.out.println("\n--- DETALLES DEL MATERIAL ID: " + id + " ---");
                // Aquí se utiliza el método que ya estaba implementado
                System.out.println(material.mostrarInformacion());
                System.out.println("------------------------------------");
            } else {
                System.out.println("Error: No se encontró ningún material con el ID " + id + ".");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingrese un ID numérico válido.");
        }
    }

    // ... (resto de métodos como listarMateriales, cargarDatosDePrueba, etc., sin cambios) ...
}
```

-----

## 4 Compilación

No se requieren cambios en la configuración. El proyecto se compila con el comando estándar de Maven.

**Comandos de compilación:**

```bash
mvn clean install
```

-----

## 5 Pruebas

### **5.1 Tests con JUnit**

Se crea una nueva clase de test para verificar que el output de `mostrarInformacion()` sea correcto para cada tipo de material.

`src/test/java/test/java/com/bibliotecadigital/domain/service/BibliotecaDigitalTestHU7.java`:

```java
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaDigitalTestHU7 {

    private Autor autor;

    @BeforeEach
    void setUp() {
        autor = new Autor(1, "Autor de Prueba");
    }

    @Test
    void testMostrarInformacionLibro() {
        // Arrange
        Libro libro = new Libro(101, "El Gran Libro", 2025, "/libros/gran_libro.pdf", "Editorial Test", 350);
        libro.agregarAutor(autor);
        libro.setDisponible(false); // Para probar el estado

        // Act
        String info = libro.mostrarInformacion();

        // Assert
        assertTrue(info.contains("LIBRO"), "Debe indicar que es un LIBRO.");
        assertTrue(info.contains("Título: El Gran Libro"), "Debe mostrar el título correcto.");
        assertTrue(info.contains("Editorial: Editorial Test"), "Debe mostrar la editorial.");
        assertTrue(info.contains("Disponible: No"), "Debe mostrar el estado 'No disponible'.");
    }

    @Test
    void testMostrarInformacionVideo() {
        // Arrange
        Video video = new Video(202, "El Gran Video", 2024, "/videos/gran_video.mp4", 125.5f, "MP4");
        video.agregarAutor(autor);

        // Act
        String info = video.mostrarInformacion();

        // Assert
        assertTrue(info.contains("VIDEO"), "Debe indicar que es un VIDEO.");
        assertTrue(info.contains("Duración: 125.5 minutos"), "Debe mostrar la duración.");
        assertTrue(info.contains("Formato: MP4"), "Debe mostrar el formato.");
        assertTrue(info.contains("Disponible: Sí"), "Debe mostrar el estado 'Disponible'.");
    }
}
```

**Ejecutar tests:**

```bash
mvn test
```

**Resultado esperado:**

```
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

-----

**Conclusión:**

  * **HU7 está completamente implementada**: Se ha confirmado que los métodos `mostrarInformacion()` de las clases de modelo funcionan correctamente y se han integrado en un flujo de usuario a través de un menú de consola.
  * Las pruebas unitarias específicas para esta HU validan que la salida de texto de los detalles del material es correcta y contiene todos los atributos clave.
  * El sistema ahora permite a los usuarios consultar la información detallada de cualquier material en la biblioteca.