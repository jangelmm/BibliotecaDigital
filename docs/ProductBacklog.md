# **Product Backlog – BibliotecaDigital (Actualizado)**

# Historias Épicas

## **E1 - Gestión de Biblioteca y Usuarios**
Como administrador y usuario, quiero registrar, listar, buscar y consultar información detallada de materiales, y autenticarme en el sistema para gestionar eficientemente la biblioteca.
Incluye: HU1, HU2, HU5, HU7, HU9

## **E2 - Préstamos Digitales**
Como usuario, quiero pedir prestados y devolver materiales digitalmente para acceder temporalmente a materiales.
Incluye: HU3, HU4

## **E3 - Soporte Académico y Calidad**
Como administrador y desarrollador, quiero generar citas en APA y tener pruebas unitarias para garantizar calidad y utilidad académica.
Incluye: HU6, HU8

# Historias de Usuario:

## **HU1 – Registrar materiales (Actualizada)**
**Historia de Usuario:**
Como administrador, quiero registrar materiales (libros, revistas, videos, audios) con sus datos básicos y ruta de archivo para mantener organizada la biblioteca.

**Criterios de aceptación:**
* Se deben registrar los campos: título, autor(es), año, tipo (libro/revista/video/audio), editorial (para libros y revistas), duración y formato (para videos y audios), y ruta de archivo.
* Validación de datos obligatorios (título, autor, año, tipo, ruta de archivo).
* Cada material debe tener un ID único.
* Se deben poder registrar múltiples autores por material.

**Tareas técnicas:**
* Implementar clase `MaterialBiblioteca` y subclases (`Libro`, `Revista`, `Video`, `Audio`) con atributos incluido `rutaArchivo`.
* Implementar clase `Autor` y relación muchos-a-muchos con `MaterialBiblioteca`.
* Crear método en `Biblioteca` para agregar materiales.
* Guardar materiales en una lista en `Biblioteca` (base de datos simulada).

---

## **HU2 – Búsqueda de materiales (Actualizada)**
**Historia de Usuario:**
Como usuario, quiero buscar materiales por título o autor para encontrar fácilmente lo que necesito.

**Criterios de aceptación:**
* La búsqueda devuelve coincidencias parciales y exactas en título y autor.
* Si no existen resultados, muestra mensaje claro.
* Permite búsqueda por campo `título` o `autor` (búsqueda separada).

**Tareas técnicas:**
* Implementar métodos `buscarPorTitulo(String)` y `buscarPorAutor(String)` en `Biblioteca`.
* Indexar lista de materiales para búsquedas rápidas (usar listas y loops).
* Interfaz de búsqueda en consola o GUI básica.
* Pruebas con materiales existentes y no existentes.

---

## **HU3 – Préstamo de materiales (Actualizada)**
**Historia de Usuario:**
Como usuario, quiero pedir prestado un material digitalmente para usarlo temporalmente.

**Criterios de aceptación:**
* Todos los materiales (libros, revistas, videos, audios) pueden prestarse.
* Si el material ya está prestado, no debe estar disponible.
* Registrar el préstamo asociado al usuario y material, con fechas de préstamo y devolución.
* El material se marca como no disponible.

**Tareas técnicas:**
* Implementar clase `Prestamo` con atributos: id, fechas, estado, material, usuario.
* Implementar métodos en `Biblioteca`: `realizarPrestamo(Usuario, MaterialBiblioteca)` que crea un préstamo y actualiza la disponibilidad del material.
* Actualizar la clase `Usuario` para tener una lista de préstamos activos.
* Pruebas de disponibilidad antes de préstamo.

---

## **HU4 – Devolución de materiales (Actualizada)**
**Historia de Usuario:**
Como usuario, quiero devolver un material prestado para que esté disponible nuevamente en la biblioteca.

**Criterios de aceptación:**
* El sistema debe marcar el material como disponible.
* El préstamo queda registrado como cerrado (con fecha de devolución).
* Mensaje de confirmación de devolución exitosa.

**Tareas técnicas:**
* Implementar método en `Biblioteca`: `registrarDevolucion(Prestamo)` que actualiza el préstamo y la disponibilidad del material.
* Actualizar la lista de préstamos activos del usuario.
* Pruebas con casos de devolución correcta y errores.

---

## **HU5 – Listar materiales (Actualizada)**
**Historia de Usuario:**
Como administrador, quiero listar todos los materiales de la biblioteca para tener una vista general.

**Criterios de aceptación:**
* Muestra todos los materiales con título, autor(es), año, tipo, estado (disponible o prestado) y ruta de archivo.
* Soporta filtros por tipo de material.

**Tareas técnicas:**
* Implementar método `listarMateriales()` en `Biblioteca` que devuelve una lista de materiales con su información.
* Diseño de formato de salida en consola o interfaz.
* Pruebas con colecciones vacías y con elementos.

---

## **HU6 – Generar citas APA (Actualizada)**
**Historia de Usuario:**
Como administrador, quiero generar citas en formato APA de los materiales cargados para usarlos en trabajos académicos.

**Criterios de aceptación:**
* El sistema genera citas con formato APA específico para cada tipo de material:
  * Libros: Apellido, A. (Año). *Título*. Editorial.
  * Revistas: Apellido, A. (Año). Título del artículo. *Revista*, Número.
  * Videos: Apellido, A. (Año). Título [Video].
  * Audios: Apellido, A. (Año). Título [Audio].
* Permite copiar la cita generada.

**Tareas técnicas:**
* Implementar método `generarCitaAPA()` en cada subclase de `MaterialBiblioteca` (Libro, Revista, Video, Audio).
* Pruebas con diferentes tipos de materiales.

---

## **HU7 – Información detallada de materiales (Actualizada)**
**Historia de Usuario:**
Como usuario, quiero ver información detallada de cada material para conocer todos sus datos antes de usarlo.

**Criterios de aceptación:**
* Muestra todos los atributos registrados (autor(es), título, año, tipo, editorial, duración, formato, ruta de archivo, estado).
* Disponible desde la lista de materiales o la búsqueda.

**Tareas técnicas:**
* Implementar método `mostrarInformacion()` en `MaterialBiblioteca` y subclases, que devuelve una cadena con toda la información.
* Conectar función con interfaz de búsqueda y listado.
* Pruebas con diferentes tipos de materiales.

---

## **HU8 – Pruebas unitarias (Actualizada)**
**Historia de Usuario:**
Como desarrollador, quiero tener pruebas unitarias de las operaciones básicas de la biblioteca para garantizar estabilidad del sistema.

**Criterios de aceptación:**
* Pruebas unitarias para registro, búsqueda, préstamo, devolución, generación de citas y autenticación.
* Integración con framework de testing en Java (JUnit).
* CI/CD configurado en GitHub Actions.

**Tareas técnicas:**
* Configurar JUnit en el proyecto.
* Crear dataset de prueba.
* Escribir pruebas para todas las clases y métodos críticos.
* Automatizar ejecución de pruebas con GitHub Actions.

---

## **HU9 – Autenticación de usuarios (Nueva)**
**Historia de Usuario:**
Como usuario, quiero autenticarme en el sistema con email y contraseña para acceder a funcionalidades restringidas.

**Criterios de aceptación:**
* El sistema permite registrar nuevos usuarios con nombre, email y contraseña.
* El sistema permite iniciar sesión con email y contraseña.
* Las contraseñas se almacenan de forma segura (hash).
* Sesión activa durante la interacción.

**Tareas técnicas:**
* Ampliar clase `Usuario` con email y contraseña (hash).
* Implementar métodos de registro y login en `Biblioteca` o en una clase `AuthenticationService`.
* Almacenar usuarios en una lista en `Biblioteca`.
* Utilizar algoritmo de hash (ej: BCrypt) para contraseñas.

---

# **Tabla Resumen Backlog Actualizada**

```
Título,Descripción,Etiqueta,Prioridad
HU1 – Registrar materiales,"Como administrador, quiero registrar materiales (libros, revistas, videos, audios) con sus datos básicos y ruta de archivo.",Sprint 1,Alta
HU2 – Búsqueda de materiales,"Como usuario, quiero buscar materiales por título o autor.",Sprint 1,Alta
HU9 – Autenticación de usuarios,"Como usuario, quiero autenticarme en el sistema con email y contraseña.",Sprint 1,Alta
HU5 – Listar materiales,"Como administrador, quiero listar todos los materiales de la biblioteca con su estado.",Sprint 1,Media
HU3 – Préstamo de materiales,"Como usuario, quiero pedir prestado un material digitalmente.",Sprint 2,Alta
HU4 – Devolución de materiales,"Como usuario, quiero devolver un material prestado.",Sprint 2,Alta
HU7 – Información detallada,"Como usuario, quiero ver información detallada de cada material.",Sprint 2,Media
HU6 – Generar citas APA,"Como administrador, quiero generar citas en formato APA de los materiales cargados.",Sprint 3,Alta
HU8 – Pruebas unitarias,"Como desarrollador, quiero tener pruebas unitarias de las operaciones básicas de la biblioteca.",Sprint 3,Alta
```