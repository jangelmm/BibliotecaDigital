# Implementación de HU1 - Registrar Materiales en BibliotecaDigital

Voy a implementar la historia de usuario HU1 para registrar materiales en el sistema BibliotecaDigital, siguiendo una estructura MVC y utilizando JUnit para pruebas.

## Estructura de Archivos

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── bibliotecadigital/
│   │           ├── domain/
│   │           │   ├── model/
│   │           │   │   ├── MaterialBiblioteca.java
│   │           │   │   ├── Libro.java
│   │           │   │   ├── Revista.java
│   │           │   │   ├── Video.java
│   │           │   │   ├── Audio.java
│   │           │   │   └── Autor.java
│   │           │   └── service/
│   │           │       └── BibliotecaService.java
│   │           ├── infrastructure/
│   │           │   └── persistence/
│   │           │       └── InMemoryBibliotecaRepository.java
│   │           └── presentation/
│   │               └── desktop/
│   │                   └── controllers/
│   │                       └── MaterialController.java
│   └── resources/
└── test/
    └── java/
        └── com/
            └── bibliotecadigital/
                └── domain/
                    └── service/
                        └── BibliotecaServiceTest.java
```

## Implementación del Código

### 1. Clase Autor (domain/model/Autor.java)

```java
package com.bibliotecadigital.domain.model;

import java.util.Objects;

public class Autor {
    private int id;
    private String nombre;
    
    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return id == autor.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
```

### 2. Clase MaterialBiblioteca (domain/model/MaterialBiblioteca.java)

```java
package com.bibliotecadigital.domain.model;

import java.util.ArrayList;
import java.util.List;

public abstract class MaterialBiblioteca {
    protected int id;
    protected String titulo;
    protected int anio;
    protected String rutaArchivo;
    protected List<Autor> autores;
    protected boolean disponible;
    
    public MaterialBiblioteca(int id, String titulo, int anio, String rutaArchivo) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.rutaArchivo = rutaArchivo;
        this.autores = new ArrayList<>();
        this.disponible = true;
    }
    
    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }
    
    public String getRutaArchivo() { return rutaArchivo; }
    public void setRutaArchivo(String rutaArchivo) { this.rutaArchivo = rutaArchivo; }
    
    public List<Autor> getAutores() { return autores; }
    public void setAutores(List<Autor> autores) { this.autores = autores; }
    
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    
    public void agregarAutor(Autor autor) {
        if (!autores.contains(autor)) {
            autores.add(autor);
        }
    }
    
    public void removerAutor(Autor autor) {
        autores.remove(autor);
    }
    
    // Métodos abstractos
    public abstract String mostrarInformacion();
    public abstract String generarCitaAPA();
    
    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Año: " + anio + 
               ", Autores: " + autores + ", Disponible: " + disponible;
    }
}
```

### 3. Clase Libro (domain/model/Libro.java)

```java
package com.bibliotecadigital.domain.model;

public class Libro extends MaterialBiblioteca {
    private String editorial;
    private int numPaginas;
    
    public Libro(int id, String titulo, int anio, String rutaArchivo, 
                 String editorial, int numPaginas) {
        super(id, titulo, anio, rutaArchivo);
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }
    
    // Getters y setters específicos
    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }
    
    public int getNumPaginas() { return numPaginas; }
    public void setNumPaginas(int numPaginas) { this.numPaginas = numPaginas; }
    
    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("LIBRO\n");
        info.append("ID: ").append(id).append("\n");
        info.append("Título: ").append(titulo).append("\n");
        info.append("Año: ").append(anio).append("\n");
        info.append("Autores: ").append(autores).append("\n");
        info.append("Editorial: ").append(editorial).append("\n");
        info.append("Número de páginas: ").append(numPaginas).append("\n");
        info.append("Ruta de archivo: ").append(rutaArchivo).append("\n");
        info.append("Disponible: ").append(disponible ? "Sí" : "No").append("\n");
        return info.toString();
    }
    
    @Override
    public String generarCitaAPA() {
        if (autores.isEmpty()) {
            return titulo + " (" + anio + "). " + editorial + ".";
        }
        
        StringBuilder cita = new StringBuilder();
        cita.append(autores.get(0).getNombre());
        
        if (autores.size() > 1) {
            cita.append(" et al.");
        }
        
        cita.append(" (").append(anio).append("). ");
        cita.append(titulo).append(". ");
        cita.append(editorial).append(".");
        
        return cita.toString();
    }
}
```

### 4. Clase Revista (domain/model/Revista.java)

```java
package com.bibliotecadigital.domain.model;

public class Revista extends MaterialBiblioteca {
    private String editorial;
    private int numero;
    
    public Revista(int id, String titulo, int anio, String rutaArchivo, 
                   String editorial, int numero) {
        super(id, titulo, anio, rutaArchivo);
        this.editorial = editorial;
        this.numero = numero;
    }
    
    // Getters y setters específicos
    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }
    
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    
    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("REVISTA\n");
        info.append("ID: ").append(id).append("\n");
        info.append("Título: ").append(titulo).append("\n");
        info.append("Año: ").append(anio).append("\n");
        info.append("Autores: ").append(autores).append("\n");
        info.append("Editorial: ").append(editorial).append("\n");
        info.append("Número: ").append(numero).append("\n");
        info.append("Ruta de archivo: ").append(rutaArchivo).append("\n");
        info.append("Disponible: ").append(disponible ? "Sí" : "No").append("\n");
        return info.toString();
    }
    
    @Override
    public String generarCitaAPA() {
        if (autores.isEmpty()) {
            return titulo + " (" + anio + "). " + editorial + ", " + numero + ".";
        }
        
        StringBuilder cita = new StringBuilder();
        cita.append(autores.get(0).getNombre());
        
        if (autores.size() > 1) {
            cita.append(" et al.");
        }
        
        cita.append(" (").append(anio).append("). ");
        cita.append(titulo).append(". ");
        cita.append(editorial).append(", ").append(numero).append(".");
        
        return cita.toString();
    }
}
```

### 5. Clase Video (domain/model/Video.java)

```java
package com.bibliotecadigital.domain.model;

public class Video extends MaterialBiblioteca {
    private float duracion;
    private String formato;
    
    public Video(int id, String titulo, int anio, String rutaArchivo, 
                 float duracion, String formato) {
        super(id, titulo, anio, rutaArchivo);
        this.duracion = duracion;
        this.formato = formato;
    }
    
    // Getters y setters específicos
    public float getDuracion() { return duracion; }
    public void setDuracion(float duracion) { this.duracion = duracion; }
    
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    
    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("VIDEO\n");
        info.append("ID: ").append(id).append("\n");
        info.append("Título: ").append(titulo).append("\n");
        info.append("Año: ").append(anio).append("\n");
        info.append("Autores: ").append(autores).append("\n");
        info.append("Duración: ").append(duracion).append(" minutos\n");
        info.append("Formato: ").append(formato).append("\n");
        info.append("Ruta de archivo: ").append(rutaArchivo).append("\n");
        info.append("Disponible: ").append(disponible ? "Sí" : "No").append("\n");
        return info.toString();
    }
    
    @Override
    public String generarCitaAPA() {
        if (autores.isEmpty()) {
            return titulo + " [" + formato + "]. (" + anio + ").";
        }
        
        StringBuilder cita = new StringBuilder();
        cita.append(autores.get(0).getNombre());
        
        if (autores.size() > 1) {
            cita.append(" et al.");
        }
        
        cita.append(" (").append(anio).append("). ");
        cita.append(titulo).append(" [").append(formato).append("].");
        
        return cita.toString();
    }
}
```

### 6. Clase Audio (domain/model/Audio.java)

```java
package com.bibliotecadigital.domain.model;

public class Audio extends MaterialBiblioteca {
    private float duracion;
    private String formato;
    
    public Audio(int id, String titulo, int anio, String rutaArchivo, 
                 float duracion, String formato) {
        super(id, titulo, anio, rutaArchivo);
        this.duracion = duracion;
        this.formato = formato;
    }
    
    // Getters y setters específicos
    public float getDuracion() { return duracion; }
    public void setDuracion(float duracion) { this.duracion = duracion; }
    
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    
    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("AUDIO\n");
        info.append("ID: ").append(id).append("\n");
        info.append("Título: ").append(titulo).append("\n");
        info.append("Año: ").append(anio).append("\n");
        info.append("Autores: ").append(autores).append("\n");
        info.append("Duración: ").append(duracion).append(" minutos\n");
        info.append("Formato: ").append(formato).append("\n");
        info.append("Ruta de archivo: ").append(rutaArchivo).append("\n");
        info.append("Disponible: ").append(disponible ? "Sí" : "No").append("\n");
        return info.toString();
    }
    
    @Override
    public String generarCitaAPA() {
        if (autores.isEmpty()) {
            return titulo + " [" + formato + "]. (" + anio + ").";
        }
        
        StringBuilder cita = new StringBuilder();
        cita.append(autores.get(0).getNombre());
        
        if (autores.size() > 1) {
            cita.append(" et al.");
        }
        
        cita.append(" (").append(anio).append("). ");
        cita.append(titulo).append(" [").append(formato).append("].");
        
        return cita.toString();
    }
}
```

### 7. Interfaz del Repositorio (domain/service/BibliotecaService.java)

```java
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import java.util.List;

public interface BibliotecaService {
    // Métodos para materiales
    MaterialBiblioteca registrarMaterial(MaterialBiblioteca material);
    MaterialBiblioteca buscarMaterialPorId(int id);
    List<MaterialBiblioteca> listarMateriales();
    List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo);
    List<MaterialBiblioteca> buscarMaterialesPorAutor(String autor);
    
    // Métodos para autores
    Autor registrarAutor(Autor autor);
    Autor buscarAutorPorId(int id);
    List<Autor> listarAutores();
    
    // Validaciones
    boolean validarMaterial(MaterialBiblioteca material);
}
```

### 8. Implementación del Repositorio (infrastructure/persistence/InMemoryBibliotecaRepository.java)

```java
package com.bibliotecadigital.infrastructure.persistence;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryBibliotecaRepository implements BibliotecaService {
    private List<MaterialBiblioteca> materiales;
    private List<Autor> autores;
    private AtomicInteger materialIdCounter;
    private AtomicInteger autorIdCounter;
    
    public InMemoryBibliotecaRepository() {
        this.materiales = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.materialIdCounter = new AtomicInteger(1);
        this.autorIdCounter = new AtomicInteger(1);
    }
    
    @Override
    public MaterialBiblioteca registrarMaterial(MaterialBiblioteca material) {
        if (!validarMaterial(material)) {
            throw new IllegalArgumentException("Datos del material incompletos o inválidos");
        }
        
        // Asignar ID único si no tiene uno
        if (material.getId() == 0) {
            material.setId(materialIdCounter.getAndIncrement());
        }
        
        materiales.add(material);
        return material;
    }
    
    @Override
    public MaterialBiblioteca buscarMaterialPorId(int id) {
        return materiales.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    @Override
    public List<MaterialBiblioteca> listarMateriales() {
        return new ArrayList<>(materiales);
    }
    
    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        for (MaterialBiblioteca material : materiales) {
            if (material.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(material);
            }
        }
        return resultados;
    }
    
    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorAutor(String autor) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        for (MaterialBiblioteca material : materiales) {
            for (Autor a : material.getAutores()) {
                if (a.getNombre().toLowerCase().contains(autor.toLowerCase())) {
                    resultados.add(material);
                    break;
                }
            }
        }
        return resultados;
    }
    
    @Override
    public Autor registrarAutor(Autor autor) {
        if (autor.getNombre() == null || autor.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del autor es obligatorio");
        }
        
        // Asignar ID único si no tiene uno
        if (autor.getId() == 0) {
            autor.setId(autorIdCounter.getAndIncrement());
        }
        
        autores.add(autor);
        return autor;
    }
    
    @Override
    public Autor buscarAutorPorId(int id) {
        return autores.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    @Override
    public List<Autor> listarAutores() {
        return new ArrayList<>(autores);
    }
    
    @Override
    public boolean validarMaterial(MaterialBiblioteca material) {
        if (material == null) return false;
        if (material.getTitulo() == null || material.getTitulo().trim().isEmpty()) return false;
        if (material.getAnio() <= 0) return false;
        if (material.getRutaArchivo() == null || material.getRutaArchivo().trim().isEmpty()) return false;
        if (material.getAutores() == null || material.getAutores().isEmpty()) return false;
        
        return true;
    }
}
```

### 9. Controlador (presentation/desktop/controllers/MaterialController.java)

```java
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.util.List;

public class MaterialController {
    private BibliotecaService bibliotecaService;
    
    public MaterialController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }
    
    public MaterialBiblioteca registrarMaterial(MaterialBiblioteca material) {
        return bibliotecaService.registrarMaterial(material);
    }
    
    public MaterialBiblioteca buscarMaterialPorId(int id) {
        return bibliotecaService.buscarMaterialPorId(id);
    }
    
    public List<MaterialBiblioteca> listarMateriales() {
        return bibliotecaService.listarMateriales();
    }
    
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        return bibliotecaService.buscarMaterialesPorTitulo(titulo);
    }
    
    public List<MaterialBiblioteca> buscarMaterialesPorAutor(String autor) {
        return bibliotecaService.buscarMaterialesPorAutor(autor);
    }
    
    public Autor registrarAutor(Autor autor) {
        return bibliotecaService.registrarAutor(autor);
    }
    
    public Autor buscarAutorPorId(int id) {
        return bibliotecaService.buscarAutorPorId(id);
    }
    
    public List<Autor> listarAutores() {
        return bibliotecaService.listarAutores();
    }
}
```

### 10. Pruebas Unitarias (test/java/domain/service/BibliotecaServiceTest.java)

```java
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BibliotecaServiceTest {
    private InMemoryBibliotecaRepository bibliotecaService;
    
    @BeforeEach
    void setUp() {
        bibliotecaService = new InMemoryBibliotecaRepository();
    }
    
    @Test
    void testRegistrarMaterialValido() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        Libro registrado = (Libro) bibliotecaService.registrarMaterial(libro);
        
        assertNotNull(registrado);
        assertTrue(registrado.getId() > 0);
        assertEquals("Cien años de soledad", registrado.getTitulo());
        assertEquals(1967, registrado.getAnio());
        assertEquals("/ruta/cien-anios-soledad.pdf", registrado.getRutaArchivo());
        assertEquals("Editorial Sudamericana", registrado.getEditorial());
        assertEquals(432, registrado.getNumPaginas());
        assertTrue(registrado.isDisponible());
    }
    
    @Test
    void testRegistrarMaterialInvalido() {
        // Libro sin título (debería fallar)
        Libro libro = new Libro(0, "", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        
        assertThrows(IllegalArgumentException.class, () -> {
            bibliotecaService.registrarMaterial(libro);
        });
    }
    
    @Test
    void testRegistrarMaterialConMultiplesAutores() {
        Autor autor1 = new Autor(1, "Gabriel García Márquez");
        Autor autor2 = new Autor(2, "Mario Vargas Llosa");
        bibliotecaService.registrarAutor(autor1);
        bibliotecaService.registrarAutor(autor2);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor1);
        libro.agregarAutor(autor2);
        
        Libro registrado = (Libro) bibliotecaService.registrarMaterial(libro);
        
        assertNotNull(registrado);
        assertEquals(2, registrado.getAutores().size());
        assertTrue(registrado.getAutores().contains(autor1));
        assertTrue(registrado.getAutores().contains(autor2));
    }
    
    @Test
    void testBuscarMaterialPorId() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        Libro registrado = (Libro) bibliotecaService.registrarMaterial(libro);
        int id = registrado.getId();
        
        MaterialBiblioteca encontrado = bibliotecaService.buscarMaterialPorId(id);
        
        assertNotNull(encontrado);
        assertEquals(id, encontrado.getId());
        assertEquals("Cien años de soledad", encontrado.getTitulo());
    }
    
    @Test
    void testBuscarMaterialPorTitulo() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        bibliotecaService.registrarMaterial(libro);
        
        List<MaterialBiblioteca> resultados = bibliotecaService.buscarMaterialesPorTitulo("soledad");
        
        assertFalse(resultados.isEmpty());
        assertEquals("Cien años de soledad", resultados.get(0).getTitulo());
    }
    
    @Test
    void testBuscarMaterialPorAutor() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro.agregarAutor(autor);
        
        bibliotecaService.registrarMaterial(libro);
        
        List<MaterialBiblioteca> resultados = bibliotecaService.buscarMaterialesPorAutor("García");
        
        assertFalse(resultados.isEmpty());
        assertEquals("Cien años de soledad", resultados.get(0).getTitulo());
    }
    
    @Test
    void testListarMateriales() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        bibliotecaService.registrarAutor(autor);
        
        Libro libro1 = new Libro(0, "Cien años de soledad", 1967, 
                                "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
        libro1.agregarAutor(autor);
        
        Libro libro2 = new Libro(0, "El amor en los tiempos del cólera", 1985, 
                                "/ruta/amor-tiempos-colera.pdf", "Editorial Oveja Negra", 368);
        libro2.agregarAutor(autor);
        
        bibliotecaService.registrarMaterial(libro1);
        bibliotecaService.registrarMaterial(libro2);
        
        List<MaterialBiblioteca> materiales = bibliotecaService.listarMateriales();
        
        assertEquals(2, materiales.size());
    }
    
    @Test
    void testRegistrarAutor() {
        Autor autor = new Autor(0, "Gabriel García Márquez");
        Autor registrado = bibliotecaService.registrarAutor(autor);
        
        assertNotNull(registrado);
        assertTrue(registrado.getId() > 0);
        assertEquals("Gabriel García Márquez", registrado.getNombre());
    }
    
    @Test
    void testBuscarAutorPorId() {
        Autor autor = new Autor(0, "Gabriel García Márquez");
        Autor registrado = bibliotecaService.registrarAutor(autor);
        int id = registrado.getId();
        
        Autor encontrado = bibliotecaService.buscarAutorPorId(id);
        
        assertNotNull(encontrado);
        assertEquals(id, encontrado.getId());
        assertEquals("Gabriel García Márquez", encontrado.getNombre());
    }
    
    @Test
    void testListarAutores() {
        Autor autor1 = new Autor(0, "Gabriel García Márquez");
        Autor autor2 = new Autor(0, "Mario Vargas Llosa");
        
        bibliotecaService.registrarAutor(autor1);
        bibliotecaService.registrarAutor(autor2);
        
        List<Autor> autores = bibliotecaService.listarAutores();
        
        assertEquals(2, autores.size());
    }
}
```

## Ejemplo de Uso

```java
// Crear el servicio y controlador
BibliotecaService servicio = new InMemoryBibliotecaRepository();
MaterialController controlador = new MaterialController(servicio);

// Registrar autores
Autor autor1 = controlador.registrarAutor(new Autor(0, "Gabriel García Márquez"));
Autor autor2 = controlador.registrarAutor(new Autor(0, "Mario Vargas Llosa"));

// Registrar un libro
Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                       "/ruta/cien-anios-soledad.pdf", "Editorial Sudamericana", 432);
libro.agregarAutor(autor1);

Libro registrado = (Libro) controlador.registrarMaterial(libro);
System.out.println("Libro registrado: " + registrado.getTitulo());

// Buscar materiales por título
List<MaterialBiblioteca> resultados = controlador.buscarMaterialesPorTitulo("soledad");
System.out.println("Resultados de búsqueda: " + resultados.size());

// Listar todos los materiales
List<MaterialBiblioteca> todos = controlador.listarMateriales();
System.out.println("Total de materiales: " + todos.size());
```

## Conclusión

Esta implementación cumple con todos los criterios de aceptación de la HU1:

1. ✅ Registra materiales con todos los campos requeridos
2. ✅ Valida datos obligatorios (título, autor, año, tipo, ruta de archivo)
3. ✅ Asigna ID único a cada material
4. ✅ Permite registrar múltiples autores por material
5. ✅ Implementa las clases necesarias con la relación muchos-a-muchos
6. ✅ Incluye pruebas unitarias con JUnit

La estructura sigue el patrón MVC y está preparada para una futura migración a una aplicación web, ya que la lógica de negocio está completamente separada de la presentación.