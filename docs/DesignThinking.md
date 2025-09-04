# **Design Thinking aplicado a BibliotecaDigital**

## **1. Descubrimiento / Empatía / Investigación (Divergencia)**

* **Contexto detectado**: La mayoría de herramientas de gestión de bibliotecas están orientadas a entornos físicos, lo que genera limitaciones cuando se busca un enfoque totalmente digital:

  * Dificultad para organizar y gestionar archivos en múltiples formatos.
  * Soluciones disponibles centradas en préstamos físicos y catálogos impresos.
  * Escasez de software minimalista para bibliotecas digitales comunitarias o educativas.

* **Necesidades de los usuarios**:

  * Lectores que buscan una interfaz sencilla de búsqueda y acceso al contenido.
  * Administradores que necesitan organizar y clasificar materiales digitales de manera eficiente.
  * Comunidad open source interesada en disponer de una plataforma extensible para documentación, manuales y archivos multimedia.

* **Hallazgos clave**:

  * Carencia de herramientas que integren organización de materiales y exportación de referencias.
  * Creciente demanda de soluciones simples que gestionen textos, videos y audios en un solo entorno.
  * Interés en bibliotecas digitales como espacios de acceso libre y colaborativo.

---

## **2. Definición / Síntesis (Divergencia)**

* **Problema a resolver**:
  *"Actualmente no existe una herramienta de gestión de bibliotecas digitales que sea open source, simple, capaz de manejar distintos formatos de archivo (.pdf, .mp4, .mp3), con almacenamiento estructurado y que genere automáticamente citas bibliográficas de su propio contenido."*

* **Oportunidad de mercado**:

  * Desarrollar una solución ligera y extensible que sirva de base para proyectos de bibliotecas digitales.
  * Priorizar la experiencia de usuario con búsquedas rápidas, intuitivas y categorización clara.
  * Incorporar, de manera modular, un sistema de exportación de referencias bibliográficas en distintos estilos (APA, MLA, IEEE).

---

## **3. Ideación (Divergencia y Convergencia)**

* **Lluvia de ideas de funciones iniciales**:

  * Abstracción de clases: usuarios, materiales (libros, videos, audios), préstamos digitales (acceso temporal).
  * Módulo de exportación de referencias en diferentes estilos.
  * Buscador por metadatos (autor, título, año, palabras clave).
  * Sistema de categorización por etiquetas o colecciones.
  * Interfaz web minimalista para lectores y panel de administración para gestores.
  * Posibilidad de integrarse con repositorios académicos externos.

* **Selección para primera versión**:

  * Gestión básica de usuarios y materiales.
  * Carga y almacenamiento de archivos digitales con metadatos.
  * Búsqueda simple por título y autor.
  * Exportación de citas en formato APA.
  * Documentación clara para la comunidad open source.

---

## **4. Implementación / Construcción (Divergencia y Convergencia)**

* **Primera iteración (v0.1)**:

  * Diagrama de Clases, base de datos con usuarios y materiales digitales.
  * Interfaz web minimalista con login y búsqueda básica.
  * Carga de archivos PDF con metadatos asociados.
  * Exportación de citas en formato APA.

* **Pruebas y feedback**:

  * Compartir prototipo con estudiantes, docentes y gestores de bibliotecas.
  * Validar facilidad de uso en la búsqueda y carga de archivos.
  * Ajustar interfaz y flujo según retroalimentación.

* **Iteraciones siguientes**:

  * Soporte para más formatos (.mp4, .mp3).
  * Exportación de referencias en estilos MLA e IEEE.
  * Sistema de categorización avanzada (etiquetas, colecciones temáticas).
  * Préstamos digitales temporales (descargas limitadas).
  * Integración con APIs de repositorios académicos.
