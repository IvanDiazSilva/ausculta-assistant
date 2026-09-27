\# Ausculta Assistant



Asistente digital de trabajo para operarios de auscultación de carreteras.



\## Descripción



Ausculta Assistant es una aplicación local diseñada para facilitar la planificación, el seguimiento y la documentación de trabajos de auscultación de carreteras.



La aplicación no sustituye a PEGASE ni modifica su funcionamiento. PEGASE continúa siendo el sistema encargado de crear campañas y ficheros, realizar las mediciones, capturar imágenes y almacenar los datos técnicos.



Ausculta Assistant ayuda al operario a:



\- Consultar la planificación recibida en Excel.

\- Visualizar los tramos y P.K. que deben medirse.

\- Registrar la campaña y el fichero generados por PEGASE.

\- Crear una hoja de campo digital por cada fichero.

\- Registrar observaciones vinculadas al número de medida.

\- Registrar finales de fichero mediante el código `FF`.

\- Mantener la continuidad entre ficheros de una misma campaña.

\- Exportar información para el equipo de procesos.



\## Flujo principal



```text

Petición Excel

&#x20;   ↓

Tramo planificado

&#x20;   ↓

Campaña PEGASE

&#x20;   ↓

Fichero PEGASE

&#x20;   ↓

Número de medida

&#x20;   ↓

Observación de hoja de campo

&#x20;   ↓

Exportación para procesos

```



\## Estado del proyecto



Proyecto en fase inicial de preparación y análisis.



\## Tecnologías previstas



\### Backend



\- Java 21.

\- Spring Boot.

\- API REST.

\- SQLite para el primer MVP.



\### Frontend



\- Angular.

\- TypeScript.

\- Formularios reactivos.

\- SCSS.

