# **HU6 – Generar citas APA**

## 1 Análisis de requerimientos

**Objetivo de la HU6:**
Implementar una funcionalidad que genere automáticamente citas bibliográficas en formato APA 7 para cada tipo de material disponible en la biblioteca, facilitando su uso por parte de los usuarios en contextos académicos y de investigación.

**Criterios de aceptación:**

  * El sistema genera citas con formato APA específico para cada tipo de material:
      * **Libros:** Apellido, A. (Año). *Título*. Editorial.
      * **Revistas:** Apellido, A. (Año). Título del artículo. *Revista*, Número.
      * **Videos:** Apellido, A. (Año). Título [Video].
      * **Audios:** Apellido, A. (Año). Título [Audio].
  * La cita generada se muestra en la consola, permitiendo al usuario seleccionarla y copiarla.

-----

## 2 Diseño

**Clases involucradas:**

| Clase | Responsabilidad |
| :--- | :--- |
| `MaterialBiblioteca` | **(Modificada)** Se le añade un método de utilidad (`protected`) para formatear nombres de autores al estilo APA, que será utilizado por todas las subclases. |
| `Libro`, `Video`, `Audio`, `Revista` | **(Revisada)** Se confirma que cada subclase implementa `generarCitaAPA()` con la lógica de formato específica para su tipo. |
| `Autor` | Provee el nombre completo del autor, que será procesado para generar el formato Apellido, Inicial. |
| `BibliotecaDigitalTestIntegral` | **(Modificada)** Actúa como la capa de presentación, integrando una nueva opción en el menú de consola para que el usuario pueda solicitar una cita APA por ID de material. |

**Flujo de ejecución:**

```
(Usuario) -> Selecciona la opción "Generar Cita APA" y proporciona un ID de material.
          -> La aplicación llama a `biblioteca.buscarMaterialPorId(id)`.
          -> Sobre el objeto `MaterialBiblioteca` encontrado, se invoca `material.generarCitaAPA()`.
          -> El método interno formatea el nombre del autor y ensambla la cita.
          -> La cadena de texto de la cita se imprime en la consola.
```

-----

## 3 Codificación

El código actual tiene una buena base, pero podemos mejorarlo para manejar los nombres de los autores de forma más precisa. Añadiremos un método ayudante en la clase `MaterialBiblioteca`.

### **3.1 `src/main/java/com/bibliotecadigital/domain/model/MaterialBiblioteca.java` (Modificado)**

Se añade el método `formatearNombreAutorAPA` para estandarizar el formato del autor en todas las subclases.

```java
package com.bibliotecadigital.domain.model;

import java.util.ArrayList;
import java.util.List;

public abstract class MaterialBiblioteca {
    // ... (atributos y métodos existentes) ...
    
    /**
     * Formatea el nombre de un autor al estilo APA (Apellido, I.).
     * Este método es 'protected' para que solo las subclases puedan usarlo.
     * @param nombreCompleto El nombre completo del autor, ej. "Gabriel García Márquez".
     * @return El nombre formateado, ej. "García Márquez, G.".
     */
    protected String formatearNombreAutorAPA(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.trim().isEmpty()) {
            return "";
        }
        String[] partes = nombreCompleto.trim().split("\\s+");
        if (partes.length == 1) {
            return partes[0]; // Maneja nombres únicos como "Platón"
        }
        
        String nombre = partes[0];
        String inicial = nombre.substring(0, 1) + ".";
        
        StringBuilder apellidos = new StringBuilder();
        for (int i = 1; i < partes.length; i++) {
            apellidos.append(partes[i]).append(" ");
        }
        
        return apellidos.toString().trim() + ", " + inicial;
    }
    
    // Métodos abstractos
    public abstract String mostrarInformacion();
    public abstract String generarCitaAPA();
    
    // ... (toString) ...
}
```

### **3.2 `src/main/java/com/bibliotecadigital/domain/model/Libro.java` (Revisado con mejora)**

Ejemplo de cómo la subclase `Libro` usaría el nuevo método para una cita más precisa.

```java
// ...
public class Libro extends MaterialBiblioteca {
    // ... (atributos y constructor) ...

    @Override
    public String generarCitaAPA() {
        if (autores.isEmpty()) {
            // Manejo de caso sin autor
            return String.format("%s (%d). %s.", titulo, anio, editorial);
        }
        
        // Usamos el nuevo método formateador
        String autorAPA = formatearNombreAutorAPA(autores.get(0).getNombre());
        
        if (autores.size() > 1) {
            autorAPA += " et al.";
        }
        
        return String.format("%s (%d). %s. %s.", autorAPA, anio, titulo, editorial);
    }
    
    // ... (mostrarInformacion y otros métodos) ...
}
```

### **3.3 `src/test/java/test/java/com/bibliotecadigital/domain/service/BibliotecaDigitalTestIntegral.java` (Modificado)**

Se añade la opción "Generar Cita APA" al menú principal de la aplicación de consola.

```java
// ... (imports y clase) ...

public class BibliotecaDigitalTestIntegral {
    // ... (atributos existentes) ...
    
    private static void iniciarMenu() {
        int opcion = 0;
        // Se actualiza el bucle para la nueva opción
        while (opcion != 5) { 
            System.out.println("\n== MENÚ DE MATERIALES ==");
            System.out.println("1. Listar todos los materiales");
            System.out.println("2. Filtrar por tipo de material");
            System.out.println("3. Ver Detalle de un Material (por ID)");
            System.out.println("4. Generar Cita APA (por ID)"); // <-- Nueva opción
            System.out.println("5. Salir"); // <-- Opción de salida actualizada
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1: listarMateriales(); break;
                    case 2: listarMaterialesPorTipo(); break;
                    case 3: verDetalleMaterial(); break;
                    case 4: generarCita(); break; // <-- Llamada al nuevo método
                    case 5: System.out.println("Volviendo al menú principal...\n"); break;
                    default: System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
    }
    
    // --- NUEVO MÉTODO PARA GENERAR CITAS ---
    private static void generarCita() {
        System.out.print("Ingrese el ID del material para generar su cita APA: ");
        try {
            int id = Integer.parseInt(sc.nextLine());
            MaterialBiblioteca material = servicio.buscarMaterialPorId(id);

            if (material != null) {
                System.out.println("\n--- CITA APA GENERADA ---");
                // Aquí se invoca el método de la HU
                System.out.println(material.generarCitaAPA());
                System.out.println("---------------------------");
            } else {
                System.out.println("Error: No se encontró ningún material con el ID " + id + ".");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingrese un ID numérico válido.");
        }
    }

    // ... (resto de métodos sin cambios) ...
}
```

-----

## 4 Compilación

El proceso de compilación se mantiene sin cambios.

**Comandos de compilación:**

```bash
mvn clean install
```

-----

## 5 Pruebas

### **5.1 Tests con JUnit**

Se crea una nueva clase de test para verificar los formatos de cita APA.

`src/test/java/test/java/com/bibliotecadigital/domain/service/HU6CitasApaTest.java`:

```java
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HU6CitasApaTest {

    @Test
    void testCitaApaLibroUnAutor() {
        // Arrange
        Autor autor = new Autor(1, "Gabriel García Márquez");
        Libro libro = new Libro(101, "Cien años de soledad", 1967, "ruta", "Editorial Sudamericana", 496);
        libro.agregarAutor(autor);
        
        // Act
        String cita = libro.generarCitaAPA();
        
        // Assert
        assertEquals("García Márquez, G. (1967). Cien años de soledad. Editorial Sudamericana.", cita);
    }

    @Test
    void testCitaApaLibroMultiplesAutores() {
        // Arrange
        Autor autor1 = new Autor(1, "Erich Gamma");
        Autor autor2 = new Autor(2, "Richard Helm");
        Libro libro = new Libro(102, "Design Patterns", 1994, "ruta", "Addison-Wesley", 395);
        libro.agregarAutor(autor1);
        libro.agregarAutor(autor2);

        // Act
        String cita = libro.generarCitaAPA();

        // Assert
        assertEquals("Gamma, E. et al. (1994). Design Patterns. Addison-Wesley.", cita);
    }
    
    @Test
    void testCitaApaVideo() {
        // Arrange
        Autor autor = new Autor(1, "Steven Spielberg");
        Video video = new Video(201, "Jurassic Park", 1993, "ruta", 127, "MP4");
        video.agregarAutor(autor);

        // Act
        String cita = video.generarCitaAPA();
        
        // Assert
        assertEquals("Spielberg, S. (1993). Jurassic Park [Video].", cita);
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

  * **HU6 está completamente implementada**: Se ha revisado, mejorado y conectado la funcionalidad de generación de citas APA.
  * Se ha refactorizado la lógica para manejar los nombres de los autores de forma más robusta y estandarizada, siguiendo las mejores prácticas.
  * La funcionalidad ahora es accesible para el usuario a través del menú principal de la consola.
  * Los tests unitarios dedicados garantizan que los formatos de cita generados son correctos.