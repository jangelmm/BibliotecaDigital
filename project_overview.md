# Estructura del proyecto

```
BibliotecaDigital
├── BibliotecaDigital
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── com
│   │       │       ├── bibliotecadigital
│   │       │       │   ├── domain
│   │       │       │   │   ├── model
│   │       │       │   │   │   ├── Audio.java
│   │       │       │   │   │   ├── Autor.java
│   │       │       │   │   │   ├── Libro.java
│   │       │       │   │   │   ├── MaterialBiblioteca.java
│   │       │       │   │   │   ├── Prestamo.java
│   │       │       │   │   │   ├── Revista.java
│   │       │       │   │   │   ├── RolUsuario.java
│   │       │       │   │   │   ├── Usuario.java
│   │       │       │   │   │   └── Video.java
│   │       │       │   │   └── service
│   │       │       │   │       ├── AuthenticationService.java
│   │       │       │   │       ├── AutorRepository.java
│   │       │       │   │       ├── MaterialRepository.java
│   │       │       │   │       ├── PrestamoRepository.java
│   │       │       │   │       └── UsuarioRepository.java
│   │       │       │   ├── infrastructure
│   │       │       │   │   └── persistence
│   │       │       │   │       ├── JpaAutorRepository.java
│   │       │       │   │       ├── JpaMaterialRepository.java
│   │       │       │   │       ├── JpaPrestamoRepository.java
│   │       │       │   │       └── JpaUsuarioRepository.java
│   │       │       │   └── presentation
│   │       │       │       └── desktop
│   │       │       │           ├── controllers
│   │       │       │           │   ├── GestionAutoresController.java
│   │       │       │           │   ├── GestionMaterialesController.java
│   │       │       │           │   ├── GestionPrestamosController.java
│   │       │       │           │   ├── GestionUsuariosController.java
│   │       │       │           │   └── MenuController.java
│   │       │       │           └── views
│   │       │       │               ├── GestionAutoresView.form
│   │       │       │               ├── GestionAutoresView.java
│   │       │       │               ├── GestionAutoresViewInterface.java
│   │       │       │               ├── GestionMaterialesView.form
│   │       │       │               ├── GestionMaterialesView.java
│   │       │       │               ├── GestionMaterialesViewInterface.java
│   │       │       │               ├── GestionPrestamosView.form
│   │       │       │               ├── GestionPrestamosView.java
│   │       │       │               ├── GestionPrestamosViewInterface.java
│   │       │       │               ├── GestionUsuariosView.form
│   │       │       │               ├── GestionUsuariosView.java
│   │       │       │               ├── GestionUsuariosViewInterface.java
│   │       │       │               ├── MenuView.java
│   │       │       │               ├── NuevoPrestamoDialog.form
│   │       │       │               └── NuevoPrestamoDialog.java
│   │       │       └── mycompany
│   │       │           └── bibliotecadigital
│   │       │               └── BibliotecaDigital.java
│   │       └── resources
│   │           └── META-INF
│   │               └── persistence.xml
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
│   │   │       │   │       ├── AutorRepository.class
│   │   │       │   │       ├── MaterialRepository.class
│   │   │       │   │       ├── PrestamoRepository.class
│   │   │       │   │       └── UsuarioRepository.class
│   │   │       │   ├── infrastructure
│   │   │       │   │   └── persistence
│   │   │       │   │       ├── JpaAutorRepository.class
│   │   │       │   │       ├── JpaMaterialRepository.class
│   │   │       │   │       ├── JpaPrestamoRepository.class
│   │   │       │   │       └── JpaUsuarioRepository.class
│   │   │       │   └── presentation
│   │   │       │       └── desktop
│   │   │       │           ├── controllers
│   │   │       │           │   ├── GestionAutoresController.class
│   │   │       │           │   ├── GestionMaterialesController.class
│   │   │       │           │   ├── GestionPrestamosController.class
│   │   │       │           │   ├── GestionUsuariosController.class
│   │   │       │           │   └── MenuController.class
│   │   │       │           └── views
│   │   │       │               ├── GestionAutoresView$1.class
│   │   │       │               ├── GestionAutoresView$2.class
│   │   │       │               ├── GestionAutoresView.class
│   │   │       │               ├── GestionAutoresView.form
│   │   │       │               ├── GestionAutoresViewInterface.class
│   │   │       │               ├── GestionMaterialesView$1.class
│   │   │       │               ├── GestionMaterialesView$2.class
│   │   │       │               ├── GestionMaterialesView$3.class
│   │   │       │               ├── GestionMaterialesView.class
│   │   │       │               ├── GestionMaterialesView.form
│   │   │       │               ├── GestionMaterialesViewInterface.class
│   │   │       │               ├── GestionPrestamosView$1.class
│   │   │       │               ├── GestionPrestamosView$2.class
│   │   │       │               ├── GestionPrestamosView.class
│   │   │       │               ├── GestionPrestamosView.form
│   │   │       │               ├── GestionPrestamosViewInterface.class
│   │   │       │               ├── GestionUsuariosView$1.class
│   │   │       │               ├── GestionUsuariosView$DetalleUsuarioDialog.class
│   │   │       │               ├── GestionUsuariosView$EditarUsuarioDialog.class
│   │   │       │               ├── GestionUsuariosView$NuevoUsuarioDialog.class
│   │   │       │               ├── GestionUsuariosView.class
│   │   │       │               ├── GestionUsuariosView.form
│   │   │       │               ├── GestionUsuariosViewInterface.class
│   │   │       │               ├── MenuView.class
│   │   │       │               ├── NuevoPrestamoDialog$1.class
│   │   │       │               ├── NuevoPrestamoDialog$2.class
│   │   │       │               ├── NuevoPrestamoDialog.class
│   │   │       │               └── NuevoPrestamoDialog.form
│   │   │       └── mycompany
│   │   │           └── bibliotecadigital
│   │   │               └── BibliotecaDigital.class
│   │   ├── generated-sources
│   │   │   └── annotations
│   │   ├── maven-status
│   │   │   └── maven-compiler-plugin
│   │   │       └── compile
│   │   │           └── default-compile
│   │   │               ├── createdFiles.lst
│   │   │               └── inputFiles.lst
│   │   └── test-classes
│   ├── biblioteca.db
│   ├── nb-configuration.xml
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
│   │   ├── S2.md
│   │   └── S3.md
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

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AUDIO")
public class Audio extends MaterialBiblioteca {
    private float duracion;
    private String formato;
    
    public Audio() { super(); }
    
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

    public Object getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getEditorial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumPaginas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public float getDuracion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "prestamo_material",
        joinColumns = @JoinColumn(name = "prestamo_id"),
        inverseJoinColumns = @JoinColumn(name = "material_id")
    )
    private List<MaterialBiblioteca> materiales;
    
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    /**
     * Constructor vacío, OBLIGATORIO para JPA.
     */
    public Prestamo() {
    }

    /**
     * CONSTRUCTOR NUEVO: Para crear préstamos donde la BD genera el ID.
     * Este es el que tu controlador necesita.
     */
    public Prestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = LocalDate.now();
    }
    
    /**
     * Constructor original, útil para pruebas o casos específicos.
     */
    public Prestamo(int id, Usuario usuario, List<MaterialBiblioteca> materiales) {
        this.id = id;
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = LocalDate.now();
    }

    // --- Getters y Setters ---
    public int getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public List<MaterialBiblioteca> getMateriales() { return materiales; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(LocalDate fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Revista.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("REVISTA") // Identificador para esta subclase en la tabla
public class Revista extends MaterialBiblioteca {
    private String editorial;
    private int numero;
    
    public Revista() { super(); }
    
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
    public boolean verificarPassword(String passwordIngresada) {
        return BCrypt.checkpw(passwordIngresada, this.passwordHash);
    }
    
    public void setRol(RolUsuario rol) { this.rol = rol; }
    public void setId(Long id) { this.id = id;}
    public void setEmail(String email) { this.email = email; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\model\Video.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VIDEO")
public class Video extends MaterialBiblioteca {
    private float duracion;
    private String formato;

    public Video() { super(); }
    
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
package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Usuario;
import java.util.Optional; // Importar Optional

public class AuthenticationService {
    
    // 1. La dependencia ahora es contra la INTERFAZ, no la clase concreta.
    private final UsuarioRepository usuarioRepo;

    // 2. El constructor ahora pide un UsuarioRepository. Esto se llama Inyección de Dependencias.
    public AuthenticationService(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    /**
     * Intenta autenticar a un usuario.
     * @param email El email del usuario.
     * @param password La contraseña en texto plano.
     * @return Un Optional que contiene al Usuario si el login es exitoso, o un Optional vacío si falla.
     */
    public Optional<Usuario> login(String email, String password) {
        // 3. Usamos el nuevo repositorio y manejamos el Optional.
        Optional<Usuario> usuarioOpt = usuarioRepo.findByEmail(email);

        // 4. Lógica moderna y segura con map y filter de Optional.
        return usuarioOpt.filter(usuario -> usuario.verificarPassword(password));
    }
    
    /**
     * Verifica si un usuario tiene permiso para una funcionalidad.
     * (Este método no cambia, pero es bueno mantenerlo aquí).
     */
    public boolean tienePermiso(Usuario usuario, String funcionalidad) {
        if (usuario == null) return false;
        
        switch(usuario.getRol()) {
            case ADMINISTRADOR:
                return true; // Acceso total
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

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\service\AutorRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import java.util.List;
import java.util.Optional;

public interface AutorRepository {
    Autor save(Autor autor);
    Optional<Autor> findById(int id);
    List<Autor> findAll();
    void deleteById(int id);
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\service\MaterialRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import java.util.List;
import java.util.Optional;

public interface MaterialRepository {
    MaterialBiblioteca save(MaterialBiblioteca material);
    Optional<MaterialBiblioteca> findById(int id);
    List<MaterialBiblioteca> findAll();
    List<MaterialBiblioteca> findByTitulo(String titulo);
    void deleteById(int id);
    void saveWithAutores(MaterialBiblioteca material, List<Integer> autorIds);
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\service\PrestamoRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Prestamo;
import java.util.List;
import java.util.Optional;

public interface PrestamoRepository {
    Prestamo save(Prestamo prestamo);
    Optional<Prestamo> findById(int id);
    List<Prestamo> findAll();
    // Podrías añadir más métodos específicos aquí, como findByUsuario, etc.
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\domain\service\UsuarioRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.domain.service;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
    Optional<Usuario> findByEmail(String email);
    List<Usuario> findAll();
    void delete(Usuario usuario);
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\infrastructure\persistence\JpaAutorRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.service.AutorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaAutorRepository implements AutorRepository {

    private final EntityManagerFactory emf;

    public JpaAutorRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // Métodos de utilidad para manejar el EntityManager y las transacciones
    private <T> T execute(Function<EntityManager, T> action) {
        EntityManager em = emf.createEntityManager();
        try {
            return action.apply(em);
        } finally {
            em.close();
        }
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public Autor save(Autor autor) {
        executeInsideTransaction(em -> {
            if (autor.getId() == 0) {
                em.persist(autor);
            } else {
                em.merge(autor);
            }
        });
        return autor;
    }

    @Override
    public Optional<Autor> findById(int id) {
        return Optional.ofNullable(execute(em -> em.find(Autor.class, id)));
    }

    @Override
    public List<Autor> findAll() {
        return execute(em -> em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList());
    }

    @Override
    public void deleteById(int id) {
        executeInsideTransaction(em -> {
            // Primero, busca el autor usando el EntityManager de ESTA transacción
            Autor autorParaBorrar = em.find(Autor.class, id);
            if (autorParaBorrar != null) {
                // Ahora sí, borra el objeto que está gestionado ("attached")
                em.remove(autorParaBorrar);
            }
        });
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\infrastructure\persistence\JpaMaterialRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.service.MaterialRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaMaterialRepository implements MaterialRepository {

    private final EntityManagerFactory emf;

    public JpaMaterialRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // Métodos de utilidad para manejar el EntityManager y las transacciones
    private <T> T execute(Function<EntityManager, T> action) {
        EntityManager em = emf.createEntityManager();
        try { return action.apply(em); } 
        finally { em.close(); }
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public MaterialBiblioteca save(MaterialBiblioteca material) {
        executeInsideTransaction(em -> {
            // Re-asociar los autores a la sesión actual de persistencia
            List<Autor> autoresGestionados = new ArrayList<>();
            if (material.getAutores() != null) {
                for (Autor autor : material.getAutores()) {
                    // Busca la versión "fresca" del autor en la BD y la añade
                    autoresGestionados.add(em.find(Autor.class, autor.getId()));
                }
            }
            material.setAutores(autoresGestionados);

            // Merge es la operación correcta aquí: inserta si es nuevo, actualiza si existe
            em.merge(material);
        });
        return material;
    }

    @Override
    public void saveWithAutores(MaterialBiblioteca material, List<Integer> autorIds) {
        executeInsideTransaction(em -> {
            List<Autor> autoresGestionados = new ArrayList<>();
            for (Integer idAutor : autorIds) {
                Autor autor = em.find(Autor.class, idAutor);
                if (autor != null) {
                    autoresGestionados.add(autor);
                }
            }
            material.setAutores(autoresGestionados);
            em.persist(material);
        });
    }

    @Override
    public Optional<MaterialBiblioteca> findById(int id) {
        return Optional.ofNullable(execute(em -> em.find(MaterialBiblioteca.class, id)));
    }

    @Override
    public List<MaterialBiblioteca> findAll() {
        return execute(em -> em.createQuery("SELECT m FROM MaterialBiblioteca m", MaterialBiblioteca.class).getResultList());
    }
    
    @Override
    public List<MaterialBiblioteca> findByTitulo(String titulo) {
        return execute(em -> {
            TypedQuery<MaterialBiblioteca> query = em.createQuery(
                "SELECT m FROM MaterialBiblioteca m WHERE lower(m.titulo) LIKE lower(:titulo)", MaterialBiblioteca.class);
            query.setParameter("titulo", "%" + titulo + "%");
            return query.getResultList();
        });
    }

    @Override
    public void deleteById(int id) {
        executeInsideTransaction(em -> 
            findById(id).ifPresent(em::remove)
        );
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\infrastructure\persistence\JpaPrestamoRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.service.PrestamoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaPrestamoRepository implements PrestamoRepository {

    private final EntityManagerFactory emf;

    public JpaPrestamoRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    // Métodos de utilidad para manejar el EntityManager y las transacciones
    private <T> T execute(Function<EntityManager, T> action) {
        EntityManager em = emf.createEntityManager();
        try { return action.apply(em); } 
        finally { em.close(); }
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public Prestamo save(Prestamo prestamo) {
        executeInsideTransaction(em -> {
            if (prestamo.getId() == 0) {
                em.persist(prestamo);
            } else {
                em.merge(prestamo);
            }
        });
        return prestamo;
    }

    @Override
    public Optional<Prestamo> findById(int id) {
        return Optional.ofNullable(execute(em -> em.find(Prestamo.class, id)));
    }

    @Override
    public List<Prestamo> findAll() {
        return execute(em -> em.createQuery("SELECT p FROM Prestamo p", Prestamo.class).getResultList());
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\infrastructure\persistence\JpaUsuarioRepository.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaUsuarioRepository implements UsuarioRepository {

    private final EntityManagerFactory emf;

    public JpaUsuarioRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // (Puedes copiar los métodos de utilidad 'execute' y 'executeInsideTransaction' de JpaAutorRepository)
    // Métodos de utilidad para manejar el EntityManager y las transacciones
    private <T> T execute(Function<EntityManager, T> action) {
        EntityManager em = emf.createEntityManager();
        try {
            return action.apply(em);
        } finally {
            em.close();
        }
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public Usuario save(Usuario usuario) {
        executeInsideTransaction(em -> {
            if (usuario.getId() == null) {
                em.persist(usuario);
            } else {
                em.merge(usuario);
            }
        });
        return usuario;
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return Optional.ofNullable(execute(em -> em.find(Usuario.class, id)));
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return execute(em -> {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class);
            query.setParameter("email", email);
            try {
                return Optional.of(query.getSingleResult());
            } catch (jakarta.persistence.NoResultException e) {
                return Optional.empty();
            }
        });
    }

    @Override
    public List<Usuario> findAll() {
        return execute(em -> em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList());
    }

    @Override
    public void delete(Usuario usuario) {
        executeInsideTransaction(em -> {
            if (em.contains(usuario)) {
                em.remove(usuario);
            } else {
                Usuario managedUsuario = em.find(Usuario.class, usuario.getId());
                if (managedUsuario != null) {
                    em.remove(managedUsuario);
                }
            }
        });
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
import com.bibliotecadigital.domain.service.AutorRepository;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;

public class GestionAutoresController {

    private final AutorRepository autorRepo;
    private final GestionAutoresViewInterface vista;

    public GestionAutoresController(AutorRepository autorRepo, GestionAutoresViewInterface vista) {
        this.autorRepo = autorRepo;
        this.vista = vista;
        
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addNuevoListener(e -> crearNuevoAutor());
        this.vista.addEditarListener(e -> editarAutorSeleccionado());
        this.vista.addEliminarListener(e -> eliminarAutorSeleccionado());
        
        // Cargar los datos iniciales
        cargarAutores();
    }

    public void cargarAutores() {
        vista.mostrarAutores(autorRepo.findAll());
    }

    public void crearNuevoAutor() {
        String nombre = vista.pedirNuevoNombreAutor("");
        if (nombre != null && !nombre.trim().isEmpty()) {
            autorRepo.save(new Autor(0, nombre));
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
            autorRepo.save(autorSeleccionado);
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
                autorRepo.deleteById(autorSeleccionado.getId());
                cargarAutores(); // Refrescar la tabla
                vista.mostrarMensaje("Autor eliminado exitosamente.");
            } catch (Exception e) {
                // Manejar el caso de que un autor no se pueda borrar por tener libros asociados
                vista.mostrarMensaje("Error: No se puede eliminar el autor, probablemente tiene materiales asociados.");
            }
        }
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\controllers\GestionMaterialesController.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.service.AutorRepository;
import com.bibliotecadigital.domain.service.MaterialRepository;
import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.Video;
import com.bibliotecadigital.presentation.desktop.views.GestionMaterialesViewInterface;
import java.util.List;

/**
 *
 * @author Diego Garcia
 */
public class GestionMaterialesController {
    
    private final MaterialRepository materialRepo;
    private final AutorRepository autorRepo;
    private final GestionMaterialesViewInterface vista;

    // El constructor ahora pide los repositorios específicos que necesita
    public GestionMaterialesController(MaterialRepository materialRepo, AutorRepository autorRepo, GestionMaterialesViewInterface vista) {
        this.materialRepo = materialRepo;
        this.autorRepo = autorRepo;
        this.vista = vista;
        
        this.vista.addNuevoListener(e -> crearNuevoMaterial());
        this.vista.addEditarListener(e -> editarMaterialSeleccionado());
        this.vista.addEliminarListener(e -> eliminarMaterialSeleccionado());
        
        cargarMateriales();
    }

    public void cargarMateriales() {
        vista.mostrarMateriales(materialRepo.findAll());
    }

    public void crearNuevoMaterial() {
        // Pasamos valores "vacíos" o neutros porque es creación
        String tipo = vista.pedirTipoMaterial("").trim().toLowerCase(); // libro/revista/video/audio
        String titulo = vista.pedirNuevoTituloMaterial("");
        int anio = vista.pedirAnioMaterial(0);
        String rutaArchivo = vista.pedirRutaArchivo("");
        boolean disponible = true; // disponible por default
        
        // --- NUEVO FLUJO PARA AUTORES ---
        List<Autor> autoresSeleccionados = vista.pedirSeleccionAutores(autorRepo.findAll());
        if (autoresSeleccionados == null || autoresSeleccionados.isEmpty()) {
            vista.mostrarMensaje("La selección de autores fue cancelada o está vacía. No se creó el material.");
            return;
        }

        MaterialBiblioteca material = null;

        System.out.println("tipo: " + tipo);

        switch (tipo) {
            case "libro":
                String editorial = vista.pedirEditorial("");  // ahora recibe parámetro
                Integer numPaginas = vista.pedirNumPaginas(null);   // ahora recibe parámetro
                material = new Libro(0, titulo, anio, rutaArchivo, editorial, numPaginas);
                break;

            case "revista":
                String edit = vista.pedirEditorial("");     // parámetro
                int numero = vista.pedirNumero(0);          // parámetro
                material = new Revista(0, titulo, anio, rutaArchivo, edit, numero);
                break;

            case "video":
                float duracion = vista.pedirDuracion(0f);   // parámetro
                String formato = vista.pedirFormato("");    // parámetro
                material = new Video(0, titulo, anio, rutaArchivo, duracion, formato);
                break;

            case "audio":
                float dur = vista.pedirDuracion(0f);       // parámetro
                String form = vista.pedirFormato("");      // parámetro
                material = new Audio(0, titulo, anio, rutaArchivo, dur, form);
                break;

            default:
                vista.mostrarMensaje("Tipo de material no válido.");
        }

        System.out.println("Creando material tipo: " + tipo);

        if (material != null) {
            material.setAutores(autoresSeleccionados);
            // Usa el método 'save' que ahora es más potente
            materialRepo.save(material); 
            cargarMateriales();
            vista.mostrarMensaje("Material creado exitosamente.");
        }
    }
    
    public void editarMaterialSeleccionado() {
        MaterialBiblioteca materialSeleccionado = vista.getMaterialSeleccionado();
        if (materialSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un material para editar.");
            return;
        }

        // Editar título
        String nuevoTitulo = vista.pedirNuevoTituloMaterial(materialSeleccionado.getTitulo());
        if (nuevoTitulo != null && !nuevoTitulo.trim().isEmpty()) {
            materialSeleccionado.setTitulo(nuevoTitulo);
        }

        // Editar estado
        boolean nuevoDisponible = vista.pedirEstadoMaterial(materialSeleccionado.isDisponible());
        materialSeleccionado.setDisponible(nuevoDisponible);

        // Editar año
        int nuevoAnio = vista.pedirAnioMaterial(materialSeleccionado.getAnio());
        if (nuevoAnio > 0) { // Puedes agregar más validaciones si quieres
            materialSeleccionado.setAnio(nuevoAnio);
        }

        // Editar ruta de archivo
        String nuevaRuta = vista.pedirRutaArchivo(materialSeleccionado.getRutaArchivo());
        if (nuevaRuta != null && !nuevaRuta.trim().isEmpty()) {
            materialSeleccionado.setRutaArchivo(nuevaRuta);
        }
        
        // Editar autores (opcional)
        //List<Integer> nuevosIdsAutores = vista.pedirIdsAutores(materialSeleccionado.getAutores());
        //servicio.actualizarAutores(materialSeleccionado, nuevosIdsAutores);

        // Editar atributos según el tipo
        if (materialSeleccionado instanceof Libro libro) {
            String nuevaEditorial = vista.pedirEditorial(libro.getEditorial());
            libro.setEditorial(nuevaEditorial);
            int nuevasPaginas = vista.pedirNumPaginas(libro.getNumPaginas());
            libro.setNumPaginas(nuevasPaginas);
        } else if (materialSeleccionado instanceof Revista revista) {
            String nuevaEditorial = vista.pedirEditorial(revista.getEditorial());
            revista.setEditorial(nuevaEditorial);
            int nuevoNumero = vista.pedirNumero(revista.getNumero());
            revista.setNumero(nuevoNumero);
        } else if (materialSeleccionado instanceof Audio audio) {
            float nuevaDuracion = vista.pedirDuracion(audio.getDuracion());
            audio.setDuracion(nuevaDuracion);
            String nuevoFormato = vista.pedirFormato(audio.getFormato());
            audio.setFormato(nuevoFormato);
        } else if (materialSeleccionado instanceof Video video) {
            float nuevaDuracion = vista.pedirDuracion(video.getDuracion());
            video.setDuracion(nuevaDuracion);
            String nuevoFormato = vista.pedirFormato(video.getFormato());
            video.setFormato(nuevoFormato);
        }

        // Guardar cambios
        materialRepo.save(materialSeleccionado);
        cargarMateriales(); // Refrescar la tabla
        vista.mostrarMensaje("Material actualizado exitosamente.");

    }
    
    public void eliminarMaterialSeleccionado() {
        MaterialBiblioteca materialSeleccionado = vista.getMaterialSeleccionado();
        if (materialSeleccionado == null) {
            vista.mostrarMensaje("Por favor, seleccione un material para eliminar.");
            return;
        }

        if (vista.confirmarEliminacion(materialSeleccionado.getTitulo())) {
            try {
                materialRepo.deleteById(materialSeleccionado.getId());
                cargarMateriales(); // Refrescar la tabla
                vista.mostrarMensaje("Material eliminado exitosamente.");
            } catch (Exception e) {
                // Manejar el caso de que un material no se pueda borrar por tener prestamos asociados
                vista.mostrarMensaje("Error: No se puede eliminar el material, probablemente tiene un prestamo asociados.");
            }
        }
    }
    
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\controllers\GestionPrestamosController.java`

```java
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.MaterialRepository;
import com.bibliotecadigital.domain.service.PrestamoRepository;
import com.bibliotecadigital.domain.service.UsuarioRepository;
import com.bibliotecadigital.presentation.desktop.views.GestionPrestamosView;
import com.bibliotecadigital.presentation.desktop.views.GestionPrestamosViewInterface;
import java.time.LocalDate;
import java.util.List;

public class GestionPrestamosController {
    
    private final PrestamoRepository prestamoRepo;
    private final UsuarioRepository usuarioRepo;
    private final MaterialRepository materialRepo;
    private final GestionPrestamosViewInterface vista;
    
    public GestionPrestamosController(PrestamoRepository prestamoRepo, 
                                      UsuarioRepository usuarioRepo, 
                                      MaterialRepository materialRepo, 
                                      GestionPrestamosViewInterface vista) {
        this.prestamoRepo = prestamoRepo;
        this.usuarioRepo = usuarioRepo;
        this.materialRepo = materialRepo;
        this.vista = vista;
        
        // Pasa la referencia de este controlador a la vista
        if (vista instanceof GestionPrestamosView) {
            ((GestionPrestamosView) vista).setController(this);
        }
        
        this.vista.addNuevoPrestamoListener(e -> abrirDialogoNuevoPrestamo());
        this.vista.addFinalizarPrestamoListener(e -> finalizarPrestamoSeleccionado());
        this.vista.addRefrescarListener(e -> cargarPrestamos());
        
        cargarPrestamos();
    }
    
    public void cargarPrestamos() {
        vista.mostrarPrestamos(prestamoRepo.findAll());
    }
    
    private void abrirDialogoNuevoPrestamo() {
        vista.abrirDialogoNuevoPrestamo();
    }
    
    public void crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        if (usuario == null || materiales == null || materiales.isEmpty()) {
            vista.mostrarError("Debe seleccionar un usuario y al menos un material.");
            return;
        }
        
        Prestamo nuevoPrestamo = new Prestamo(usuario, materiales);
        prestamoRepo.save(nuevoPrestamo);
        
        vista.mostrarMensaje("Préstamo creado correctamente con ID: " + nuevoPrestamo.getId());
        cargarPrestamos();
    }
    
    private void finalizarPrestamoSeleccionado() {
        Prestamo prestamo = vista.getPrestamoSeleccionado();
        
        if (prestamo == null) {
            vista.mostrarError("Por favor, seleccione un préstamo para finalizar.");
            return;
        }
        
        if (prestamo.getFechaDevolucion() != null) {
            vista.mostrarError("El préstamo seleccionado ya está finalizado.");
            return;
        }
        
        if (vista.confirmarFinalizacionPrestamo(prestamo)) {
            prestamo.setFechaDevolucion(LocalDate.now());
            prestamoRepo.save(prestamo);
            
            vista.mostrarMensaje("Préstamo finalizado correctamente.");
            cargarPrestamos();
        }
    }
    
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepo.findAll();
    }
    
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        return materialRepo.findByTitulo(titulo);
    }

    public Prestamo buscarPrestamoPorId(int id) {
        return prestamoRepo.findById(id).orElse(null);
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\controllers\GestionUsuariosController.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosView;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosViewInterface;
import com.bibliotecadigital.domain.service.UsuarioRepository;
import java.util.List;

/**
 *
 * @author Manu Hdz
 */
public class GestionUsuariosController {
    private final UsuarioRepository usuarioRepo; // <-- Cambia a la interfaz específica
    private final GestionUsuariosViewInterface vista;

    public GestionUsuariosController(UsuarioRepository usuarioRepo, GestionUsuariosViewInterface vista) {
        this.usuarioRepo = usuarioRepo;
        this.vista = vista;
        
        this.vista.addCrearListener(e -> crearUsuario());
        this.vista.addModificarListener(e -> modificarUsuario());
        this.vista.addEliminarListener(e -> eliminarUsuario());
        
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        vista.mostrarUsuarios(usuarioRepo.findAll()); // Usa el nuevo repositorio
    }
    
    private void eliminarUsuario() {
        Usuario seleccionado = vista.getUsuarioSeleccionado();

    if (seleccionado != null && vista.confirmarEliminacion(seleccionado.getNombre())) {
        // Llamamos al servicio para eliminar de la BD
        usuarioRepo.delete(seleccionado);

        // Refrescamos la tabla
        cargarUsuarios();

        vista.mostrarMensaje("Usuario eliminado correctamente.");
    } else {
        vista.mostrarMensaje("Seleccione un usuario para eliminar.");
    }
    }
    
    private void crearUsuario() {
        GestionUsuariosView.NuevoUsuarioDialog dialog = ((GestionUsuariosView) vista).new NuevoUsuarioDialog(vista.getFrame());
        dialog.setVisible(true);

        Usuario nuevo = dialog.getUsuarioCreado();
        if (nuevo != null) {
            try {

                usuarioRepo.save(nuevo);

                vista.mostrarMensaje("Usuario agregado correctamente");
                cargarUsuarios(); // refresca tabla desde BD

            } catch (Exception ex) {
                // Capturar excepciones de la BD, como un email duplicado
                vista.mostrarMensaje("No se pudo agregar usuario. ¿Email duplicado? Error: " + ex.getMessage());
            }
        }
    }
    private void modificarUsuario() {
        Usuario seleccionado = vista.getUsuarioSeleccionado();
        if (seleccionado != null) {
            // Abrimos el diálogo de edición
            GestionUsuariosView.EditarUsuarioDialog dialog = ((GestionUsuariosView) vista).new EditarUsuarioDialog(vista.getFrame(), seleccionado);
            dialog.setVisible(true);

            // Si el usuario guardó los cambios
            Usuario editado = dialog.getUsuarioEditado();
            if (editado != null) {
                // Actualizamos en la BD
                usuarioRepo.save(editado);

                // Refrescamos la tabla
                cargarUsuarios();

                vista.mostrarMensaje("Usuario actualizado correctamente.");
            }
        } else {
            vista.mostrarMensaje("Seleccione un usuario para modificar.");
        }
    }
    
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\controllers\MenuController.java`

```java
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.service.*;
import com.bibliotecadigital.infrastructure.persistence.JpaAutorRepository;
import com.bibliotecadigital.infrastructure.persistence.JpaMaterialRepository;
import com.bibliotecadigital.infrastructure.persistence.JpaPrestamoRepository;
import com.bibliotecadigital.infrastructure.persistence.JpaUsuarioRepository;
import com.bibliotecadigital.presentation.desktop.views.*;
import jakarta.persistence.EntityManagerFactory;
import javax.swing.JFrame;

public class MenuController {

    private final MenuView menuView;
    private final EntityManagerFactory emf;

    public MenuController(MenuView menuView, EntityManagerFactory emf) {
        this.menuView = menuView;
        this.emf = emf;
        
        // Asignar acciones a los botones del menú
        this.menuView.addGestionarAutoresListener(e -> abrirGestionAutores());
        this.menuView.addGestionarMaterialesListener(e -> abrirGestionMateriales());
        this.menuView.addGestionarUsuariosListener(e -> abrirGestionUsuarios());
        this.menuView.addGestionarPrestamosListener(e -> abrirGestionPrestamos());
    }

    private void abrirGestionAutores() {
        AutorRepository autorRepo = new JpaAutorRepository(emf);
        GestionAutoresViewInterface vista = new GestionAutoresView();
        new GestionAutoresController(autorRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana
        vista.setVisible(true);
    }
    
    private void abrirGestionMateriales() {
        MaterialRepository materialRepo = new JpaMaterialRepository(emf);
        AutorRepository autorRepo = new JpaAutorRepository(emf);
        GestionMaterialesViewInterface vista = new GestionMaterialesView();
        new GestionMaterialesController(materialRepo, autorRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setVisible(true);
    }
    
    private void abrirGestionUsuarios() {
        UsuarioRepository usuarioRepo = new JpaUsuarioRepository(emf);
        GestionUsuariosViewInterface vista = new GestionUsuariosView();
        new GestionUsuariosController(usuarioRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setVisible(true);
    }

    private void abrirGestionPrestamos() {
        PrestamoRepository prestamoRepo = new JpaPrestamoRepository(emf);
        UsuarioRepository usuarioRepo = new JpaUsuarioRepository(emf);
        MaterialRepository materialRepo = new JpaMaterialRepository(emf);
        GestionPrestamosViewInterface vista = new GestionPrestamosView();
        new GestionPrestamosController(prestamoRepo, usuarioRepo, materialRepo, vista);
        vista.getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setVisible(true);
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

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionMaterialesView.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.Video;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Diego Garcia
 */
public class GestionMaterialesView extends javax.swing.JFrame implements GestionMaterialesViewInterface {
    
    private DefaultTableModel tableModel; // El modelo de datos para nuestra tabla
    /**
     * Creates new form GestionMaterialesView
     */
    public GestionMaterialesView() {
        initComponents();
        configuracionAdicional();
    }
    
    private void configuracionAdicional() {
        // 1. Crear nuestro modelo de tabla personalizado
        tableModel = new DefaultTableModel(new Object[]{"ID", "Año", "Titulo", "Ruta de archivo", "Estado", "Autor(es)", "Tipo", "Editorial", "Num paginas", "Numero", "Duracion" ,"Formato"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer que las celdas no sean editables
            }
        };
        
        // 2. Conectar nuestra JTable (materialesTable) con el modelo de datos
        materialesTable.setModel(tableModel);
        
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
        materialesTable = new javax.swing.JTable();
        nuevoButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        materialesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPanelTabla.setViewportView(materialesTable);

        nuevoButton.setText("Nuevo");
        nuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar");

        eliminarButton.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoButton)
                    .addComponent(editarButton)
                    .addComponent(eliminarButton))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionMaterialesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMaterialesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMaterialesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMaterialesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionMaterialesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTable materialesTable;
    private javax.swing.JButton nuevoButton;
    private javax.swing.JScrollPane scrollPanelTabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addNuevoListener(ActionListener listener) {
        nuevoButton.addActionListener(listener);
    }

    @Override
    public void addEditarListener(ActionListener listener) {
        editarButton.addActionListener(listener);    }

    @Override
    public void addEliminarListener(ActionListener listener) {
        eliminarButton.addActionListener(listener);
    }

    @Override
    public void mostrarMateriales(List<MaterialBiblioteca> materiales) {
        tableModel.setRowCount(0); // limpiar tabla

        for (MaterialBiblioteca material : materiales) {
            // Convertir lista de autores a string con IDs separados por coma
            String autoresId = material.getAutores().stream()
                                       .map(a -> String.valueOf(a.getId()))
                                       .collect(Collectors.joining(","));

            String tipo = "";
            String editorial = "";
            int numPaginas = 0;
            int numero = 0;
            float duracion = 0;
            String formato = "";

            if (material instanceof Libro l) {
                tipo = "libro";
                editorial = l.getEditorial();
                numPaginas = l.getNumPaginas();
            } else if (material instanceof Revista r) {
                tipo = "revista";
                editorial = r.getEditorial();
                numero = r.getNumero();
            } else if (material instanceof Audio a) {
                tipo = "audio";
                duracion = a.getDuracion();
                formato = a.getFormato();
            } else if (material instanceof Video v) {
                tipo = "video";
                duracion = v.getDuracion();
                formato = v.getFormato();
            }

            tableModel.addRow(new Object[]{
                material.getId(),
                material.getAnio(),
                material.getTitulo(),
                material.getRutaArchivo(),
                material.isDisponible() ? "Disponible" : "No disponible",
                autoresId, // solo IDs
                tipo,
                editorial,
                numPaginas,
                numero, //.getNumero() == 0 ? "" : material.getNumero(),
                duracion, //.getDuracion() == 0f ? "" : material.getDuracion(),
                formato
            });
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public MaterialBiblioteca getMaterialSeleccionado() {
        int selectedRow = materialesTable.getSelectedRow();
        if (selectedRow < 0) return null;

        int id = (int) tableModel.getValueAt(selectedRow, 0);
        int anio = (int) tableModel.getValueAt(selectedRow, 1);
        String titulo = (String) tableModel.getValueAt(selectedRow, 2);
        String rutaArchivo = (String) tableModel.getValueAt(selectedRow, 3);
        boolean disponible = "Disponible".equals(tableModel.getValueAt(selectedRow, 4));

        String autoresIdStr = (String) tableModel.getValueAt(selectedRow, 5);
        List<Autor> autores = new ArrayList<>();
        if (autoresIdStr != null && !autoresIdStr.isEmpty()) {
            for (String sId : autoresIdStr.split(",")) {
                int aId = Integer.parseInt(sId.trim());
                autores.add(new Autor(aId, "")); // solo con ID, nombre puede obtenerse de DB si quieres
            }
        }

        String tipo = (String) tableModel.getValueAt(selectedRow, 6);

        MaterialBiblioteca material = switch (tipo) {
            case "libro" -> new Libro(id, titulo, anio, rutaArchivo,
                                      (String) tableModel.getValueAt(selectedRow, 7),
                                      (int) tableModel.getValueAt(selectedRow, 8));
            case "revista" -> new Revista(id, titulo, anio, rutaArchivo,
                                          (String) tableModel.getValueAt(selectedRow, 7),
                                          (int) tableModel.getValueAt(selectedRow, 9));
            case "audio" -> new Audio(id, titulo, anio, rutaArchivo,
                                      ((Number) tableModel.getValueAt(selectedRow, 10)).floatValue(),
                                      (String) tableModel.getValueAt(selectedRow, 11));
            case "video" -> new Video(id, titulo, anio, rutaArchivo,
                                      ((Number) tableModel.getValueAt(selectedRow, 10)).floatValue(),
                                      (String) tableModel.getValueAt(selectedRow, 11));
            default -> null;
        };

        if (material != null) {
            material.setDisponible(disponible);
            autores.forEach(material::agregarAutor);
        }

        return material;
    }

    @Override
    public String pedirTipoMaterial(String tipoActual) {
         String[] opciones = {"Libro", "Revista", "Audio", "Video"};

        // Determinar la opción inicial según el tipo actual
        int seleccionInicial = 0;
        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equalsIgnoreCase(tipoActual)) {
                seleccionInicial = i;
                break;
            }
        }

        int seleccion = JOptionPane.showOptionDialog(
            this,
            "Seleccione el tipo de material:",
            "Tipo de material",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[seleccionInicial]
        );

        // Retorna la opción seleccionada, o el tipoActual si cierra el diálogo
        return seleccion >= 0 ? opciones[seleccion] : tipoActual;
    }

    @Override
    public String pedirNuevoTituloMaterial(String tituloActual) {
        // Muestra un diálogo para que el usuario ingrese un titulo
        return JOptionPane.showInputDialog(this, "Ingrese el titulo del material:", tituloActual);
    }

    @Override
    public int pedirAnioMaterial(int anioActual) {
        String input = JOptionPane.showInputDialog(this, "Ingrese el año del material:", anioActual);
        try {
            return (input == null || input.trim().isEmpty()) ? anioActual : Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return anioActual;
        }
    }

    @Override
    public String pedirRutaArchivo(String rutaActual) {
        String input = JOptionPane.showInputDialog(this, "Ingrese la ruta del archivo:", rutaActual);
        return (input == null || input.trim().isEmpty()) ? rutaActual : input.trim();
    }

    @Override
    public List<Integer> pedirIdsAutores() {
        String input = JOptionPane.showInputDialog(this, "Ingrese los IDs de los autores separados por comas:"); 
        if (input == null || input.trim().isEmpty()) { 
            return java.util.Collections.emptyList(); 
        }
        String[] partes = input.split(","); 
        List<Integer> ids = new java.util.ArrayList<>(); 
        for (String p : partes) { 
            ids.add(Integer.parseInt(p.trim())); 
        } 
        return ids;
    }

    @Override
    public String pedirEditorial(String editorialActual) {
        String input = JOptionPane.showInputDialog(this, "Ingrese la editorial:", editorialActual);
        return (input == null || input.trim().isEmpty()) ? editorialActual : input.trim();
    }

    @Override
    public Integer pedirNumPaginas(Integer numPaginasActual) {
        String input = JOptionPane.showInputDialog(this, "Ingrese el número de páginas:", numPaginasActual);
        try {
            return (input == null || input.trim().isEmpty()) ? numPaginasActual : Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return numPaginasActual;
        }
    }

    @Override
    public int pedirNumero(int numeroActual) {
        String valorPorDefecto = (numeroActual == -1) ? "" : String.valueOf(numeroActual);
        String input = JOptionPane.showInputDialog(this, "Ingrese el número de la revista:", numeroActual);
        try {
            return (input == null || input.trim().isEmpty()) ? numeroActual : Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return numeroActual;
        }
    }

    @Override
    public float pedirDuracion(float duracionActual) {
        String input = JOptionPane.showInputDialog(this, "Ingrese la duración (en minutos):", duracionActual);
        try {
            return (input == null || input.trim().isEmpty()) ? duracionActual : Float.parseFloat(input.trim());
        } catch (NumberFormatException e) {
            return duracionActual;
        }
    }

    @Override
    public String pedirFormato(String formatoActual) {
        String input = JOptionPane.showInputDialog(this, "Ingrese el formato:", formatoActual);
        return (input == null || input.trim().isEmpty()) ? formatoActual : input.trim();
    }

    public boolean pedirEstadoMaterial(boolean estadoActual) {
        // Opciones a mostrar
        String[] opciones = {"Sí", "No"};

        // Determinar opción inicial según el estado actual
        int seleccionInicial = estadoActual ? 0 : 1;

        // Mostrar el cuadro de diálogo con opciones
        int seleccion = JOptionPane.showOptionDialog(
            this,
            "Seleccione el estado del material,  ¿esta disponible?:",
            "Estado del material",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[seleccionInicial]
        );

        // Retorna true si selecciona "Sí", false si selecciona "No" o cierra el diálogo
        return seleccion == 0;
    }
    
    @Override
    public boolean confirmarEliminacion(String tituloMaterial) {
        // Muestra un diálogo de confirmación
        int respuesta = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar el material '" + tituloMaterial + "'?", 
                "Confirmar Eliminación", 
                JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }

    @Override
    public JFrame getFrame() {
        return this;
    }
    
    @Override
    public List<Autor> pedirSeleccionAutores(List<Autor> todosLosAutores) {
        if (todosLosAutores == null || todosLosAutores.isEmpty()) {
            mostrarMensaje("No hay autores registrados. Por favor, agregue autores primero.");
            return null;
        }

        // Convertimos la lista de autores a un array para el JList
        Autor[] autoresArray = todosLosAutores.toArray(new Autor[0]);
        JList<Autor> listaAutores = new JList<>(autoresArray);
        listaAutores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        int resultado = JOptionPane.showConfirmDialog(this, new JScrollPane(listaAutores), 
                "Seleccione uno o más autores", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            return listaAutores.getSelectedValuesList();
        }
        return null; // El usuario canceló
    }
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionMaterialesViewInterface.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Diego Garcia
 */
public interface GestionMaterialesViewInterface {
    
    // Métodos para que el Controlador registre listeners
    void addNuevoListener(ActionListener listener);
    void addEditarListener(ActionListener listener);
    void addEliminarListener(ActionListener listener);
    
    // Métodos para que el Controlador actualice la Vista
    void mostrarMateriales(List<MaterialBiblioteca> materiales);
    void mostrarMensaje(String mensaje);
    
    // Métodos para que el Controlador obtenga datos de la Vista ---------------
    // Para todos los materiales
    MaterialBiblioteca getMaterialSeleccionado();
    String pedirTipoMaterial(String tipoActual);
    String pedirNuevoTituloMaterial(String tituloActual);
    int pedirAnioMaterial(int anioActual);
    String pedirRutaArchivo(String rutaActual);
    List<Integer> pedirIdsAutores();
    boolean pedirEstadoMaterial(boolean estadoActual);

    // Para Libro
    String pedirEditorial(String editorialActual);
    Integer pedirNumPaginas(Integer numPaginasActual);
    List<Autor> pedirSeleccionAutores(List<Autor> todosLosAutores);

    // Para Revista
    int pedirNumero(int numeroActual);

    // Para Video y Audio
    float pedirDuracion(float duracionActual);
    String pedirFormato(String formatoActual);
    // -------------------------------------------------------------------------
    
    boolean confirmarEliminacion(String tituloMaterial);
    
    // Métodos para controlar la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionPrestamosView.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.presentation.desktop.controllers.GestionPrestamosController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GestionPrestamosView extends javax.swing.JFrame implements GestionPrestamosViewInterface {
    
    private GestionPrestamosController controller;
    private DefaultTableModel prestamosModel;

    /**
     * Creates new form GestionPrestamosView
     */
    public GestionPrestamosView() {
        initComponents();
        
        // Configuración adicional
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Crear modelo de tabla no editable
        prestamosModel = new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Usuario", "Fecha Préstamo", "Fecha Devolución", "Materiales"
            }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        prestamosTable.setModel(prestamosModel);
        
      
    }
    
    /**
     * Establece el controlador para esta vista
     * @param controller Controlador de préstamos
     */
    public void setController(GestionPrestamosController controller) {
        this.controller = controller;
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prestamosTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNuevoPrestamo = new javax.swing.JButton();
        btnFinalizarPrestamo = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Préstamos");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Préstamos");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        prestamosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Fecha Préstamo", "Fecha Devolución", "Materiales"
            }
        ));
        prestamosTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(prestamosTable);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btnNuevoPrestamo.setText("Nuevo Préstamo");
        jPanel1.add(btnNuevoPrestamo);

        btnFinalizarPrestamo.setText("Finalizar Préstamo");
        jPanel1.add(btnFinalizarPrestamo);

        btnRefrescar.setText("Actualizar");
        jPanel1.add(btnRefrescar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Implementación de GestionPrestamosViewInterface
    
    @Override
    public void addNuevoPrestamoListener(ActionListener listener) {
        btnNuevoPrestamo.addActionListener(listener);
    }
    
    @Override
    public void addFinalizarPrestamoListener(ActionListener listener) {
        btnFinalizarPrestamo.addActionListener(listener);
    }
    
    @Override
    public void addRefrescarListener(ActionListener listener) {
        btnRefrescar.addActionListener(listener);
    }
    
    @Override
    public void mostrarPrestamos(List<Prestamo> prestamos) {
        // Limpiar tabla
        prestamosModel.setRowCount(0);
        
        // Formato para fechas
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Llenar tabla con préstamos
        for (Prestamo prestamo : prestamos) {
            String fechaPrestamo = prestamo.getFechaPrestamo() != null ? 
                prestamo.getFechaPrestamo().format(dateFormatter) : "No registrada";
                
            String fechaDevolucion = prestamo.getFechaDevolucion() != null ? 
                prestamo.getFechaDevolucion().format(dateFormatter) : "Pendiente";
                
            // Formar la lista de materiales
            StringBuilder materialesStr = new StringBuilder();
            List<MaterialBiblioteca> materiales = prestamo.getMateriales();
            if (materiales != null && !materiales.isEmpty()) {
                for (int i = 0; i < materiales.size(); i++) {
                    if (i > 0) {
                        materialesStr.append(", ");
                    }
                    materialesStr.append(materiales.get(i).getTitulo());
                }
            } else {
                materialesStr.append("Sin materiales");
            }
            
            prestamosModel.addRow(new Object[]{
                prestamo.getId(),
                prestamo.getUsuario() != null ? prestamo.getUsuario().getNombre() : "Desconocido",
                fechaPrestamo,
                fechaDevolucion,
                materialesStr.toString()
            });
        }
    }
    
    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public Prestamo getPrestamoSeleccionado() {
        int filaSeleccionada = prestamosTable.getSelectedRow();
        if (filaSeleccionada == -1) {
            return null;
        }

        // En este punto solo tenemos el ID del préstamo seleccionado
        int id = (Integer) prestamosModel.getValueAt(filaSeleccionada, 0);

        // Utilizar el controlador para buscar el préstamo completo
        return controller != null ? controller.buscarPrestamoPorId(id) : null;
    }
    
    @Override
    public void abrirDialogoNuevoPrestamo() {
        // Aquí pasamos 'this.controller' al constructor del diálogo
        NuevoPrestamoDialog dialog = new NuevoPrestamoDialog(this, this.controller);
        dialog.setVisible(true);
    }
    
    @Override
    public boolean confirmarFinalizacionPrestamo(Prestamo prestamo) {
        int opcion = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro de finalizar el préstamo seleccionado?",
            "Confirmar finalización",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        return opcion == JOptionPane.YES_OPTION;
    }
    
    @Override
    public JFrame getFrame() {
        return this;
    }
    
    @Override
    public void actualizarListaPrestamos() {
        if (controller != null) {
            controller.cargarPrestamos();
        }
    }

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
            java.util.logging.Logger.getLogger(GestionPrestamosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPrestamosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPrestamosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPrestamosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPrestamosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarPrestamo;
    private javax.swing.JButton btnNuevoPrestamo;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prestamosTable;
    // End of variables declaration//GEN-END:variables
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionPrestamosViewInterface.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

/**
 * Interfaz que define los métodos que debe implementar la vista para la gestión de préstamos.
 */
public interface GestionPrestamosViewInterface {
    
    // Métodos para registrar listeners
    void addNuevoPrestamoListener(ActionListener listener);
    void addFinalizarPrestamoListener(ActionListener listener);
    void addRefrescarListener(ActionListener listener);
    
    // Métodos para actualizar la vista
    void mostrarPrestamos(List<Prestamo> prestamos);
    void mostrarMensaje(String mensaje);
    void mostrarError(String mensaje);
    
    // Métodos para obtener información
    Prestamo getPrestamoSeleccionado();
    
    // Métodos para diálogos de préstamo
    void abrirDialogoNuevoPrestamo();
    boolean confirmarFinalizacionPrestamo(Prestamo prestamo);
    
    // Métodos de control de la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
    void actualizarListaPrestamos();
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionUsuariosView.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.model.Usuario;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp EliteBook
 */
public class GestionUsuariosView extends javax.swing.JFrame implements GestionUsuariosViewInterface {
    
    private DefaultTableModel modelo;
    private List<Usuario> listaUsuarios = new ArrayList<>();
    
    /**
     * Creates new form GestionUsuariosView
     */
    public GestionUsuariosView() {
        initComponents();
        modelo = new DefaultTableModel(new String[]{"id","Nombre","Email","Rol"},0);
        tablaUsuarios.setModel(modelo); // Tabla con el modelo
        tablaUsuarios.setDefaultEditor(Object.class, null); // bloquea edición
    } 
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        agregarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaUsuarios);

        agregarButton.setText("Agregar ");

        eliminarButton.setText("Eliminar");

        modificarButton.setText("Modificar");

        jLabel1.setFont(new java.awt.Font("Roboto SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido al adminsitrador de Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eliminarButton)
                        .addGap(106, 106, 106)
                        .addComponent(modificarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(eliminarButton)
                    .addComponent(modificarButton))
                .addGap(30, 30, 30))
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
            java.util.logging.Logger.getLogger(GestionUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuariosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addCrearListener(ActionListener listener) {
        agregarButton.addActionListener(listener);
    }

    @Override
    public void addModificarListener(ActionListener listener) {
        modificarButton.addActionListener(listener);
    }

    @Override
    public void addEliminarListener(ActionListener listener) {
        eliminarButton.addActionListener(listener);
    }
    
    @Override
    public void mostrarUsuarios(List<Usuario> usuarios) {
        this.listaUsuarios = usuarios;  // 🔹 Mantener sincronizada la lista
        DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
        modelo.setRowCount(0); // Limpia la tabla

        for (Usuario u : usuarios) {
            modelo.addRow(new Object[]{
                u.getId(),
                u.getNombre(),
                u.getEmail(),
                u.getRol()
            });
        }
    }
    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public Usuario getUsuarioSeleccionado() {
        int fila = tablaUsuarios.getSelectedRow();
        if (fila >= 0 && listaUsuarios != null && fila < listaUsuarios.size()) {
            return listaUsuarios.get(fila);
        }
        return null;
    }

    @Override
    public String pedirNuevoNombreUsuario(String nombreActual) {
        return JOptionPane.showInputDialog(this, "Nuevo nombre:", nombreActual);
    }

    @Override
    public boolean confirmarEliminacion(String nombreUsuario) {
        int opcion = JOptionPane.showConfirmDialog(this, 
            "¿Eliminar usuario " + nombreUsuario + "?", 
            "Confirmar", 
            JOptionPane.YES_NO_OPTION);
        return opcion == JOptionPane.YES_OPTION;
    }

    @Override
    public JFrame getFrame() {
        return this; // el JFrame en sí mismo
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }
    
    public class NuevoUsuarioDialog extends JDialog {
        private JTextField txtNombre, txtEmail;
        private JPasswordField txtPassword;
        private JComboBox<RolUsuario> comboRol;
        private Usuario usuarioCreado;

        public NuevoUsuarioDialog(JFrame parent) {
            super(parent,"Nuevo Usuario", true);
            setLayout(new GridLayout(5,2,5,5));
            setSize(300,250);
            setLocationRelativeTo(parent);

            add(new JLabel("Nombre:")); txtNombre = new JTextField(); add(txtNombre);
            add(new JLabel("Email:")); txtEmail = new JTextField(); add(txtEmail);
            add(new JLabel("Contraseña:")); txtPassword = new JPasswordField(); add(txtPassword);
            add(new JLabel("Rol:")); comboRol = new JComboBox<>(RolUsuario.values()); add(comboRol);

            JButton btnGuardar = new JButton("Guardar");
            JButton btnCancelar = new JButton("Cancelar");
            add(btnGuardar); add(btnCancelar);

            btnGuardar.addActionListener(e -> {
                String nombre = txtNombre.getText().trim();
                String email = txtEmail.getText().trim();
                String password = new String(txtPassword.getPassword()).trim();
                RolUsuario rol = (RolUsuario) comboRol.getSelectedItem();

                if(nombre.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                    return;
                }

                usuarioCreado = new Usuario(nombre, email, password, rol);
                dispose(); // cierra el diálogo
            });

            btnCancelar.addActionListener(e -> {
                usuarioCreado = null;
                dispose();
            });
        }

        public Usuario getUsuarioCreado() { return usuarioCreado; }
    }

    public class EditarUsuarioDialog extends JDialog {
        private JTextField txtNombre, txtEmail;
        private JComboBox<RolUsuario> comboRol;
        private Usuario usuarioEditado;

        public EditarUsuarioDialog(JFrame parent, Usuario usuario) {
            super(parent, "Editar Usuario", true);
            setSize(300, 200);
            setLocationRelativeTo(parent);
            setLayout(new GridLayout(4, 2, 5, 5));

            usuarioEditado = usuario;

            add(new JLabel("Nombre:")); txtNombre = new JTextField(usuario.getNombre()); add(txtNombre);
            add(new JLabel("Gmail:")); txtEmail = new JTextField(usuario.getEmail()); add(txtEmail);
            add(new JLabel("Rol:")); comboRol = new JComboBox<>(RolUsuario.values()); comboRol.setSelectedItem(usuario.getRol()); add(comboRol);

            JButton btnGuardar = new JButton("Guardar");
            JButton btnCancelar = new JButton("Cancelar");
            add(btnGuardar); add(btnCancelar);

            btnGuardar.addActionListener(e -> {
                usuarioEditado.setNombre(txtNombre.getText());
                usuarioEditado.setEmail(txtEmail.getText());
                usuarioEditado.setRol((RolUsuario)comboRol.getSelectedItem());
                dispose();
            });

            btnCancelar.addActionListener(e -> dispose());
        }

        public Usuario getUsuarioEditado() { return usuarioEditado; }
    }

    public class DetalleUsuarioDialog extends JDialog {
        public DetalleUsuarioDialog(JFrame parent, Usuario usuario) {
            super(parent,"Detalle Usuario", true);
            setLayout(new GridLayout(3,2,5,5));
            setSize(300,150);
            setLocationRelativeTo(parent);

            add(new JLabel("Nombre:")); add(new JLabel(usuario.getNombre()));
            add(new JLabel("Email:")); add(new JLabel(usuario.getEmail()));
            add(new JLabel("Rol:")); add(new JLabel(usuario.getRol().name()));

            JButton btnCerrar = new JButton("Cerrar");
            add(btnCerrar);
            btnCerrar.addActionListener(e -> dispose());
        }
    }

}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionUsuariosViewInterface.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.Usuario;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Manu Hdz
 */
public interface GestionUsuariosViewInterface {
    void addCrearListener(ActionListener listener);
    void addModificarListener(ActionListener listener);
    void addEliminarListener(ActionListener listener);
    
    // Métodos para que el Controlador actualice la Vista
    void mostrarUsuarios(List<Usuario> usuarios);
    void mostrarMensaje(String mensaje);
    
    // Métodos para que el Controlador obtenga datos de la Vista
    Usuario getUsuarioSeleccionado();
    String pedirNuevoNombreUsuario(String nombreActual);
    boolean confirmarEliminacion(String nombreAutor);
    
    // Métodos para controlar la ventana
    JFrame getFrame();
    void setVisible(boolean visible);
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\MenuView.java`

```java
package com.bibliotecadigital.presentation.desktop.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuView extends JFrame {

    private JButton btnGestionarAutores;
    private JButton btnGestionarMateriales;
    private JButton btnGestionarUsuarios;
    private JButton btnGestionarPrestamos;

    public MenuView() {
        setTitle("Biblioteca Digital - Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10)); // 4 filas, 1 columna

        btnGestionarAutores = new JButton("Gestionar Autores");
        btnGestionarMateriales = new JButton("Gestionar Materiales");
        btnGestionarUsuarios = new JButton("Gestionar Usuarios");
        btnGestionarPrestamos = new JButton("Gestionar Préstamos");

        add(btnGestionarAutores);
        add(btnGestionarMateriales);
        add(btnGestionarUsuarios);
        add(btnGestionarPrestamos);
    }
    
    // Métodos para que el controlador añada los listeners
    public void addGestionarAutoresListener(ActionListener listener) {
        btnGestionarAutores.addActionListener(listener);
    }
    public void addGestionarMaterialesListener(ActionListener listener) {
        btnGestionarMateriales.addActionListener(listener);
    }
    public void addGestionarUsuariosListener(ActionListener listener) {
        btnGestionarUsuarios.addActionListener(listener);
    }
    public void addGestionarPrestamosListener(ActionListener listener) {
        btnGestionarPrestamos.addActionListener(listener);
    }
}```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\NuevoPrestamoDialog.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.presentation.desktop.controllers.GestionPrestamosController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class NuevoPrestamoDialog extends javax.swing.JDialog {

    private final GestionPrestamosController controller;
    private DefaultTableModel materialesDisponiblesModel;
    private DefaultTableModel materialesSeleccionadosModel;
    private List<MaterialBiblioteca> materialesSeleccionados = new ArrayList<>();
    
    /**
     * Creates new form NuevoPrestamoDialog
     */
    public NuevoPrestamoDialog(java.awt.Frame parent, GestionPrestamosController controller) {
        super(parent, "Nuevo Préstamo", true);
        this.controller = controller; // <-- Se asigna el controlador
        initComponents(); // NetBeans construye los componentes
        
        // El resto de la configuración se ejecuta DESPUÉS de initComponents y de asignar el controller
        configurarModelos();
        cargarUsuarios(); // Ahora 'this.controller' ya no es null
        configurarEventos();
        
        setSize(800, 600);
        setLocationRelativeTo(parent);
    }
    

    
    /**
    * Inicializa el diálogo con datos y configuraciones
    */
    public void inicializar() {
        try {
            configurarModelos();
            cargarUsuarios();
            configurarEventos();
        } catch (Exception e) {
            System.err.println("Error al inicializar el diálogo: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Error al inicializar el diálogo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Configura los modelos de las tablas
     */
    private void configurarModelos() {
        // Configurar modelo para materiales disponibles
        String[] columnNames = {"ID", "Título", "Autor", "Tipo"};
        materialesDisponiblesModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        materialesDisponiblesTable.setModel(materialesDisponiblesModel);
        
        // Configurar modelo para materiales seleccionados
        materialesSeleccionadosModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        materialesSeleccionadosTable.setModel(materialesSeleccionadosModel);
    }
    
    /**
     * Carga la lista de usuarios en el combobox
     */
    @SuppressWarnings("unchecked") 
    private void cargarUsuarios() {
        // modelo genérico
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        List<Usuario> usuarios = controller.obtenerUsuarios();
        
        for (Usuario usuario : usuarios) {
            model.addElement(usuario);
        }
        
        usuarioComboBox.setModel(model);
    }
    
    /**
     * Configura los eventos de los botones
     */
    private void configurarEventos() {
        buscarButton.addActionListener(evt -> buscarMateriales());
        agregarButton.addActionListener(evt -> agregarMaterial());
        quitarButton.addActionListener(evt -> quitarMaterial());
        crearPrestamoButton.addActionListener(evt -> crearPrestamo());
        cancelarButton.addActionListener(evt -> dispose());
    }
    
    /**
     * Busca materiales según el texto ingresado
     */
    private void buscarMateriales() {
        String termino = busquedaField.getText().trim();
        if (termino.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor ingrese un término de búsqueda", 
                "Búsqueda vacía", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        List<MaterialBiblioteca> resultados = controller.buscarMaterialesPorTitulo(termino);
        
        // Limpiar tabla de disponibles
        materialesDisponiblesModel.setRowCount(0);
        
        // Llenar con resultados, excluyendo los ya seleccionados
        for (MaterialBiblioteca material : resultados) {
            if (!materialesSeleccionados.contains(material) && material.isDisponible()) {
                String autorNombre = !material.getAutores().isEmpty() ? 
                                   material.getAutores().get(0).getNombre() : "Desconocido";
                                   
                materialesDisponiblesModel.addRow(new Object[]{
                    material.getId(),
                    material.getTitulo(),
                    autorNombre,
                    material.getClass().getSimpleName()
                });
            }
        }
    }
    
    /**
     * Agrega un material a la lista de seleccionados
     */
    private void agregarMaterial() {
        int filaSeleccionada = materialesDisponiblesTable.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                "Por favor seleccione un material",
                "Selección vacía",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Obtener datos del material seleccionado
        int id = (Integer) materialesDisponiblesModel.getValueAt(filaSeleccionada, 0);
        String titulo = (String) materialesDisponiblesModel.getValueAt(filaSeleccionada, 1);
        String autor = (String) materialesDisponiblesModel.getValueAt(filaSeleccionada, 2);
        String tipo = (String) materialesDisponiblesModel.getValueAt(filaSeleccionada, 3);
        
        // Buscar el material completo en los resultados de búsqueda
        String termino = busquedaField.getText().trim();
        List<MaterialBiblioteca> resultados = controller.buscarMaterialesPorTitulo(termino);
        
        MaterialBiblioteca materialSeleccionado = null;
        for (MaterialBiblioteca material : resultados) {
            if (material.getId() == id) {
                materialSeleccionado = material;
                break;
            }
        }
        
        if (materialSeleccionado != null) {
            materialesSeleccionados.add(materialSeleccionado);
            materialesSeleccionadosModel.addRow(new Object[]{id, titulo, autor, tipo});
            
            materialesDisponiblesModel.removeRow(filaSeleccionada);
        }
    }
    
    /**
     * Quita un material de la lista de seleccionados
     */
    private void quitarMaterial() {
        int filaSeleccionada = materialesSeleccionadosTable.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                "Por favor seleccione un material",
                "Selección vacía",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Obtener datos del material seleccionado
        int id = (Integer) materialesSeleccionadosModel.getValueAt(filaSeleccionada, 0);
        
        // Buscar en la lista de materiales seleccionados
        MaterialBiblioteca materialAQuitar = null;
        for (MaterialBiblioteca material : materialesSeleccionados) {
            if (material.getId() == id) {
                materialAQuitar = material;
                break;
            }
        }
        
        if (materialAQuitar != null) {
            // Quitar de seleccionados
            materialesSeleccionados.remove(materialAQuitar);
            materialesSeleccionadosModel.removeRow(filaSeleccionada);
            
            // Si está activa la búsqueda actual, volver a agregarlo a disponibles
            String termino = busquedaField.getText().trim();
            if (!termino.isEmpty() && materialAQuitar.getTitulo().toLowerCase().contains(termino.toLowerCase())) {
                String autorNombre = !materialAQuitar.getAutores().isEmpty() ? 
                                   materialAQuitar.getAutores().get(0).getNombre() : "Desconocido";
                
                materialesDisponiblesModel.addRow(new Object[]{
                    materialAQuitar.getId(),
                    materialAQuitar.getTitulo(),
                    autorNombre,
                    materialAQuitar.getClass().getSimpleName()
                });
            }
        }
    }
    
    /**
     * Crea un nuevo préstamo con los datos seleccionados
     */
    private void crearPrestamo() {
        Usuario usuarioSeleccionado = (Usuario) usuarioComboBox.getSelectedItem();
        
        if (usuarioSeleccionado == null) {
            JOptionPane.showMessageDialog(this,
                "Debe seleccionar un usuario",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (materialesSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Debe seleccionar al menos un material",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Crear el préstamo a través del controlador
        controller.crearPrestamo(usuarioSeleccionado, materialesSeleccionados);
        dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        busquedaField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialesDisponiblesTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        agregarButton = new javax.swing.JButton();
        quitarButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        materialesSeleccionadosTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        crearPrestamoButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Préstamo");
        setModal(true);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1);

        usuarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuarioComboBox.setPreferredSize(new java.awt.Dimension(90, 22));
        jPanel2.add(usuarioComboBox);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jLabel2.setText("Buscar material:");
        jPanel3.add(jLabel2);

        busquedaField.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel3.add(busquedaField);

        buscarButton.setText("Buscar");
        jPanel3.add(buscarButton);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Materiales disponibles:");
        jPanel5.add(jLabel3, java.awt.BorderLayout.NORTH);

        materialesDisponiblesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(materialesDisponiblesTable);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        agregarButton.setText(">>");
        jPanel6.add(agregarButton);

        quitarButton.setText("<<");
        jPanel6.add(quitarButton);

        jPanel4.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("Materiales seleccionados:");
        jPanel7.add(jLabel4, java.awt.BorderLayout.NORTH);

        materialesSeleccionadosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(materialesSeleccionadosTable);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        crearPrestamoButton.setText("Crear Préstamo");
        jPanel8.add(crearPrestamoButton);

        cancelarButton.setText("Cancelar");
        jPanel8.add(cancelarButton);

        getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField busquedaField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton crearPrestamoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable materialesDisponiblesTable;
    private javax.swing.JTable materialesSeleccionadosTable;
    private javax.swing.JButton quitarButton;
    private javax.swing.JComboBox<String> usuarioComboBox;
    // End of variables declaration//GEN-END:variables
}
```

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

import com.bibliotecadigital.presentation.desktop.controllers.MenuController;
import com.bibliotecadigital.presentation.desktop.views.MenuView;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BibliotecaDigital {

    public static void main(String[] args) {
        // 1. El EntityManagerFactory se crea UNA SOLA VEZ
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca-pu");

        // 2. Lanzar la aplicación GUI
        java.awt.EventQueue.invokeLater(() -> {
            // 3. Instanciar la Vista del Menú
            MenuView menu = new MenuView();

            // 4. Instanciar el Controlador del Menú, pasándole el EMF
            new MenuController(menu, emf);

            // 5. Hacer visible el Menú
            menu.setVisible(true);
        });
    }
}```

