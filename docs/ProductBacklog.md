# **Product Backlog – BibliotecaDigital**

# Historias Épicas

## **E1 - Gestión de Biblioteca**

Como administrador y usuario, quiero registrar, listar, buscar y consultar información detallada de materiales para gestionar eficientemente la biblioteca.
Incluye: HU1, HU2, HU5, HU7

## **E2 - Préstamos Digitales**

Como usuario, quiero pedir prestados y devolver libros/revistas digitalmente para acceder temporalmente a materiales.
Incluye: HU3, HU4

## **E3 - Soporte Académico y Calidad**

Como administrador y desarrollador, quiero generar citas en APA y tener pruebas unitarias para garantizar calidad y utilidad académica.
Incluye: HU6, HU8


# Historias de Usuario:

## **HU1 – Registrar materiales**

**Historia de Usuario:**
Como administrador, quiero registrar materiales (libros, revistas, videos) con sus datos básicos para mantener organizada la biblioteca.

**Criterios de aceptación:**

* Se deben registrar los campos: título, autor, año, tipo (libro/revista/video).
* Validación de datos obligatorios (ej. título y autor).
* Cada material debe tener un ID único.

**Tareas técnicas:**

* Implementar clase `MaterialBiblioteca` y subclases (`Libro`, `Revista`, `Video`).
* Implementar clase `Autor` y relación con materiales.
* Crear formulario/interfaz de registro.
* Guardar materiales en lista o base de datos simulada.

---

## **HU2 – Búsqueda de materiales**

**Historia de Usuario:**
Como usuario, quiero buscar materiales por título o autor para encontrar fácilmente lo que necesito.

**Criterios de aceptación:**

* La búsqueda devuelve coincidencias parciales y exactas.
* Si no existen resultados, muestra mensaje claro.
* Permite búsqueda por campo `título` o `autor`.

**Tareas técnicas:**

* Implementar método `buscarMaterial(titulo/autor)`.
* Indexar lista de materiales para búsquedas rápidas.
* Interfaz de búsqueda en consola o GUI básica.
* Pruebas con materiales existentes y no existentes.

---

## **HU3 – Préstamo de materiales**

**Historia de Usuario:**
Como usuario, quiero pedir prestado un libro o revista digitalmente para usarlo temporalmente.

**Criterios de aceptación:**

* Solo materiales tipo libro o revista pueden prestarse.
* Si el material ya está prestado, no debe estar disponible.
* Registrar usuario asociado al préstamo.

**Tareas técnicas:**

* Implementar interfaz `Prestamo`.
* Métodos `prestar()` en `Libro` y `Revista`.
* Asociar préstamo al usuario en clase `Usuario`.
* Pruebas de disponibilidad antes de préstamo.

---

## **HU4 – Devolución de materiales**

**Historia de Usuario:**
Como usuario, quiero devolver un material prestado para que esté disponible nuevamente en la biblioteca.

**Criterios de aceptación:**

* El sistema debe marcar el material como disponible.
* El préstamo queda registrado como cerrado.
* Mensaje de confirmación de devolución exitosa.

**Tareas técnicas:**

* Implementar método `devolver()` en `Libro` y `Revista`.
* Actualizar relación usuario ↔ préstamo.
* Pruebas con casos de devolución correcta y errores.

---

## **HU5 – Listar materiales**

**Historia de Usuario:**
Como administrador, quiero listar todos los materiales de la biblioteca para tener una vista general.

**Criterios de aceptación:**

* Muestra todos los materiales con título, autor, año y estado (disponible o prestado).
* Soporta filtros por tipo de material.

**Tareas técnicas:**

* Implementar método `listarMateriales()`.
* Diseño de formato de salida en consola o interfaz.
* Pruebas con colecciones vacías y con elementos.

---

## **HU6 – Generar citas APA**

**Historia de Usuario:**
Como administrador, quiero generar citas en formato APA de los materiales cargados para usarlos en trabajos académicos.

**Criterios de aceptación:**

* El sistema genera citas con formato APA básico:

  * Libros: *Apellido, Inicial. (Año). Título. Editorial.*
  * Revistas: *Apellido, Inicial. (Año). Título del artículo. Revista, número.*
  * Videos: *Apellido, Inicial. (Año). Título \[Video].*
* Permite copiar la cita generada.

**Tareas técnicas:**

* Implementar clase `CitaAPA`.
* Métodos de generación según tipo de material.
* Pruebas con diferentes tipos de materiales.

---

## **HU7 – Información detallada de materiales**

**Historia de Usuario:**
Como usuario, quiero ver información detallada de cada material para conocer todos sus datos antes de usarlo.

**Criterios de aceptación:**

* Muestra todos los atributos registrados (autor, título, año, tipo, estado).
* Disponible desde la lista de materiales o la búsqueda.

**Tareas técnicas:**

* Implementar método `mostrarInformacion()`.
* Conectar función con interfaz de búsqueda y listado.
* Pruebas con diferentes tipos de materiales.

---

## **HU8 – Pruebas unitarias**

**Historia de Usuario:**
Como desarrollador, quiero tener pruebas unitarias de las operaciones básicas de la biblioteca para garantizar estabilidad del sistema.

**Criterios de aceptación:**

* Pruebas unitarias para registro, búsqueda, préstamo y devolución.
* Integración con framework de testing en Java (JUnit).
* CI/CD configurado en GitHub Actions.

**Tareas técnicas:**

* Configurar JUnit en el proyecto.
* Crear dataset de prueba.
* Automatizar ejecución de pruebas.

---

# **Tabla Resumen Backlog**

```
Título,Descripción,Etiqueta,Prioridad
HU1 – Registrar materiales,"Como administrador, quiero registrar materiales (libros, revistas, videos) con sus datos básicos.",Sprint 1,Alta
HU2 – Búsqueda de materiales,"Como usuario, quiero buscar materiales por título o autor.",Sprint 1,Alta
HU3 – Préstamo de materiales,"Como usuario, quiero pedir prestado un libro o revista digitalmente.",Sprint 2,Alta
HU4 – Devolución de materiales,"Como usuario, quiero devolver un material prestado.",Sprint 2,Alta
HU5 – Listar materiales,"Como administrador, quiero listar todos los materiales de la biblioteca.",Sprint 1,Media
HU6 – Generar citas APA,"Como administrador, quiero generar citas en formato APA de los materiales cargados.",Sprint 3,Alta
HU7 – Información detallada,"Como usuario, quiero ver información detallada de cada material.",Sprint 2,Media
HU8 – Pruebas unitarias,"Como desarrollador, quiero tener pruebas unitarias de las operaciones básicas de la biblioteca.",Sprint 3,Alta
```

---
