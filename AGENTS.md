\# Instrucciones para agentes



\## Proyecto



Ausculta Assistant es un asistente digital local para operarios de auscultación de carreteras.



\## Regla principal



PEGASE crea las campañas, los ficheros, las medidas, las imágenes y los datos técnicos.



Ausculta Assistant no crea ni modifica campañas o ficheros dentro de PEGASE. Solo registra las referencias que PEGASE ya ha generado.



\## Dominio



\- Una petición contiene tramos planificados.

\- Una campaña puede contener varios ficheros.

\- Cada fichero tiene su propia hoja de campo.

\- Un fichero puede finalizar con el código `FF`.

\- Finalizar un fichero no finaliza la campaña.

\- Una marca de campo se asocia a un número de medida.

\- Los datos de los geófonos no forman parte de la hoja manual de campo.

\- La hoja incluye operario, conductor, fecha, vía y tipo de vía.



\## Forma de trabajo



\- Trabajar siempre por microtareas.

\- Analizar antes de implementar.

\- No modificar archivos fuera del alcance.

\- Crear pruebas para comportamientos nuevos.

\- Explicar los archivos modificados.

\- No hacer commits automáticamente.

\- No subir datos reales de campañas ni imágenes.

