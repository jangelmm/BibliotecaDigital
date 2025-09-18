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
│   │       │       │   │       └── BibliotecaService.java
│   │       │       │   ├── infrastructure
│   │       │       │   │   └── persistence
│   │       │       │   │       ├── InMemoryBibliotecaRepository.java
│   │       │       │   │       └── JpaBibliotecaRepository.java
│   │       │       │   └── presentation
│   │       │       │       └── desktop
│   │       │       │           ├── controllers
│   │       │       │           │   ├── GestionAutoresController.java
│   │       │       │           │   ├── GestionMaterialesController.java
│   │       │       │           │   ├── GestionPrestamosController.java
│   │       │       │           │   ├── GestionUsuariosController.java
│   │       │       │           │   └── MaterialController.java
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
│   │   │       │           │   ├── GestionMaterialesController.class
│   │   │       │           │   ├── GestionPrestamosController.class
│   │   │       │           │   ├── GestionUsuariosController.class
│   │   │       │           │   └── MaterialController.class
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

## `script.py`

```python
import os
import argparse

# Directorios a ignorar (incluye caches de Python)
IGNORE_DIRS = {'.web', 'venv', '__pycache__', 'test'}

# Extensiones de archivo permitidas
ALLOWED_EXTS = {'.py', '.java', '.cpp', '.c'}

# Archivos específicos a incluir siempre (aunque empiecen con '.'
# o tengan extensión fuera de ALLOWED_EXTS)
INCLUDED_FILES = {'requirements.txt', 'rxconfig.py', '.gitignore'}

# Prefijos para el tree
TREE_PREFIXES = {
    'branch': '├── ',
    'last':   '└── ',
    'indent': '    ',
    'pipe':   '│   '
}


def build_tree(root_path):
    """
    Genera una lista de líneas representando la estructura de directorios,
    ignorando IGNORE_DIRS, pero incluyendo archivos en INCLUDED_FILES.
    """
    tree_lines = []

    def _tree(dir_path, prefix=''):
        entries = sorted(os.listdir(dir_path))
        # Filtrar: ignora los directorios deseados; oculta dot-files salvo INCLUDED_FILES
        entries = [
            e for e in entries
            if e not in IGNORE_DIRS
               and (not e.startswith('.') or e in INCLUDED_FILES)
        ]

        dirs = [e for e in entries if os.path.isdir(os.path.join(dir_path, e))]
        files = [e for e in entries if os.path.isfile(os.path.join(dir_path, e))]
        total = len(dirs) + len(files)

        for idx, name in enumerate(dirs + files):
            path = os.path.join(dir_path, name)
            connector = TREE_PREFIXES['last'] if idx == total - 1 else TREE_PREFIXES['branch']
            tree_lines.append(f"{prefix}{connector}{name}")
            if os.path.isdir(path):
                extension = TREE_PREFIXES['indent'] if idx == total - 1 else TREE_PREFIXES['pipe']
                _tree(path, prefix + extension)

    tree_lines.append(os.path.basename(root_path) or root_path)
    _tree(root_path)
    return tree_lines


def collect_files(root_path):
    """
    Recorre el árbol e incluye:
    - Archivos con extensiones en ALLOWED_EXTS
    - Archivos listados en INCLUDED_FILES (en cualquier carpeta)
    """
    paths = []
    for dirpath, dirnames, filenames in os.walk(root_path):
        # Excluir carpetas no deseadas
        dirnames[:] = [d for d in dirnames if d not in IGNORE_DIRS]

        for fname in sorted(filenames):
            rel = os.path.relpath(os.path.join(dirpath, fname), root_path)
            ext = os.path.splitext(fname)[1]
            if ext in ALLOWED_EXTS or fname in INCLUDED_FILES:
                paths.append(os.path.join(dirpath, fname))

    return paths


def ext_to_lang(ext):
    """Mapea extensión de archivo a lenguaje para Markdown."""
    return {
        '.py': 'python',
        '.java': 'java',
        '.cpp': 'cpp',
        '.c': 'c',
        '.txt': 'text',
        '': 'text'   # Para archivos como .gitignore
    }.get(ext, 'text')


def main():
    parser = argparse.ArgumentParser(
        description="Genera un Markdown con la estructura tipo tree y el código fuente.")
    parser.add_argument(
        'output', nargs='?', default='project_overview.md',
        help='Nombre del archivo Markdown de salida. (default: project_overview.md)')
    args = parser.parse_args()

    root = os.getcwd()
    tree_lines = build_tree(root)
    code_files = collect_files(root)

    with open(args.output, 'w', encoding='utf-8') as md:
        # Título
        md.write("# Estructura del proyecto\n\n")

        # Árbol de directorios
        md.write("```\n")
        md.write("\n".join(tree_lines))
        md.write("\n```\n\n")

        # Contenido de cada archivo
        for path in code_files:
            rel_path = os.path.relpath(path, root)
            ext = os.path.splitext(path)[1]
            lang = ext_to_lang(ext)
            md.write(f"## `{rel_path}`\n\n")
            md.write(f"```{lang}\n")
            try:
                with open(path, 'r', encoding='utf-8') as f:
                    md.write(f.read())
            except Exception as e:
                md.write(f"# Error al leer el archivo: {e}\n")
            md.write("```\n\n")

    print(f"Archivo Markdown generado: {args.output}")


if __name__ == '__main__':
    main()
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
    MaterialBiblioteca actualizarMaterial(MaterialBiblioteca material);
    void registrarMaterialConAutores(MaterialBiblioteca material, List<Integer> autorIds);
    void eliminarMaterial(int id);
    
    // Métodos para autores
    Autor registrarAutor(Autor autor);
    Autor buscarAutorPorId(int id);
    List<Autor> listarAutores();
    Autor actualizarAutor(Autor autor);
    void eliminarAutor(int id);
    
    // Métodos para usuarios
    boolean registrarUsuario(Usuario usuario);
    Usuario buscarUsuarioPorEmail(String email);
    List<Usuario> listarUsuarios();
    boolean actualizarRolUsuario(String email, RolUsuario nuevoRol);
    void eliminarUsuario(Usuario usuario);
    
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
    public boolean registrarUsuario(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail())) {
                return false; // ya existe
            }
        }
        Usuario nuevo = usuario;
        usuarios.add(nuevo);
        return true;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios);
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
    
    @Override
    public MaterialBiblioteca actualizarMaterial(MaterialBiblioteca material) {
        return null;
    }

    @Override
    public void eliminarMaterial(int id) {
        
    }
    
    public void registrarMaterialConAutores(MaterialBiblioteca material, List<Integer> autorIds) {
        
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
import java.util.ArrayList;
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
    
    public void registrarMaterialConAutores(MaterialBiblioteca material, List<Integer> autorIds) {
        executeInsideTransaction(em -> {
            // Lista para guardar autores gestionados por Hibernate
            List<Autor> autoresGestionados = new ArrayList<>();

            for (Integer idAutor : autorIds) {
                Autor autor = em.find(Autor.class, idAutor); // Traemos el autor existente
                if (autor != null) {
                    autoresGestionados.add(autor);
                }
            }

            // Asociamos los autores al material
            material.setAutores(autoresGestionados);

            // Persistimos solo el material, Hibernate manejará la relación
            em.persist(material);
        });
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
       
    // Metodos nuevos para el CRUD de Materiales -------------------------------
    @Override
    public MaterialBiblioteca actualizarMaterial(MaterialBiblioteca material) {
        final MaterialBiblioteca[] materialAct = new MaterialBiblioteca[1];
        executeInsideTransaction(em -> {
            materialAct[0] = em.merge(material);
        });
        return materialAct[0];
    }
    
    @Override
    public void eliminarMaterial(int id) {
        executeInsideTransaction(em -> {
            MaterialBiblioteca material = em.find(MaterialBiblioteca.class, id);
            if (material != null) {
                em.remove(material);
            }
        });
    }
    // -------------------------------------------------------------------------
    
    @Override
    public boolean registrarUsuario(Usuario usuario) {
        if (buscarUsuarioPorEmail(usuario.getEmail()) != null) {
            return false; // email duplicado
        }

        try {
            executeInsideTransaction(em -> em.persist(usuario)); // 🔹 persiste el usuario
            return true;
        } catch(Exception e) {
            e.printStackTrace(); // 🔹 opcional: para ver error en consola
            return false;
        }
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
    public void eliminarUsuario(Usuario u) {
        executeInsideTransaction(em -> {
            // Primero buscamos la entidad en el EntityManager
            Usuario usuarioEnBD = em.find(Usuario.class, u.getId());
            if (usuarioEnBD != null) {
                em.remove(usuarioEnBD);
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
    public List<Usuario> listarUsuarios() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
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
    
    public boolean actualizarUsuario(Usuario usuario) {
    EntityManager em = emf.createEntityManager();
    try {
        // Verificamos si ya existe un email igual en otro usuario
        TypedQuery<Usuario> query = em.createQuery(
            "SELECT u FROM Usuario u WHERE u.email = :email AND u.id <> :id", Usuario.class);
        query.setParameter("email", usuario.getEmail());
        query.setParameter("id", usuario.getId());

        if (!query.getResultList().isEmpty()) {
            return false; // correo duplicado
        }

        executeInsideTransaction(em2 -> em2.merge(usuario)); // actualiza el usuario
        return true;
    } finally {
        em.close();
    }
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

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\controllers\GestionMaterialesController.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.Video;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.presentation.desktop.views.GestionMaterialesViewInterface;
import java.util.List;

/**
 *
 * @author Diego Garcia
 */
public class GestionMaterialesController {
    
    private final BibliotecaService servicio;
    private final GestionMaterialesViewInterface vista;

    public GestionMaterialesController(BibliotecaService servicio, GestionMaterialesViewInterface vista) {
        this.servicio = servicio;
        this.vista = vista;
        
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addNuevoListener(e -> crearNuevoMaterial());
        this.vista.addEditarListener(e -> editarMaterialSeleccionado());
        this.vista.addEliminarListener(e -> eliminarMaterialSeleccionado());
        
        // Cargar los datos iniciales
        cargarMateriales();
    }

    public void cargarMateriales() {
        vista.mostrarMateriales(servicio.listarMateriales());
    }

    public void crearNuevoMaterial() {
        // Pasamos valores "vacíos" o neutros porque es creación
        String tipo = vista.pedirTipoMaterial("").trim().toLowerCase(); // libro/revista/video/audio
        String titulo = vista.pedirNuevoTituloMaterial("");
        int anio = vista.pedirAnioMaterial(0);
        String rutaArchivo = vista.pedirRutaArchivo("");
        boolean disponible = true; // disponible por default
        List<Integer> autorIds = vista.pedirIdsAutores( ); // por ejemplo: [1, 2, 5]

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
            material.setDisponible(disponible); // establecemos estado
            servicio.registrarMaterialConAutores(material, autorIds);
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
        servicio.actualizarMaterial(materialSeleccionado);
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
                servicio.eliminarMaterial(materialSeleccionado.getId());
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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.controllers;

import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.RolUsuario;
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.presentation.desktop.views.GestionPrestamosViewInterface;

import java.util.List;
import java.util.ArrayList;

/**
 * Controlador para la gestión de préstamos.
 * Conecta la vista con los servicios de la aplicación.
 */
public class GestionPrestamosController {
    
    public final BibliotecaService servicio;
    private final GestionPrestamosViewInterface vista;
    
    /**
     * Constructor del controlador
     * @param servicio Servicio de biblioteca para operaciones CRUD
     * @param vista Vista para la interacción con el usuario
     */
    public GestionPrestamosController(BibliotecaService servicio, GestionPrestamosViewInterface vista) {
        this.servicio = servicio;
        this.vista = vista;
        
        // Registrar los listeners en la vista
        this.vista.addNuevoPrestamoListener(e -> abrirDialogoNuevoPrestamo());
        this.vista.addFinalizarPrestamoListener(e -> finalizarPrestamoSeleccionado());
        this.vista.addRefrescarListener(e -> cargarPrestamos());
        
        // Cargar los préstamos iniciales
        cargarPrestamos();
    }
    
    /**
     * Carga todos los préstamos y los muestra en la vista
     */
    public void cargarPrestamos() {
        vista.mostrarPrestamos(servicio.listarPrestamos());
    }
    
    /**
     * Abre el diálogo para crear un nuevo préstamo
     */
    private void abrirDialogoNuevoPrestamo() {
        vista.abrirDialogoNuevoPrestamo();
    }
    
    /**
     * Crea un nuevo préstamo con los datos proporcionados
     * @param usuario Usuario que realiza el préstamo
     * @param materiales Lista de materiales a prestar
     */
    public void crearPrestamo(Usuario usuario, List<MaterialBiblioteca> materiales) {
        if (usuario == null) {
            vista.mostrarError("Debe seleccionar un usuario");
            return;
        }
        
        if (materiales == null || materiales.isEmpty()) {
            vista.mostrarError("Debe seleccionar al menos un material");
            return;
        }
        
        // La validación de disponibilidad se realiza en el servicio,
        // pero verificamos previamente para dar un mensaje más específico
        for (MaterialBiblioteca material : materiales) {
            if (!material.isDisponible()) {
                vista.mostrarError("El material '" + material.getTitulo() + "' no está disponible");
                return;
            }
        }
        
        // Crear el préstamo utilizando el servicio
        Prestamo nuevoPrestamo = servicio.crearPrestamo(usuario, materiales);
        
        if (nuevoPrestamo != null) {
            vista.mostrarMensaje("Préstamo creado correctamente");
            cargarPrestamos(); // Refrescar la tabla
        } else {
            vista.mostrarError("No se pudo crear el préstamo");
        }
    }
    
    /**
     * Finaliza el préstamo seleccionado
     */
    private void finalizarPrestamoSeleccionado() {
        Prestamo prestamo = vista.getPrestamoSeleccionado();
        
        if (prestamo == null) {
            vista.mostrarError("Por favor, seleccione un préstamo para finalizar.");
            return;
        }
        
        if (prestamo.getFechaDevolucion() != null) {
            vista.mostrarError("El préstamo seleccionado ya está finalizado");
            return;
        }
        
        if (vista.confirmarFinalizacionPrestamo(prestamo)) {
            boolean todosDevueltos = true;
            
            for (MaterialBiblioteca material : prestamo.getMateriales()) {
                boolean devuelto = servicio.registrarDevolucion(prestamo, material);
                if (!devuelto) {
                    todosDevueltos = false;
                    vista.mostrarError("Error al registrar la devolución del material: " + material.getTitulo());
                    break;
                }
            }
            
            if (todosDevueltos) {
                vista.mostrarMensaje("Préstamo finalizado correctamente");
                cargarPrestamos(); // Refrescar la tabla
            }
        }
    }
    
    /**
     * Obtiene usuarios para mostrar en la interfaz, filtrados por rol.
     * Nota: Este método es provisional hasta tener un método adecuado en el servicio.
     * @return Lista de usuarios disponibles
     */
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> todosLosUsuarios = new ArrayList<>();
        List<Usuario> usuariosFiltrados = new ArrayList<>();

        // 1. Crear usuarios de prueba si no existen (para garantizar que haya datos)
        // Esto solo se ejecuta la primera vez que se llame al método
        if (servicio.buscarUsuarioPorEmail("admin@biblioteca.com") == null) {
            servicio.registrarUsuario(new Usuario ("Administrador", "admin@biblioteca.com", "admin123", RolUsuario.ADMINISTRADOR));
        }

        if (servicio.buscarUsuarioPorEmail("cliente@biblioteca.com") == null) {
            servicio.registrarUsuario(new Usuario ("Cliente", "cliente@biblioteca.com", "cliente123", RolUsuario.CLIENTE));
        }

        if (servicio.buscarUsuarioPorEmail("encargado@biblioteca.com") == null) {
            servicio.registrarUsuario(new Usuario ("Encargado", "encargado@biblioteca.com", "encargado123", RolUsuario.ENCARGADO));
        }

        // 2. Buscar usuarios conocidos por correo y añadirlos a la lista
        Usuario admin = servicio.buscarUsuarioPorEmail("admin@biblioteca.com");
        if (admin != null) todosLosUsuarios.add(admin);

        Usuario cliente = servicio.buscarUsuarioPorEmail("cliente@biblioteca.com");
        if (cliente != null) todosLosUsuarios.add(cliente);

        Usuario encargado = servicio.buscarUsuarioPorEmail("encargado@biblioteca.com");
        if (encargado != null) todosLosUsuarios.add(encargado);

        // 3. Filtrar usuarios según su rol
        for (Usuario u : todosLosUsuarios) {
            // Solo mostrar clientes y administradores para préstamos
            if (u.getRol() == RolUsuario.CLIENTE || u.getRol() == RolUsuario.ADMINISTRADOR) {
                usuariosFiltrados.add(u);
            }
        }

        // 4. Imprimir información
        System.out.println("Usuarios filtrados encontrados: " + usuariosFiltrados.size());
        for (Usuario u : usuariosFiltrados) {
            System.out.println("  - " + u.getNombre() + " (" + u.getRol() + ")");
        }

        return usuariosFiltrados;
    }
    
    public Prestamo buscarPrestamoPorId(int id) {
        List<Prestamo> prestamos = servicio.listarPrestamos();
        for (Prestamo p : prestamos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    /**
     * Busca materiales por título
     * @param titulo Título o parte del título a buscar
     * @return Lista de materiales que coinciden con la búsqueda
     */
    public List<MaterialBiblioteca> buscarMaterialesPorTitulo(String titulo) {
        return servicio.buscarMaterialesPorTitulo(titulo);
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
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosView;
import com.bibliotecadigital.presentation.desktop.views.GestionUsuariosViewInterface;
import java.util.List;

/**
 *
 * @author Manu Hdz
 */
public class GestionUsuariosController {
    private final BibliotecaService servicio;
    private final JpaBibliotecaRepository baseDatos;
    private final GestionUsuariosViewInterface vista;

    public GestionUsuariosController(BibliotecaService servicio, GestionUsuariosViewInterface vista, JpaBibliotecaRepository baseDatos) {
        this.servicio = servicio;
        this.vista = vista;
        this.baseDatos = baseDatos;
        // Conectar los listeners de la vista con los métodos de este controlador
        this.vista.addCrearListener(e -> crearUsuario());
        this.vista.addModificarListener(e -> modificarUsuario());
        this.vista.addEliminarListener(e -> eliminarUsuario());
        
        // Cargar los datos iniciales
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        List<Usuario> usuarios = baseDatos.listarUsuarios();  // 🔹 Obtiene desde la BD
        vista.mostrarUsuarios(usuarios);                     // 🔹 Muestra en la tabla
    }
    
    private void eliminarUsuario() {
        Usuario seleccionado = vista.getUsuarioSeleccionado();

    if (seleccionado != null && vista.confirmarEliminacion(seleccionado.getNombre())) {
        // Llamamos al servicio para eliminar de la BD
        baseDatos.eliminarUsuario(seleccionado);

        // Refrescamos la tabla
        cargarUsuarios();

        vista.mostrarMensaje("Usuario eliminado correctamente.");
    } else {
        vista.mostrarMensaje("Seleccione un usuario para eliminar.");
    }
    }
    
    private void crearUsuario() {
        GestionUsuariosView.NuevoUsuarioDialog dialog = ((GestionUsuariosView) vista).new NuevoUsuarioDialog(vista.getFrame());
        
        dialog.setVisible(true); // bloquea hasta cerrar

        Usuario nuevo = dialog.getUsuarioCreado();
        if(nuevo != null) {
            boolean agregado = false;
            try {
                agregado = baseDatos.registrarUsuario(nuevo);
            } catch(Exception ex) {
                vista.mostrarMensaje("Error al agregar usuario: " + ex.getMessage());
            }

            if(agregado) {
                vista.mostrarMensaje("Usuario agregado correctamente");
                cargarUsuarios(); // refresca tabla desde BD
            } else {
                vista.mostrarMensaje("No se pudo agregar usuario. ¿Email duplicado?");
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
                baseDatos.actualizarUsuario(editado);

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
import javax.swing.JOptionPane;
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
}
```

## `BibliotecaDigital\src\main\java\com\bibliotecadigital\presentation\desktop\views\GestionMaterialesViewInterface.java`

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;
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
        NuevoPrestamoDialog dialog = new NuevoPrestamoDialog(this, controller);
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
        this.controller = controller;
        initComponents();
        
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

// --- IMPORTS NECESARIOS ---
import com.bibliotecadigital.domain.service.BibliotecaService;
import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import com.bibliotecadigital.presentation.desktop.controllers.GestionAutoresController;
import com.bibliotecadigital.presentation.desktop.controllers.GestionMaterialesController;
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresView; // <-- Asegúrate de importar la clase concreta
import com.bibliotecadigital.presentation.desktop.views.GestionAutoresViewInterface;
import com.bibliotecadigital.presentation.desktop.views.GestionMaterialesView;
import com.bibliotecadigital.presentation.desktop.views.GestionMaterialesViewInterface;

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
            GestionMaterialesViewInterface vistaMateriales= new GestionMaterialesView();
            
            // 3. Instanciar el Controlador, inyectando Modelo y Vista
            new GestionAutoresController(servicio, vistaAutores);
            new GestionMaterialesController(servicio, vistaMateriales);
            
            // 4. Hacer visible la GUI
            // El método setVisible debe ser parte de tu interfaz
            vistaAutores.setVisible(true);
            vistaMateriales.setVisible(true); 
        });
    }
}```

