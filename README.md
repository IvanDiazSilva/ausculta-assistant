# Ausculta Assistant

Asistente digital de trabajo para operarios de auscultación de carreteras.

## Descripción

Ausculta Assistant es una aplicación local diseñada para facilitar la planificación, el seguimiento y la documentación de trabajos de auscultación de carreteras.

La aplicación no sustituye a PEGASE ni modifica su funcionamiento. PEGASE continúa siendo el sistema encargado de crear campañas y ficheros, realizar las mediciones, capturar imágenes y almacenar los datos técnicos.

Ausculta Assistant ayuda al operario a:

- Consultar la planificación recibida en Excel.
- Visualizar los tramos y P.K. que deben medirse.
- Registrar la campaña y el fichero generados por PEGASE.
- Crear una hoja de campo digital por cada fichero.
- Registrar observaciones vinculadas al número de medida.
- Registrar finales de fichero mediante el código `FF`.
- Mantener la continuidad entre ficheros de una misma campaña.
- Exportar información para el equipo de procesos.

## Flujo principal

```text
Petición Excel
    ↓
Tramo planificado
    ↓
Campaña PEGASE
    ↓
Fichero PEGASE
    ↓
Número de medida
    ↓
Observación de hoja de campo
    ↓
Exportación para procesos
```

## Alcance inicial

La primera versión permitirá:

1. Importar una petición de medición desde Excel.
2. Mostrar los tramos planificados.
3. Consultar carretera, calzada, carril y P.K.
4. Registrar operario, conductor, fecha y tipo de vía.
5. Registrar los códigos de campaña y fichero generados por PEGASE.
6. Crear una hoja de campo digital por fichero.
7. Añadir observaciones mediante número de medida.
8. Registrar el cierre de un fichero con `FF`.
9. Exportar la hoja de campo.

## Tecnologías previstas

### Backend

- Java 21.
- Spring Boot.
- API REST.
- SQLite para el MVP local.
- Flyway.
- JUnit.

### Frontend

- Angular.
- TypeScript.
- Componentes standalone.
- Formularios reactivos.
- Signals.
- RxJS.
- SCSS.

## Regla importante

PEGASE crea y gestiona las campañas, los ficheros, las medidas, las imágenes y los datos técnicos.

Ausculta Assistant no crea ni modifica esos elementos dentro de PEGASE. Solo registra sus referencias y organiza la hoja de campo.

## Estado del proyecto

Proyecto en fase inicial de análisis y preparación del repositorio.

## Licencia

Pendiente de decidir.
