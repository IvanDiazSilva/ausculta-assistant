# Instrucciones para agentes

## Roadmap

- **AA-01**: documentación inicial del dominio.
- **AA-02**: creación del backend Spring Boot.
- **AA-03**: configuración de base de datos y migraciones.
- **AA-04**: creación de las entidades Petición y Tramo.

## Proyecto

Ausculta Assistant es un asistente digital local para operarios de auscultación de carreteras.


## Regla principal

PEGASE crea las campañas, los ficheros, las medidas, las imágenes y los datos técnicos.

Ausculta Assistant no crea ni modifica campañas o ficheros dentro de PEGASE. Solo registra y organiza referencias.


## Dominio

- Una petición contiene tramos planificados.
- Una campaña puede contener varios ficheros.
- Cada fichero tiene su propia hoja de campo.
- Un fichero puede finalizar con el código `FF`.
- Finalizar un fichero no finaliza la campaña.
- Los datos de los geófonos quedan fuera de la hoja manual de campo.
- La hoja incluye operario, conductor, fecha, vía y tipo de vía.


## Forma de trabajo

- Responder siempre en español.
- Trabajar con ramas de funcionalidad.
- No trabajar directamente sobre main.
- Analizar antes de implementar.
- No modificar archivos fuera del alcance.
- Crear pruebas para comportamientos nuevos.
- No hacer commit ni push sin confirmación.
- Mantener docs/working-log.md actualizado.