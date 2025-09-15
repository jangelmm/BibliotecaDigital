# Estructura del proyecto

```
BibliotecaDigital
├── BibliotecaDigital
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       ├── bibliotecadigital
│   │   │   │       │   ├── domain
│   │   │   │       │   │   ├── model
│   │   │   │       │   │   │   ├── Audio.java
│   │   │   │       │   │   │   ├── Autor.java
│   │   │   │       │   │   │   ├── Libro.java
│   │   │   │       │   │   │   ├── MaterialBiblioteca.java
│   │   │   │       │   │   │   ├── Prestamo.java
│   │   │   │       │   │   │   ├── Revista.java
│   │   │   │       │   │   │   ├── RolUsuario.java
│   │   │   │       │   │   │   ├── Usuario.java
│   │   │   │       │   │   │   └── Video.java
│   │   │   │       │   │   └── service
│   │   │   │       │   │       ├── AuthenticationService.java
│   │   │   │       │   │       └── BibliotecaService.java
│   │   │   │       │   ├── infrastructure
│   │   │   │       │   │   └── persistence
│   │   │   │       │   │       ├── InMemoryBibliotecaRepository.java
│   │   │   │       │   │       └── JpaBibliotecaRepository.java
│   │   │   │       │   └── presentation
│   │   │   │       │       └── desktop
│   │   │   │       │           ├── controllers
│   │   │   │       │           │   ├── GestionAutoresController.java
│   │   │   │       │           │   └── MaterialController.java
│   │   │   │       │           └── views
│   │   │   │       │               ├── GestionAutoresView.form
│   │   │   │       │               ├── GestionAutoresView.java
│   │   │   │       │               └── GestionAutoresViewInterface.java
│   │   │   │       └── mycompany
│   │   │   │           └── bibliotecadigital
│   │   │   │               └── BibliotecaDigital.java
│   │   │   └── resources
│   │   │       └── META-INF
│   │   │           └── persistence.xml
│   │   └── test
│   │       └── java
│   │           └── test
│   │               └── java
│   │                   └── com
│   │                       └── bibliotecadigital
│   │                           └── domain
│   │                               └── service
│   │                                   ├── BibliotecaServiceTest.java
│   │                                   ├── HU10BibliotecaDigitalTest.java
│   │                                   ├── HU11PersistenciaTest.java
│   │                                   ├── HU12JpaRepositoryTest.java
│   │                                   ├── HU14AutoresCrudTest.java
│   │                                   ├── HU1BibliotecaDigitalTest.java
│   │                                   ├── HU2BibliotecaDigitalTest.java
│   │                                   ├── HU3BibliotecaDigitalTest.java
│   │                                   ├── HU4BibliotecaDigitalTest.java
│   │                                   ├── HU5BibliotecaDigitalTest.java
│   │                                   ├── HU6CitasApaTest.java
│   │                                   ├── HU7BibliotecaDigitalTest.java
│   │                                   ├── HU8BibliotecaDigitalTest.java
│   │                                   ├── HU9BibliotecaDigitalTest.java
│   │                                   └── IntegralBibliotecaDigitalTest.java
│   ├── target
│   │   ├── classes
│   │   │   ├── META-INF
│   │   │   │   └── persistence.xml
│   │   │   └── com
│   │   │       ├── bibliotecadigital
│   │   │       │   ├── domain
│   │   │       │   │   ├── model
│   │   │       │   │   │   ├── Audio.class
│   │   │       │   │   │   ├── Autor.class
│   │   │       │   │   │   ├── Libro.class
│   │   │       │   │   │   ├── MaterialBiblioteca.class
│   │   │       │   │   │   ├── Prestamo.class
│   │   │       │   │   │   ├── Revista.class
│   │   │       │   │   │   ├── RolUsuario.class
│   │   │       │   │   │   ├── Usuario.class
│   │   │       │   │   │   └── Video.class
│   │   │       │   │   └── service
│   │   │       │   │       ├── AuthenticationService$1.class
│   │   │       │   │       ├── AuthenticationService.class
│   │   │       │   │       └── BibliotecaService.class
│   │   │       │   ├── infrastructure
│   │   │       │   │   └── persistence
│   │   │       │   │       ├── InMemoryBibliotecaRepository.class
│   │   │       │   │       └── JpaBibliotecaRepository.class
│   │   │       │   └── presentation
│   │   │       │       └── desktop
│   │   │       │           ├── controllers
│   │   │       │           │   ├── GestionAutoresController.class
│   │   │       │           │   └── MaterialController.class
│   │   │       │           └── views
│   │   │       │               ├── GestionAutoresView$1.class
│   │   │       │               ├── GestionAutoresView$2.class
│   │   │       │               ├── GestionAutoresView.class
│   │   │       │               └── GestionAutoresViewInterface.class
│   │   │       └── mycompany
│   │   │           └── bibliotecadigital
│   │   │               └── BibliotecaDigital.class
│   │   ├── generated-sources
│   │   │   └── annotations
│   │   ├── generated-test-sources
│   │   │   └── test-annotations
│   │   ├── maven-status
│   │   │   └── maven-compiler-plugin
│   │   │       ├── compile
│   │   │       │   └── default-compile
│   │   │       │       ├── createdFiles.lst
│   │   │       │       └── inputFiles.lst
│   │   │       └── testCompile
│   │   │           └── default-testCompile
│   │   │               ├── createdFiles.lst
│   │   │               └── inputFiles.lst
│   │   ├── surefire-reports
│   │   │   ├── 2025-09-15T14-57-57_727.dumpstream
│   │   │   ├── 2025-09-15T14-58-19_090.dumpstream
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.BibliotecaServiceTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU10BibliotecaDigitalTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU11PersistenciaTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU12JpaRepositoryTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU14AutoresCrudTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU3BibliotecaDigitalTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU4BibliotecaDigitalTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU6CitasApaTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU7BibliotecaDigitalTest.xml
│   │   │   ├── TEST-test.java.com.bibliotecadigital.domain.service.HU8BibliotecaDigitalTest.xml
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.BibliotecaServiceTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU10BibliotecaDigitalTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU11PersistenciaTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU12JpaRepositoryTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU14AutoresCrudTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU3BibliotecaDigitalTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU4BibliotecaDigitalTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU6CitasApaTest.txt
│   │   │   ├── test.java.com.bibliotecadigital.domain.service.HU7BibliotecaDigitalTest.txt
│   │   │   └── test.java.com.bibliotecadigital.domain.service.HU8BibliotecaDigitalTest.txt
│   │   └── test-classes
│   │       └── test
│   │           └── java
│   │               └── com
│   │                   └── bibliotecadigital
│   │                       └── domain
│   │                           └── service
│   │                               ├── BibliotecaServiceTest.class
│   │                               ├── HU10BibliotecaDigitalTest.class
│   │                               ├── HU11PersistenciaTest.class
│   │                               ├── HU12JpaRepositoryTest.class
│   │                               ├── HU14AutoresCrudTest.class
│   │                               ├── HU1BibliotecaDigitalTest.class
│   │                               ├── HU2BibliotecaDigitalTest.class
│   │                               ├── HU3BibliotecaDigitalTest.class
│   │                               ├── HU4BibliotecaDigitalTest.class
│   │                               ├── HU5BibliotecaDigitalTest.class
│   │                               ├── HU6CitasApaTest.class
│   │                               ├── HU7BibliotecaDigitalTest.class
│   │                               ├── HU8BibliotecaDigitalTest.class
│   │                               ├── HU9BibliotecaDigitalTest.class
│   │                               ├── IntegralBibliotecaDigitalTest.class
│   │                               └── MockGestionAutoresView.class
│   ├── biblioteca.db
│   ├── nbactions.xml
│   └── pom.xml
├── docs
│   ├── HU
│   │   ├── hu1.md
│   │   ├── hu10.md
│   │   ├── hu12.md
│   │   ├── hu14.md
│   │   ├── hu3.md
│   │   ├── hu4.md
│   │   ├── hu6.md
│   │   ├── hu7.md
│   │   └── hu8.md
│   ├── Sprints
│   │   ├── S1.md
│   │   └── S2.md
│   ├── DesignThinking.md
│   ├── LearnStartup.md
│   ├── ProductBacklog.md
│   └── Scrum.md
├── .gitignore
├── README.md
├── project_overview.md
└── script.py
```

## `.gitignore`

```text
/BibliotecaDigital/target/
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Audio.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
            return String.format("%s (%d) [Audio].", titulo, anio);
        }

        // 1. Usar el método heredado para formatear el nombre
        String autorAPA = formatearNombreAutorAPA(autores.get(0).getNombre());

        if (autores.size() > 1) {
            autorAPA += " et al.";
        }

        // 2. Usar la palabra "Audio" en lugar del formato específico
        return String.format("%s (%d). %s [Audio].", autorAPA, anio, titulo);
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Autor.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// En: src/main/java/com/bibliotecadigital/domain/model/Autor.java

package com.bibliotecadigital.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity // <-- 1. Anotación para decirle a JPA que esta clase es una tabla
public class Autor {

    @Id // <-- 2. Anotación para marcar el campo 'id' como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Le dice a la BD que genere el ID automáticamente
    private int id;
    
    private String nombre;
    
    public Autor() {
        // <-- 4. Constructor vacío, OBLIGATORIO para JPA
    }
    
    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    // Getters y setters (sin cambios)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    // equals, hashCode y toString (sin cambios)
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
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Libro.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LIBRO") // Identificador para esta subclase en la tabla
public class Libro extends MaterialBiblioteca {
    
    private String editorial;
    private int numPaginas;

    public Libro() { super(); }
    
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
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\MaterialBiblioteca.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Toda la jerarquía en una tabla
@DiscriminatorColumn(name = "TIPO_MATERIAL", discriminatorType = DiscriminatorType.STRING)
public abstract class MaterialBiblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    
    protected String titulo;
    protected int anio;
    protected String rutaArchivo;
    protected boolean disponible;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
        name = "material_autor",
        joinColumns = @JoinColumn(name = "material_id"),
        inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    protected List<Autor> autores;

    public MaterialBiblioteca() { // Constructor vacío requerido por JPA
        this.autores = new ArrayList<>();
        this.disponible = true;
    }
    
    public MaterialBiblioteca(int id, String titulo, int anio, String rutaArchivo) {
        this(); // Llama al constructor vacío para inicializar la lista
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.rutaArchivo = rutaArchivo;
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
    
    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Año: " + anio + 
               ", Autores: " + autores + ", Disponible: " + disponible;
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Prestamo.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

/**
 *
 * @author jesus
 */

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id") 
    private Usuario usuario;
    @ManyToMany(fetch = FetchType.EAGER) // Un préstamo tiene MUCHOS materiales
    @JoinTable(
        name = "prestamo_material",
        joinColumns = @JoinColumn(name = "prestamo_id"),
        inverseJoinColumns = @JoinColumn(name = "material_id")
    )
    private List<MaterialBiblioteca> materiales;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion; // Puede ser nula hasta que se devuelva todo

    public Prestamo() {
        
    }
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
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Revista.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\RolUsuario.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

/**
 *
 * @author jesus
 */
public enum RolUsuario {
    ADMINISTRADOR,
    CLIENTE,
    ENCARGADO
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Usuario.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Manu-Hdz
 * @version 2.0
 * @author Jesus
 */

import jakarta.persistence.*;
import org.mindrot.jbcrypt.BCrypt;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String nombre;

    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private RolUsuario rol;

    public Usuario() {} // Constructor vacío requerido por JPA

    // Tu constructor original
    public Usuario(String nombre, String email, String passwordPlano, RolUsuario rol) {
        this.nombre = nombre;
        this.email = email;
        this.passwordHash = BCrypt.hashpw(passwordPlano, BCrypt.gensalt());
        this.rol = rol;
    }

    // --- Getters y Setters ---
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public RolUsuario getRol() { return rol; }
    public void setRol(RolUsuario rol) { this.rol = rol; }
    public boolean verificarPassword(String passwordIngresada) {
        return BCrypt.checkpw(passwordIngresada, this.passwordHash);
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Video.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
            return String.format("%s (%d) [Video].", titulo, anio);
        }

        // 1. Usar el método heredado para formatear el nombre
        String autorAPA = formatearNombreAutorAPA(autores.get(0).getNombre());

        if (autores.size() > 1) {
            autorAPA += " et al.";
        }

        // 2. Usar la palabra "Video" en lugar del formato específico
        return String.format("%s (%d). %s [Video].", autorAPA, anio, titulo);
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\service\AuthenticationService.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;

/**
 *
 * @author Manu-hdz
 * @author Jesus-Mtz
 */
public class AuthenticationService {
    private InMemoryBibliotecaRepository biblioteca;

    public AuthenticationService(InMemoryBibliotecaRepository biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Usuario login(String email, String password) {
        Usuario usuario = biblioteca.buscarUsuarioPorEmail(email);
        if (usuario != null && usuario.verificarPassword(password)) {
            return usuario; // login correcto
        }
        return null; // login fallido
    }
    
    public boolean tienePermiso(Usuario usuario, String funcionalidad) {
        if (usuario == null) return false;
        
        switch(usuario.getRol()) {
            case ADMINISTRADOR:
                return true; // Los administradores tienen acceso a todo
            case ENCARGADO:
                return !funcionalidad.equals("configuracion_sistema");
            case CLIENTE:
                return funcionalidad.equals("buscar_materiales") || 
                       funcionalidad.equals("prestar_material") ||
                       funcionalidad.equals("devolver_material");
            default:
                return false;
        }
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\service\BibliotecaService.java`

```java
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
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
    Autor actualizarAutor(Autor autor);
    void eliminarAutor(int id);
    
    // Métodos para usuarios
    boolean registrarUsuario(String nombre, String email, String password, RolUsuario rol);
    Usuario buscarUsuarioPorEmail(String email);
    boolean actualizarRolUsuario(String email, RolUsuario nuevoRol);
    
    // Métodos de validación
    boolean validarMaterial(MaterialBiblioteca material);
    
    // Métodos para préstamos
    Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales);
    List<Prestamo> listarPrestamos();
    
    // Método para devoluciones
    boolean registrarDevolucion(Prestamo prestamo, MaterialBiblioteca material);
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\infrastructure\persistence\InMemoryBibliotecaRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

import com.bibliotecadigital.domain.model.*; // Importa todos los modelos
import com.bibliotecadigital.domain.service.BibliotecaService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryBibliotecaRepository implements BibliotecaService {
    private List<MaterialBiblioteca> materiales;
    private List<Autor> autores;
    private AtomicInteger materialIdCounter;
    private AtomicInteger autorIdCounter;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos; 
    private AtomicInteger prestamoIdCounter; 
    
    public InMemoryBibliotecaRepository() {
        this.materiales = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.materialIdCounter = new AtomicInteger(1);
        this.autorIdCounter = new AtomicInteger(1);
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.prestamoIdCounter = new AtomicInteger(1);
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
        if (titulo == null || titulo.trim().isEmpty()) {
            return new ArrayList<>();
        }
        
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        String tituloBusqueda = titulo.toLowerCase().trim();
        
        for (MaterialBiblioteca material : materiales) {
            if (material.getTitulo().toLowerCase().contains(tituloBusqueda)) {
                resultados.add(material);
            }
        }
        return resultados;
    }
    
    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            return new ArrayList<>();
        }
        
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        String autorBusqueda = autor.toLowerCase().trim();
        
        for (MaterialBiblioteca material : materiales) {
            for (Autor a : material.getAutores()) {
                if (a.getNombre().toLowerCase().contains(autorBusqueda)) {
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
    
    @Override
    public boolean registrarUsuario(String nombre, String email, String password, RolUsuario rol) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                return false; // ya existe
            }
        }
        Usuario nuevo = new Usuario(nombre, email, password, rol);
        usuarios.add(nuevo);
        return true;
    }

    
    @Override
    public boolean actualizarRolUsuario(String email, RolUsuario nuevoRol) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                u.setRol(nuevoRol);
                return true;
            }
        }
        return false; // usuario no encontrado
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
    
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
    
    @Override
    public Autor actualizarAutor(Autor autor) {
        return null;
    }

    @Override
    public void eliminarAutor(int id) {
        
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\infrastructure\persistence\JpaBibliotecaRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 * Lo ideal es tener un JPAController por cada Clase en domain.model, sin embargo debido a que ya urge los CRUD, pues se usa una clase DIOS, al simplificar la lógica se conoce como
 * "Patrón de Repositorio"
 */

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.BibliotecaService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.function.Consumer;

public class JpaBibliotecaRepository implements BibliotecaService {

    // El EntityManagerFactory es pesado y se crea una sola vez para toda la aplicación.
    private final EntityManagerFactory emf;

    public JpaBibliotecaRepository() {
        // "biblioteca-pu" es el nombre que definimos en persistence.xml
        this.emf = Persistence.createEntityManagerFactory("biblioteca-pu");
    }

    /**
     * Mejora de Diseño: Método de utilidad para manejar transacciones.
     * Esto asegura que cada operación de escritura (guardar, actualizar, borrar)
     * se ejecute dentro de una transacción segura, con begin, commit y rollback.
     */
    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public MaterialBiblioteca registrarMaterial(MaterialBiblioteca material) {
        executeInsideTransaction(em -> em.persist(material));
        return material;
    }

    @Override
    public MaterialBiblioteca buscarMaterialPorId(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(MaterialBiblioteca.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<MaterialBiblioteca> listarMateriales() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<MaterialBiblioteca> query = em.createQuery("SELECT m FROM MaterialBiblioteca m", MaterialBiblioteca.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    @Override
    public boolean registrarUsuario(String nombre, String email, String password, RolUsuario rol) {
        // La lógica de validación de email duplicado es mejor en la capa de servicio,
        // pero por ahora la implementamos aquí para seguir el contrato.
        if (buscarUsuarioPorEmail(email) != null) {
            return false; // Usuario ya existe
        }
        Usuario nuevoUsuario = new Usuario(nombre, email, password, rol);
        executeInsideTransaction(em -> em.persist(nuevoUsuario));
        return true;
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class);
            query.setParameter("email", email);
            return query.getSingleResult();
        } catch (jakarta.persistence.NoResultException e) {
            return null; // No se encontró el usuario
        } finally {
            em.close();
        }
    }

    @Override
    public Prestamo crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        final Prestamo[] nuevoPrestamo = new Prestamo[1];
        executeInsideTransaction(em -> {
            // Se asegura de que las entidades estén gestionadas por el EntityManager actual
            Usuario usuarioPersistido = em.find(Usuario.class, usuario.getId());
            
            for (MaterialBiblioteca material : materiales) {
                if (!material.isDisponible()) {
                    throw new IllegalStateException("El material '" + material.getTitulo() + "' no está disponible.");
                }
                material.setDisponible(false);
                em.merge(material); // Actualiza el estado del material en la BD
            }

            Prestamo p = new Prestamo(0, usuarioPersistido, materiales);
            em.persist(p);
            nuevoPrestamo[0] = p;
        });
        return nuevoPrestamo[0];
    }

    // ... Aquí irían las implementaciones del resto de métodos de BibliotecaService
    // (listarPrestamos, registrarDevolucion, registrarAutor, etc.)
    // siguiendo los mismos patrones.

    @Override
    public List<Prestamo> listarPrestamos() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p FROM Prestamo p", Prestamo.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public boolean registrarDevolucion(Prestamo prestamo, MaterialBiblioteca material) {
        executeInsideTransaction(em -> {
            // Se obtienen las versiones más recientes de la BD
            Prestamo p = em.find(Prestamo.class, prestamo.getId());
            MaterialBiblioteca m = em.find(MaterialBiblioteca.class, material.getId());

            if (p == null || m == null || !p.getMateriales().contains(m)) {
                throw new IllegalArgumentException("El material no pertenece al préstamo.");
            }
            m.setDisponible(true);
            em.merge(m);
            // Lógica para cerrar el préstamo si todos han sido devueltos
        });
        return true;
    }
    
    @Override
    public Autor registrarAutor(Autor autor) {
        executeInsideTransaction(em -> em.persist(autor));
        return autor;
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        final Autor[] autorActualizado = new Autor[1];
        executeInsideTransaction(em -> {
            autorActualizado[0] = em.merge(autor);
        });
        return autorActualizado[0];
    }

    @Override
    public void eliminarAutor(int id) {
        executeInsideTransaction(em -> {
            Autor autor = em.find(Autor.class, id);
            if (autor != null) {
                em.remove(autor);
            }
        });
    }

    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<MaterialBiblioteca> query = em.createQuery(
                "SELECT m FROM MaterialBiblioteca m WHERE lower(m.titulo) LIKE lower(:titulo)", 
                MaterialBiblioteca.class
            );
            query.setParameter("titulo", "%" + titulo + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<MaterialBiblioteca> buscarMaterialesPorAutor(String nombreAutor) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<MaterialBiblioteca> query = em.createQuery(
                "SELECT m FROM MaterialBiblioteca m JOIN m.autores a WHERE lower(a.nombre) LIKE lower(:nombreAutor)", 
                MaterialBiblioteca.class
            );
            query.setParameter("nombreAutor", "%" + nombreAutor + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Autor buscarAutorPorId(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Autor.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Autor> listarAutores() {
        EntityManager em = emf.createEntityManager();
        try {
            // Esta es la implementación que corrige tu error
            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a", Autor.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public boolean actualizarRolUsuario(String email, RolUsuario nuevoRol) {
        final boolean[] exito = {false};
        executeInsideTransaction(em -> {
            Usuario usuario = buscarUsuarioPorEmail(email);
            if (usuario != null) {
                usuario.setRol(nuevoRol);
                em.merge(usuario);
                exito[0] = true;
            }
        });
        return exito[0];
    }
    
    // El método validarMaterial no interactúa con JPA, su lógica puede quedar como está
    // o ser movida a una capa de validación más adelante.
    @Override
    public boolean validarMaterial(MaterialBiblioteca material) {
        if (material == null) return false;
        if (material.getTitulo() == null || material.getTitulo().trim().isEmpty()) return false;
        if (material.getAnio() <= 0) return false;
        if (material.getRutaArchivo() == null || material.getRutaArchivo().trim().isEmpty()) return false;
        if (material.getAutores() == null || material.getAutores().isEmpty()) return false;
        return true;
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\controllers\GestionAutoresController.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;

public class GestionAutoresController {

    private final BibliotecaService servicio;
    private final GestionAutoresViewInterface vista;

    public GestionAutoresController(BibliotecaService servicio, GestionAutoresViewInterface vista) {
        this.servicio = servicio;
        this.vista = vista;
        
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addNuevoListener(e -> crearNuevoAutor());
        this.vista.addEditarListener(e -> editarAutorSeleccionado());
        this.vista.addEliminarListener(e -> eliminarAutorSeleccionado());
        
        // Cargar los datos iniciales
        cargarAutores();
    }

    public void cargarAutores() {
        vista.mostrarAutores(servicio.listarAutores());
    }

    public void crearNuevoAutor() {
        String nombre = vista.pedirNuevoNombreAutor("");
        if (nombre != null && !nombre.trim().isEmpty()) {
            servicio.registrarAutor(new Autor(0, nombre));
            cargarAutores(); // Refrescar la tabla
            vista.mostrarMensaje("Autor creado exitosamente.");
        }
    }

    public void editarAutorSeleccionado() {
        Autor autorSeleccionado = vista.getAutorSeleccionado();
        if (autorSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un autor para editar.");
            return;
        }
        
        String nuevoNombre = vista.pedirNuevoNombreAutor(autorSeleccionado.getNombre());
        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            autorSeleccionado.setNombre(nuevoNombre);
            servicio.actualizarAutor(autorSeleccionado);
            cargarAutores(); // Refrescar la tabla
            vista.mostrarMensaje("Autor actualizado exitosamente.");
        }
    }

    public void eliminarAutorSeleccionado() {
        Autor autorSeleccionado = vista.getAutorSeleccionado();
        if (autorSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un autor para eliminar.");
            return;
        }

        if (vista.confirmarEliminacion(autorSeleccionado.getNombre())) {
            try {
                servicio.eliminarAutor(autorSeleccionado.getId());
                cargarAutores(); // Refrescar la tabla
                vista.mostrarMensaje("Autor eliminado exitosamente.");
            } catch (Exception e) {
                // Manejar el caso de que un autor no se pueda borrar por tener libros asociados
                vista.mostrarMensaje("Error: No se puede eliminar el autor, probablemente tiene materiales asociados.");
            }
        }
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\controllers\MaterialController.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionAutoresView.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.Autor;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // <-- Importante

public class GestionAutoresView extends javax.swing.JFrame implements GestionAutoresViewInterface {
     // --- Atributos de la Clase ---
    private DefaultTableModel tableModel; // El modelo de datos para nuestra tabla

    public GestionAutoresView() {
        initComponents(); // NetBeans crea los componentes visuales aquí
        configuracionAdicional(); // Nosotros los configuramos después
    }
    
    /**
     * Configuraciones adicionales que se aplican después de que NetBeans
     * crea los componentes.
     */
    private void configuracionAdicional() {
        // 1. Crear nuestro modelo de tabla personalizado
        tableModel = new DefaultTableModel(new Object[]{"ID", "Nombre"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer que las celdas no sean editables
            }
        };
        
        // 2. Conectar nuestra JTable (autoresTable) con el modelo de datos
        autoresTable.setModel(tableModel);
        
        // 3. Centrar la ventana
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanelTabla = new javax.swing.JScrollPane();
        autoresTable = new javax.swing.JTable();
        nuevoButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        autoresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPanelTabla.setViewportView(autoresTable);

        nuevoButton.setText("Nuevo");

        editarButton.setText("Editar");

        eliminarButton.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevoButton)
                .addGap(67, 67, 67)
                .addComponent(editarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(eliminarButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoButton)
                    .addComponent(editarButton)
                    .addComponent(eliminarButton))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionAutoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionAutoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionAutoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionAutoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionAutoresView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable autoresTable;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton nuevoButton;
    private javax.swing.JScrollPane scrollPanelTabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addNuevoListener(ActionListener listener) {
        nuevoButton.addActionListener(listener);
    }

    @Override
    public void addEditarListener(ActionListener listener) {
        editarButton.addActionListener(listener);
    }

    @Override
    public void addEliminarListener(ActionListener listener) {
        eliminarButton.addActionListener(listener);
    }

    @Override
    public void mostrarAutores(List<Autor> autores) {
        // Limpiar la tabla antes de llenarla
        tableModel.setRowCount(0);
        
        // Llenar la tabla con los datos de los autores
        for (Autor autor : autores) {
            tableModel.addRow(new Object[]{autor.getId(), autor.getNombre()});
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public Autor getAutorSeleccionado() {
        int selectedRow = autoresTable.getSelectedRow();
        if (selectedRow >= 0) {
            // Obtener los datos de la fila seleccionada
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            String nombre = (String) tableModel.getValueAt(selectedRow, 1);
            return new Autor(id, nombre);
        }
        return null; // No hay ninguna fila seleccionada
    }

    @Override
    public String pedirNuevoNombreAutor(String nombreActual) {
        // Muestra un diálogo para que el usuario ingrese un nombre
        return JOptionPane.showInputDialog(this, "Ingrese el nombre del autor:", nombreActual);
    }

    @Override
    public boolean confirmarEliminacion(String nombreAutor) {
        // Muestra un diálogo de confirmación
        int respuesta = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar al autor '" + nombreAutor + "'?", 
                "Confirmar Eliminación", 
                JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }

    @Override
    public JFrame getFrame() {
         return this;
    }
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionAutoresViewInterface.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

public interface GestionAutoresViewInterface {
    
    // Métodos para que el Controlador registre listeners
    void addNuevoListener(ActionListener listener);
    void addEditarListener(ActionListener listener);
    void addEliminarListener(ActionListener listener);
    
    // Métodos para que el Controlador actualice la Vista
    void mostrarAutores(List<Autor> autores);
    void mostrarMensaje(String mensaje);
    
    // Métodos para que el Controlador obtenga datos de la Vista
    Autor getAutorSeleccionado();
    String pedirNuevoNombreAutor(String nombreActual);
    boolean confirmarEliminacion(String nombreAutor);
    
    // Métodos para controlar la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
}```

## `BibliotecaDigital\src\main\java\com\mycompany\bibliotecadigital\BibliotecaDigital.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecadigital;

/**
 *
 * @author jesus
 */

// --- IMPORTS NECESARIOS ---
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.GestionAutoresController;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresView; // <-- Asegúrate de importar la clase concreta
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;

public class BibliotecaDigital {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            // 1. Instanciar el Repositorio (Modelo)
            BibliotecaService servicio = new JpaBibliotecaRepository();

            // 2. Instanciar la Vista
            // Se crea un objeto de la clase CONCRETA (GestionAutoresView)...
            // ...y se asigna a una variable del tipo de la INTERFAZ.
            // Esta es la mejor práctica.
            GestionAutoresViewInterface vistaAutores = new GestionAutoresView();

            // 3. Instanciar el Controlador, inyectando Modelo y Vista
            new GestionAutoresController(servicio, vistaAutores);

            // 4. Hacer visible la GUI
            // El método setVisible debe ser parte de tu interfaz
            vistaAutores.setVisible(true); 
        });
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\BibliotecaServiceTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
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
    void testBuscarMaterialPorIdNoExistente() {
        MaterialBiblioteca resultado = bibliotecaService.buscarMaterialPorId(9999);
        assertNull(resultado);
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
    void testBuscarMaterialPorTituloNoExistente() {
        List<MaterialBiblioteca> resultados = bibliotecaService.buscarMaterialesPorTitulo("Título desconocido");
        assertTrue(resultados.isEmpty());
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
    void testBuscarMaterialPorAutorNoExistente() {
        List<MaterialBiblioteca> resultados = bibliotecaService.buscarMaterialesPorAutor("Autor Desconocido");
        assertTrue(resultados.isEmpty());
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
    void testListarMaterialesVacio() {
        List<MaterialBiblioteca> materiales = bibliotecaService.listarMateriales();
        assertTrue(materiales.isEmpty());
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
    void testBuscarAutorPorIdNoExistente() {
        Autor resultado = bibliotecaService.buscarAutorPorId(9999);
        assertNull(resultado);
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
    
    @Test
    void testListarAutoresVacio() {
        List<Autor> autores = bibliotecaService.listarAutores();
        assertTrue(autores.isEmpty());
    } 
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU10BibliotecaDigitalTest.java`

```java
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
public class HU10BibliotecaDigitalTest {

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
            HU10BibliotecaDigitalTest test1 = new HU10BibliotecaDigitalTest();
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
            HU10BibliotecaDigitalTest test2 = new HU10BibliotecaDigitalTest();
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
            HU10BibliotecaDigitalTest test3 = new HU10BibliotecaDigitalTest();
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
            HU10BibliotecaDigitalTest test4 = new HU10BibliotecaDigitalTest();
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
            HU10BibliotecaDigitalTest test5 = new HU10BibliotecaDigitalTest();
            test5.setUp();
            test5.testVerificacionPermisosEncargado();
            System.out.println(" PASSED");
        } catch (AssertionError e) {
            System.out.println(" FAILED");
            System.out.println("   Causa: " + e.getMessage());
        }

        System.out.println("--- Pruebas Finalizadas ---");
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU11PersistenciaTest.java`

```java
package test.java.com.bibliotecadigital.domain.service;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HU11PersistenciaTest {

    @Test
    void testInicializacionJPAyConexionDB() {
        EntityManagerFactory emf = null;
        try {
            // Intenta crear el EntityManagerFactory usando el nombre de la unidad de persistencia de persistence.xml
            emf = Persistence.createEntityManagerFactory("biblioteca-pu");
            
            // Si la línea anterior no lanza una excepción, la configuración es correcta.
            assertNotNull(emf, "El EntityManagerFactory no debería ser nulo si la conexión fue exitosa.");
            
        } catch (Exception e) {
            // Si algo falla (ej. no encuentra el driver, XML mal formado), este test fallará.
            fail("Falló la inicialización de JPA y la conexión a la base de datos.", e);
        } finally {
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        }
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU12JpaRepositoryTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HU12JpaRepositoryTest {

    private static EntityManagerFactory emf;
    private JpaBibliotecaRepository repository;

    @BeforeAll
    static void setUpAll() {
        // Se crea el EMF una sola vez para todas las pruebas
        emf = Persistence.createEntityManagerFactory("biblioteca-pu");
    }

    @AfterAll
    static void tearDownAll() {
        if (emf != null) {
            emf.close();
        }
    }

    @BeforeEach
    void setUp() {
        // Se crea una nueva instancia del repositorio para cada test
        repository = new JpaBibliotecaRepository();
        // Limpiar la base de datos antes de cada prueba para asegurar el aislamiento
        clearDatabase();
    }
    
    private void clearDatabase() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Prestamo").executeUpdate();
        em.createQuery("DELETE FROM MaterialBiblioteca").executeUpdate();
        em.createQuery("DELETE FROM Autor").executeUpdate();
        em.createQuery("DELETE FROM Usuario").executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

    @Test
    @DisplayName("Debería registrar un usuario y encontrarlo por email")
    void testRegistrarYBuscarUsuario() {
        // Act
        boolean registrado = repository.registrarUsuario("Ana JPA", "ana.jpa@mail.com", "pass123", RolUsuario.CLIENTE);
        Usuario encontrado = repository.buscarUsuarioPorEmail("ana.jpa@mail.com");

        // Assert
        assertTrue(registrado);
        assertNotNull(encontrado);
        assertEquals("Ana JPA", encontrado.getNombre());
    }
    
    @Test
    @DisplayName("Debería crear un préstamo y marcar los materiales como no disponibles")
    void testCrearPrestamoYVerificarDisponibilidad() {
        // Arrange
        repository.registrarUsuario("Beto JPA", "beto.jpa@mail.com", "pass123", RolUsuario.CLIENTE);
        Usuario usuario = repository.buscarUsuarioPorEmail("beto.jpa@mail.com");

        Libro libro = new Libro(0, "Libro para Prestar", 2025, "/ruta/jpa.pdf", "Ed. JPA", 100);
        libro.agregarAutor(new Autor(0, "Autor JPA"));
        repository.registrarMaterial(libro);

        // Act
        repository.crearPrestamo(usuario, List.of(libro));
        
        // Assert
        MaterialBiblioteca materialPrestado = repository.buscarMaterialPorId(libro.getId());
        assertFalse(materialPrestado.isDisponible(), "El material debería estar marcado como no disponible en la BD.");
        assertEquals(1, repository.listarPrestamos().size(), "Debería haber un préstamo registrado.");
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU14AutoresCrudTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.GestionAutoresController;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Mock de la Vista para simular la interacción del usuario sin levantar una GUI real
class MockGestionAutoresView implements GestionAutoresViewInterface {
    public String nombrePedido;
    public Autor autorSeleccionado;
    public boolean confirmacionDada = true;
    // ... (implementar todos los métodos de la interfaz, la mayoría pueden estar vacíos)
    @Override public void mostrarAutores(java.util.List<Autor> autores) {}
    @Override public void addNuevoListener(java.awt.event.ActionListener listener) {}
    @Override public void addEditarListener(java.awt.event.ActionListener listener) {}
    @Override public void addEliminarListener(java.awt.event.ActionListener listener) {}
    @Override public void mostrarMensaje(String mensaje) {}
    @Override public Autor getAutorSeleccionado() { return autorSeleccionado; }
    @Override public String pedirNuevoNombreAutor(String n) { return nombrePedido; }
    @Override public boolean confirmarEliminacion(String n) { return confirmacionDada; }
    @Override public javax.swing.JFrame getFrame() { return null; }
    @Override public void setVisible(boolean v) {}
}

public class HU14AutoresCrudTest {
    
    private BibliotecaService servicio;
    private MockGestionAutoresView vistaMock;
    private GestionAutoresController controlador;

    @BeforeEach
    void setUp() {
        servicio = new JpaBibliotecaRepository(); // Usa el repositorio real
        vistaMock = new MockGestionAutoresView();
        controlador = new GestionAutoresController(servicio, vistaMock);
    }

    @Test
    void testCrearYEncontrarAutorDesdeController() {
        // Arrange: Simular que el usuario escribe "Gabriel García Márquez" en el diálogo
        vistaMock.nombrePedido = "Gabriel García Márquez";
        
        // Act: Simular el clic en "Añadir Nuevo" llamando directamente al método del controlador
        controlador.crearNuevoAutor();
        
        // Assert: Verificar directamente en la base de datos que el autor fue creado
        assertFalse(servicio.listarAutores().isEmpty());
        assertEquals("Gabriel García Márquez", servicio.listarAutores().get(0).getNombre());
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU1BibliotecaDigitalTest.java`

```java
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.MaterialController;

public class HU1BibliotecaDigitalTest {
    public static void main(String[] args) {
        // Tu código de demostración aquí
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

        // Resto del código...
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU2BibliotecaDigitalTest.java`

```java
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.MaterialController;
import java.util.List;
import java.util.Scanner;

public class HU2BibliotecaDigitalTest {
    private static MaterialController controlador;

    public static void main(String[] args) {
        BibliotecaService servicio = new InMemoryBibliotecaRepository();
        controlador = new MaterialController(servicio);
        cargarDatosDePrueba();
        iniciarMenu();
    }

    private static void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n== BÚSQUEDA EN BIBLIOTECA ==");
            System.out.println("1. Buscar por Título");
            System.out.println("2. Buscar por Autor");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
                switch (opcion) {
                    case 1 -> buscarPorTitulo(scanner);
                    case 2 -> buscarPorAutor(scanner);
                    case 3 -> System.out.println("Programa terminado");
                    default -> System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
        scanner.close();
    }

    private static void buscarPorTitulo(Scanner scanner) {
        System.out.print("Ingrese título: ");
        String titulo = scanner.nextLine().trim();
        List<MaterialBiblioteca> resultados = controlador.buscarMaterialesPorTitulo(titulo);
        mostrarResultados(resultados);
    }

    private static void buscarPorAutor(Scanner scanner) {
        System.out.print("Ingrese autor: ");
        String autor = scanner.nextLine().trim();
        List<MaterialBiblioteca> resultados = controlador.buscarMaterialesPorAutor(autor);
        mostrarResultados(resultados);
    }

    private static void mostrarResultados(List<MaterialBiblioteca> resultados) {
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron resultados");
            return;
        }

        System.out.println("\nResultados encontrados: " + resultados.size());
        for (MaterialBiblioteca material : resultados) {
            System.out.println("------------------");
            System.out.println(material.mostrarInformacion());
        }
    }

    private static void cargarDatosDePrueba() {
        // Autores
        Autor garcia = controlador.registrarAutor(new Autor(0, "Gabriel García Márquez"));
        Autor beethoven = controlador.registrarAutor(new Autor(0, "Ludwig van Beethoven"));
        Autor natgeo = controlador.registrarAutor(new Autor(0, "National Geographic"));
        Autor spielberg = controlador.registrarAutor(new Autor(0, "Steven Spielberg"));

        // 1. Libros
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/libros/cien_anios.pdf", "Sudamericana", 496);
        libro.agregarAutor(garcia);
        controlador.registrarMaterial(libro);

        // 2. Revistas
        Revista revista1 = new Revista(0, "National Geographic: Amazonas", 2023, 
                                     "/revistas/natgeo_2023.pdf", "National Geographic", 1);
        revista1.agregarAutor(natgeo);
        controlador.registrarMaterial(revista1);

        Revista revista2 = new Revista(0, "Cien maravillas del mundo", 2023, 
                                     "/revistas/maravillas.pdf", "Discovery", 12);
        revista2.agregarAutor(natgeo);
        controlador.registrarMaterial(revista2);

        // 3. Videos
        Video video1 = new Video(0, "Jurassic Park", 1993, 
                                "/videos/jurassic.mp4", 127, "MP4");
        video1.agregarAutor(spielberg);
        controlador.registrarMaterial(video1);

        Video video2 = new Video(0, "Cien años de cine", 2020, 
                                "/videos/historia_cine.mp4", 180, "MP4");
        video2.agregarAutor(spielberg);
        controlador.registrarMaterial(video2);

        // 4. Audios
        Audio audio1 = new Audio(0, "Sinfonía No. 5", 1808, 
                                "/audios/sinfonia5.mp3", 45, "MP3");
        audio1.agregarAutor(beethoven);
        controlador.registrarMaterial(audio1);

        Audio audio2 = new Audio(0, "Cien melodías clásicas", 2022, 
                                "/audios/melodias.mp3", 120, "MP3");
        audio2.agregarAutor(beethoven);
        controlador.registrarMaterial(audio2);

        System.out.println("\nDatos de prueba cargados:");
        System.out.println("- 4 autores diferentes");
        System.out.println("- 7 materiales:");
        System.out.println("  * 1 libro");
        System.out.println("  * 2 revistas");
        System.out.println("  * 2 videos");
        System.out.println("  * 2 audios");
        
        System.out.println("\nEjemplos de búsqueda:");
        System.out.println("1. Búsqueda por título parcial:");
        System.out.println("   - 'Cien' (4 materiales diferentes)");
        System.out.println("   - 'National' (1 revista)");
        
        System.out.println("\n2. Búsqueda por título exacto:");
        System.out.println("   - 'Sinfonía No. 5' (1 audio)");
        System.out.println("   - 'Jurassic Park' (1 video)");
        
        System.out.println("\n3. Búsqueda por autor parcial:");
        System.out.println("   - 'Steven' (2 videos)");
        System.out.println("   - 'National' (2 revistas)");
        
        System.out.println("\n4. Búsqueda por autor exacto:");
        System.out.println("   - 'Ludwig van Beethoven' (2 audios)");
        System.out.println("   - 'Steven Spielberg' (2 videos)");
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU3BibliotecaDigitalTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author jesus
 */

public class HU3BibliotecaDigitalTest {

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
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU4BibliotecaDigitalTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HU4BibliotecaDigitalTest {

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
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU5BibliotecaDigitalTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.MaterialController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego Garcia
 */
public class HU5BibliotecaDigitalTest {
    private static MaterialController controlador;
    private static BibliotecaService servicio;
    
    public static void main(String[] args) {
        servicio = new InMemoryBibliotecaRepository();
        controlador = new MaterialController(servicio);
        cargarDatosDePrueba(); // Carga lo mismo que HU2
        iniciarMenu();
    }
    
    private static void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n== LISTAR MATERIALES DE LA BIBLIOTECA ==");
            System.out.println("1. Listar todos los materiales");
            System.out.println("2. Filtrar por tipo de material");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
                switch (opcion) {
                    case 1:
                        listarMateriales();
                        break;
                    case 2:
                        listarMaterialesPorTipo();
                        break;
                    case 3:
                        System.out.println("Programa terminado");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
        scanner.close();
    }
    
    private static void listarMateriales() {
        List<MaterialBiblioteca> lista = servicio.listarMateriales();
        System.out.println("\n\t\t\t=== Lista de todos los materiales ===");
        imprimirTablaMateriales(lista);
    }
    
    private static void listarMaterialesPorTipo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de material a filtrar (Libro, Revista, Video, Audio): ");
        String tipo = scanner.nextLine().trim();

        List<MaterialBiblioteca> todos = servicio.listarMateriales(); // lista todo
        List<MaterialBiblioteca> filtrados = new ArrayList<>();

        for (MaterialBiblioteca m : todos) {
            if (m.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                filtrados.add(m);
            }
        }

        if (filtrados.isEmpty()) {
            System.out.println("No hay materiales de tipo '" + tipo + "'.");
        } else {
            System.out.println("\n\t\t\t=== Lista de materiales de tipo " + tipo + " ===");
            imprimirTablaMateriales(filtrados);
        }
    }

    private static void cargarDatosDePrueba() {
        // Autores
        Autor garcia = controlador.registrarAutor(new Autor(0, "Gabriel García Márquez"));
        Autor beethoven = controlador.registrarAutor(new Autor(0, "Ludwig van Beethoven"));
        Autor natgeo = controlador.registrarAutor(new Autor(0, "National Geographic"));
        Autor spielberg = controlador.registrarAutor(new Autor(0, "Steven Spielberg"));

        // 1. Libros
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/libros/cien_anios.pdf", "Sudamericana", 496);
        libro.agregarAutor(garcia);
        controlador.registrarMaterial(libro);

        // 2. Revistas
        Revista revista1 = new Revista(0, "National Geographic: Amazonas", 2023, 
                                     "/revistas/natgeo_2023.pdf", "National Geographic", 1);
        revista1.agregarAutor(natgeo);
        controlador.registrarMaterial(revista1);

        Revista revista2 = new Revista(0, "Cien maravillas del mundo", 2023, 
                                     "/revistas/maravillas.pdf", "Discovery", 12);
        revista2.agregarAutor(natgeo);
        controlador.registrarMaterial(revista2);

        // 3. Videos
        Video video1 = new Video(0, "Jurassic Park", 1993, 
                                "/videos/jurassic.mp4", 127, "MP4");
        video1.agregarAutor(spielberg);
        controlador.registrarMaterial(video1);

        Video video2 = new Video(0, "Cien años de cine", 2020, 
                                "/videos/historia_cine.mp4", 180, "MP4");
        video2.agregarAutor(spielberg);
        controlador.registrarMaterial(video2);

        // 4. Audios
        Audio audio1 = new Audio(0, "Sinfonía No. 5", 1808, 
                                "/audios/sinfonia5.mp3", 45, "MP3");
        audio1.agregarAutor(beethoven);
        controlador.registrarMaterial(audio1);

        Audio audio2 = new Audio(0, "Cien melodías clásicas", 2022, 
                                "/audios/melodias.mp3", 120, "MP3");
        audio2.agregarAutor(beethoven);
        controlador.registrarMaterial(audio2);

        System.out.println("\nDatos de prueba cargados:");
        System.out.println("- 4 autores diferentes");
        System.out.println("- 7 materiales:");
        System.out.println("  * 1 libro");
        System.out.println("  * 2 revistas");
        System.out.println("  * 2 videos");
        System.out.println("  * 2 audios");
        
        System.out.println("\nEjemplos de búsqueda:");
        System.out.println("1. Búsqueda por título parcial:");
        System.out.println("   - 'Cien' (4 materiales diferentes)");
        System.out.println("   - 'National' (1 revista)");
        
        System.out.println("\n2. Búsqueda por título exacto:");
        System.out.println("   - 'Sinfonía No. 5' (1 audio)");
        System.out.println("   - 'Jurassic Park' (1 video)");
        
        System.out.println("\n3. Búsqueda por autor parcial:");
        System.out.println("   - 'Steven' (2 videos)");
        System.out.println("   - 'National' (2 revistas)");
        
        System.out.println("\n4. Búsqueda por autor exacto:");
        System.out.println("   - 'Ludwig van Beethoven' (2 audios)");
        System.out.println("   - 'Steven Spielberg' (2 videos)");
    }
    
    // Método para imprimir tabla, reutilizable
    private static void imprimirTablaMateriales(List<MaterialBiblioteca> materiales) {
        if (materiales.isEmpty()) {
            System.out.println("No hay materiales para mostrar.");
            return;
        }

        // Encabezados
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-4s | %-30s | %-25s | %-4s | %-10s | %-10s | %-30s%n",
                          "ID", "Título", "Autor(es)", "Año", "Tipo", "Estado", "Ruta de archivo");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        // Filas con datos
        for (MaterialBiblioteca m : materiales) {
            String autoresStr = m.getAutores().isEmpty() ? "-" :
                                String.join(", ", m.getAutores().stream().map(a -> a.getNombre()).toArray(String[]::new));
            String tipo = m.getClass().getSimpleName();
            String estado = m.isDisponible() ? "Disponible" : "Prestado";

            System.out.printf("%-4d | %-30s | %-25s | %-4d | %-10s | %-10s | %-30s%n",
                              m.getId(), m.getTitulo(), autoresStr, m.getAnio(), tipo, estado, m.getRutaArchivo());
        }
    }

}
```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU6CitasApaTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

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
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU7BibliotecaDigitalTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HU7BibliotecaDigitalTest {

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
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU8BibliotecaDigitalTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.*;
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HU8BibliotecaDigitalTest {

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
        
        System.out.println("\n✅ FLUJO DE INTEGRACIÓN COMPLETADO EXITOSAMENTE.");
    }
}```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\HU9BibliotecaDigitalTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;

/**
 *
 * @author Manu-Hdz
 * @author Angel-Mtz
 * Nota: Modifique la creación de Usuarios para que no marqué error
 */
public class HU9BibliotecaDigitalTest {
    public static void main(String[] args) {
        InMemoryBibliotecaRepository biblioteca = new InMemoryBibliotecaRepository();
        AuthenticationService auth = new AuthenticationService(biblioteca);

        // Registro de usuarios
        biblioteca.registrarUsuario("Carlos", "carlos@mail.com", "12345", RolUsuario.ADMINISTRADOR);
        biblioteca.registrarUsuario("Ana", "ana@mail.com", "abc123", RolUsuario.CLIENTE);
        
        System.out.println("Usuarios Registrado"
                + "\n Carlos, carlos@gmail.com, 12345"
                + "\n Ana, ana@gmail.com, abc123");
        
        // Intento de login
        System.out.println("\n Primer intento de login"
                + "\n Usuario carlos@gmail.com, password: 12345");
        
        Usuario user = auth.login("carlos@mail.com", "12345");
        System.out.println(user == null ? "Login fallido." : "Login correcto.");

        // Intento con contraseña incorrecta
        System.out.println("\n Segundo intento de login"
                + "\n Usuario ana@gmail.com, password: incorrecta");
        
        Usuario user2 = auth.login("ana@mail.com", "Incorrecta");
        System.out.println(user2 == null ? "Login fallido." : "Login correcto.");
    }
}
```

## `BibliotecaDigital\src\test\java\test\java\com\bibliotecadigital\domain\service\IntegralBibliotecaDigitalTest.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.model.Video;
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.MaterialController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp EliteBook
 */
public class IntegralBibliotecaDigitalTest {
    private static MaterialController controlador;
    private static BibliotecaService servicio;
    private static InMemoryBibliotecaRepository biblioteca;
    private static AuthenticationService auth;
    private static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        biblioteca = new InMemoryBibliotecaRepository();
        auth = new AuthenticationService(biblioteca);
        menuInicioSesion();
        
    }
    
    private static void iniciarMenu() {
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n== LISTAR MATERIALES DE LA BIBLIOTECA ==");
            System.out.println("1. Listar todos los materiales");
            System.out.println("2. Filtrar por tipo de material");
            System.out.println("3. Ver Detalle de un Material (por ID)");
            System.out.println("4. Generar Cita APA (por ID)"); 
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        listarMateriales();
                        break;
                    case 2:
                        listarMaterialesPorTipo();
                        break;
                    case 3:
                        verDetalleMaterial();
                        break;
                    case 4:
                        generarCita(); 
                        break;
                    case 5: 
                        System.out.println("Volviendo al menú principal...\n"); 
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
    }
    
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
    
    private static void listarMateriales() {
        List<MaterialBiblioteca> lista = servicio.listarMateriales();
        System.out.println("\n\t\t\t=== Lista de todos los materiales ===");
        imprimirTablaMateriales(lista);
    }
    
    private static void listarMaterialesPorTipo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de material a filtrar (Libro, Revista, Video, Audio): ");
        String tipo = scanner.nextLine().trim();

        List<MaterialBiblioteca> todos = servicio.listarMateriales(); // lista todo
        List<MaterialBiblioteca> filtrados = new ArrayList<>();

        for (MaterialBiblioteca m : todos) {
            if (m.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                filtrados.add(m);
            }
        }

        if (filtrados.isEmpty()) {
            System.out.println("No hay materiales de tipo '" + tipo + "'.");
        } else {
            System.out.println("\n\t\t\t=== Lista de materiales de tipo " + tipo + " ===");
            imprimirTablaMateriales(filtrados);
        }
    }

    private static void cargarDatosDePrueba() {
        // Autores
        Autor garcia = controlador.registrarAutor(new Autor(0, "Gabriel García Márquez"));
        Autor beethoven = controlador.registrarAutor(new Autor(0, "Ludwig van Beethoven"));
        Autor natgeo = controlador.registrarAutor(new Autor(0, "National Geographic"));
        Autor spielberg = controlador.registrarAutor(new Autor(0, "Steven Spielberg"));

        // 1. Libros
        Libro libro = new Libro(0, "Cien años de soledad", 1967, 
                               "/libros/cien_anios.pdf", "Sudamericana", 496);
        libro.agregarAutor(garcia);
        controlador.registrarMaterial(libro);

        // 2. Revistas
        Revista revista1 = new Revista(0, "National Geographic: Amazonas", 2023, 
                                     "/revistas/natgeo_2023.pdf", "National Geographic", 1);
        revista1.agregarAutor(natgeo);
        controlador.registrarMaterial(revista1);

        Revista revista2 = new Revista(0, "Cien maravillas del mundo", 2023, 
                                     "/revistas/maravillas.pdf", "Discovery", 12);
        revista2.agregarAutor(natgeo);
        controlador.registrarMaterial(revista2);

        // 3. Videos
        Video video1 = new Video(0, "Jurassic Park", 1993, 
                                "/videos/jurassic.mp4", 127, "MP4");
        video1.agregarAutor(spielberg);
        controlador.registrarMaterial(video1);

        Video video2 = new Video(0, "Cien años de cine", 2020, 
                                "/videos/historia_cine.mp4", 180, "MP4");
        video2.agregarAutor(spielberg);
        controlador.registrarMaterial(video2);

        // 4. Audios
        Audio audio1 = new Audio(0, "Sinfonía No. 5", 1808, 
                                "/audios/sinfonia5.mp3", 45, "MP3");
        audio1.agregarAutor(beethoven);
        controlador.registrarMaterial(audio1);

        Audio audio2 = new Audio(0, "Cien melodías clásicas", 2022, 
                                "/audios/melodias.mp3", 120, "MP3");
        audio2.agregarAutor(beethoven);
        controlador.registrarMaterial(audio2);

        System.out.println("\nDatos de prueba cargados:");
        System.out.println("- 4 autores diferentes");
        System.out.println("- 7 materiales:");
        System.out.println("  * 1 libro");
        System.out.println("  * 2 revistas");
        System.out.println("  * 2 videos");
        System.out.println("  * 2 audios");
        
        System.out.println("\nEjemplos de búsqueda:");
        System.out.println("1. Búsqueda por título parcial:");
        System.out.println("   - 'Cien' (4 materiales diferentes)");
        System.out.println("   - 'National' (1 revista)");
        
        System.out.println("\n2. Búsqueda por título exacto:");
        System.out.println("   - 'Sinfonía No. 5' (1 audio)");
        System.out.println("   - 'Jurassic Park' (1 video)");
        
        System.out.println("\n3. Búsqueda por autor parcial:");
        System.out.println("   - 'Steven' (2 videos)");
        System.out.println("   - 'National' (2 revistas)");
        
        System.out.println("\n4. Búsqueda por autor exacto:");
        System.out.println("   - 'Ludwig van Beethoven' (2 audios)");
        System.out.println("   - 'Steven Spielberg' (2 videos)");
    }
    
    // Método para imprimir tabla, reutilizable
    private static void imprimirTablaMateriales(List<MaterialBiblioteca> materiales) {
        if (materiales.isEmpty()) {
            System.out.println("No hay materiales para mostrar.");
            return;
        }

        // Encabezados
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-4s | %-30s | %-25s | %-4s | %-10s | %-10s | %-30s%n",
                          "ID", "Título", "Autor(es)", "Año", "Tipo", "Estado", "Ruta de archivo");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        // Filas con datos
        for (MaterialBiblioteca m : materiales) {
            String autoresStr = m.getAutores().isEmpty() ? "-" :
                                String.join(", ", m.getAutores().stream().map(a -> a.getNombre()).toArray(String[]::new));
            String tipo = m.getClass().getSimpleName();
            String estado = m.isDisponible() ? "Disponible" : "Prestado";

            System.out.printf("%-4d | %-30s | %-25s | %-4d | %-10s | %-10s | %-30s%n",
                              m.getId(), m.getTitulo(), autoresStr, m.getAnio(), tipo, estado, m.getRutaArchivo());
        }
    }
    
    private static void menuInicioSesion(){
        //Se registran 2 usuario por defecto
        int eleccion = 0;
        while (eleccion != 3){ 
            eleccion = 0;
            System.out.println("Bienvenido al sistema de biblioteca"
                + "\n Que desea realizar? "
                + "\n 1. Inicio Sesion"
                + "\n 2. Registrar Nuevo Usuario"
                + "\n 3. Salir");
            try{
                eleccion = Integer.parseInt(sc.nextLine());
                switch(eleccion){
                    case 1: inicioSesion(); break;
                    case 2: registrarUsuario(); break;
                    case 3: System.exit(0); break;
                    default: break;
                }
            }catch(Exception e){
                System.out.println("Ingrese valores numericos");
            }  
        }
    }
    
    private static void inicioSesion(){
        biblioteca.registrarUsuario("Carlos Admin", "carlos@mail.com", "12345", RolUsuario.ADMINISTRADOR);
        biblioteca.registrarUsuario("Ana Cliente", "ana@mail.com", "abc123", RolUsuario.CLIENTE);
    
        boolean loginExitoso = false;
        
        while(!loginExitoso){
            System.out.print("Correo del Usuario: ");
            String email = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            
            Usuario user = auth.login(email,password);
            if(user!= null){ 
                loginExitoso = true;
                System.out.println("\n Bienvenido "+ user.getNombre() + " \n");
                servicio = new InMemoryBibliotecaRepository();
                controlador = new MaterialController(servicio);
                cargarDatosDePrueba(); // Carga lo mismo que HU2
                iniciarMenu();
            }
            else System.out.println("Datos Incorrectos");
        }
    }
    
    private static void registrarUsuario(){
        String nombre, correo, password;
        RolUsuario rol = null;

        System.out.println("\n REGISTRO DE UN NUEVO USUARIO");
        System.out.println("");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Correo: ");
        correo = sc.nextLine();
        System.out.println("Password: ");     
        password = sc.nextLine();

        // Selección de rol
        System.out.println("Seleccione el rol:");
        System.out.println("1. Administrador");
        System.out.println("2. Encargado");
        System.out.println("3. Cliente");
        System.out.print("Opción: ");

        try {
            int opcionRol = Integer.parseInt(sc.nextLine());
            switch(opcionRol) {
                case 1: rol = RolUsuario.ADMINISTRADOR; break;
                case 2: rol = RolUsuario.ENCARGADO; break;
                case 3: rol = RolUsuario.CLIENTE; break;
                default: 
                    System.out.println("Opción inválida, se asignará rol de Cliente");
                    rol = RolUsuario.CLIENTE;
            }
        } catch (NumberFormatException e) {
            System.out.println("Opción inválida, se asignará rol de Cliente");
            rol = RolUsuario.CLIENTE;
        }

        boolean exito = biblioteca.registrarUsuario(nombre, correo, password, rol);
        if (exito) {
            System.out.println("Usuario registrado con rol: " + rol);
        } else {
            System.out.println("Error: el usuario ya existe");
        }
    }
    
    private static void prueba(){
        System.out.println("Prueba");
    }
}
```

