# Biblioteca Digital

## Introducción
Con el avance de la tecnología, las bibliotecas tradicionales han experimentado una transformación significativa, migrando progresivamente hacia entornos digitales. Este cambio plantea retos importantes, entre ellos la necesidad de implementar herramientas que garanticen una interacción eficiente, intuitiva y accesible para los usuarios. En este contexto, el presente documento expone el desarrollo del proyecto “Sistema de Biblioteca Digital”, el cual propone una solución innovadora y actualizada que redefine la gestión y el acceso a la información en bibliotecas digitales.
A lo largo del documento se describen las fases de desarrollo que estructuran el proyecto, estableciendo una base sólida y organizada que permite su implementación a gran escala.

## Planteamiento del problema
Una cierta universidad quiere y necesita desarrollar un sistema de biblioteca digital que le permita gestionar diferentes tipos de materiales como libros, revistas, videos educativos y artículos académicos.
Cada material tiene información común (título, autor, año de publicación) pero también características particulares según su tipo (número de páginas, duración en minutos, volumen y número de edición).
El sistema deberá permitir consultar información de los materiales y mostrar detalles de manera polimórfica (el método se comporta diferente según el tipo de material). También se requiere la gestión de préstamos y devoluciones, así como, la interfaz de búsqueda para localizar material según su título o autor.
Requisitos
- Abstracción: Clase abstracta MaterialBiblioteca.
- Herencia: Libro, Revista, Videos heredan de MaterialBiblioteca.
- Polimorfismo: el método mostrarInformacion() se comporta diferente según el tipo de material.
- Clase abstracta: MaterialBiblioteca.
- Interfaz: Prestamo, implementada por Libro y Revista.

## Metodología de Desarrollo
### 1. Descubrimiento / Empatía / Investigación (Divergencia)
   
  - Contexto detectado: La mayoría de herramientas de gestión de bibliotecas están orientadas a entornos físicos, lo que genera limitaciones cuando se busca un enfoque totalmente digital:
    - Dificultad para organizar y gestionar archivos en múltiples formatos.
    - Soluciones disponibles centradas en préstamos físicos y catálogos impresos.
    - Escasez de software minimalista para bibliotecas digitales comunitarias o educativas.
  - Necesidades de los usuarios:
    - Lectores que buscan una interfaz sencilla de búsqueda y acceso al contenido.
    - Administradores que necesitan organizar y clasificar materiales digitales de manera eficiente.
    - Comunidad open source interesada en disponer de una plataforma extensible para documentación, manuales y archivos multimedia.
  Hallazgos clave:
    - Carencia de herramientas que integren organización de materiales y exportación de referencias.
    - Creciente demanda de soluciones simples que gestionen textos, videos y audios en un solo entorno.
    - Interés en bibliotecas digitales como espacios de acceso libre y colaborativo.
    
### 2. Definición / Síntesis (Divergencia)
  - Problema a resolver: "Actualmente no existe una herramienta de gestión de bibliotecas digitales que sea open source, simple, capaz de manejar distintos formatos de archivo (.pdf, .mp4, .mp3), con almacenamiento estructurado y que genere automáticamente citas bibliográficas de su propio contenido."
  - Oportunidad de mercado:
    - Desarrollar una solución ligera y extensible que sirva de base para proyectos de bibliotecas digitales.
    - Priorizar la experiencia de usuario con búsquedas rápidas, intuitivas y categorización clara.
    - Incorporar, de manera modular, un sistema de exportación de referencias bibliográficas en distintos estilos (APA, MLA, IEEE).

### 3. Ideación (Divergencia y Convergencia)
   
  - Lluvia de ideas de funciones iniciales:
    - Abstracción de clases: usuarios, materiales (libros, videos, audios), préstamos digitales (acceso temporal).
    - Módulo de exportación de referencias en diferentes estilos.
    - Buscador por metadatos (autor, título, año, palabras clave).
    - Sistema de categorización por etiquetas o colecciones.
    - Interfaz web minimalista para lectores y panel de administración para gestores.
    - Posibilidad de integrarse con repositorios académicos externos.
       
  - Selección para primera versión:
    - Gestión básica de usuarios y materiales.
    - Carga y almacenamiento de archivos digitales con metadatos.
    - Búsqueda simple por título y autor.
    - Exportación de citas en formato APA.
    - Documentación clara para la comunidad open source.
      
### 4. Implementación / Construcción (Divergencia y Convergencia)

  - Primera iteración (v0.1):
    - Diagrama de Clases, base de datos con usuarios y materiales digitales.
    - Interfaz web minimalista con login y búsqueda básica.
    - Carga de archivos PDF con metadatos asociados.
    - Exportación de citas en formato APA.
  
  - Pruebas y feedback:
    - Compartir prototipo con estudiantes, docentes y gestores de bibliotecas.
    - Validar facilidad de uso en la búsqueda y carga de archivos.
    - Ajustar interfaz y flujo según retroalimentación.
  
  - Iteraciones siguientes:
    - Soporte para más formatos (.mp4, .mp3).
    - Exportación de referencias en estilos MLA e IEEE.
    - Sistema de categorización avanzada (etiquetas, colecciones temáticas).
    - Préstamos digitales temporales (descargas limitadas).
    - Integración con APIs de repositorios académicos.

## Documentación Técnica

## Desarrollo
Links a documentos
- [Design Thinking](./docs/DesignThinking.md)
- [Learn Startup](./docs/LearnStartup.md)
- [Scrum](./docs/Scrum.md)

# Instalación

# Diagramas y estructuras
## Diagrama UML de clases

## Diagrama E-R


# Conclusiones
El proceso de desarrollo permitió aplicar de manera efectiva la evaluación de las historias de usuario, lo que facilitó una adaptación adecuada a las condiciones y requerimientos del proyecto. Como resultado, se logró un avance significativo en la creación de un sistema integral capaz de gestionar diversos tipos de archivos en una biblioteca digital. Este sistema, que inicialmente se centraba en documentos PDFs, se ha expandido exitosamente para incluir también audios y videos, consolidándose como una solución versátil y de alto impacto.
