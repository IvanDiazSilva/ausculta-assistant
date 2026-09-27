# Proceso Operativo

## 1. Recepción de la planificación
- El operario recibe la planificación en Excel o KLM.
- La planificación contiene: carreteras, tramos, calzadas, carriles y P.K.

## 2. Consulta de datos planificados
- Se consultan las carreteras, tramos, calzadas, carriles y P.K. de la planificación.
- Estos datos son referencia para la medición posterior.

## 3. Inicio de PEGASE
- Se inicia el proceso en PEGASE con la planificación cargada.
- PEGASE comienza la generación de la campaña.

## 4. Creación de campaña por PEGASE
- PEGASE crea una campaña nueva.
- La campaña representa el tramo o conjunto de P.K. a medir.

## 5. Creación de ficheros dentro de la campaña
- PEGASE crea uno o varios ficheros dentro de la campaña.
- Cada fichero tiene su propia hoja de campo.
- Un fichero puede finalizar con el código `FF` sin cerrar la campaña.

## 6. Generación de medidas e imágenes por PEGASE
- PEGASE genera números de medida aproximadamente cada 5 metros.
- PEGASE captura imágenes y datos técnicos de los geófonos.
- El número de medida se conserva exactamente como aparece en PEGASE.

## 7. Registro de observaciones en la hoja de campo
- El operario registra observaciones vinculadas al número de medida.
- Ejemplo: número de medida 5434 con observación LP, límite de provincia.
- Las observaciones se anotan en la hoja de campo digital.

## 8. Finalización de un fichero cuando se levanta la cadena
- Si se levanta la cadena por una curva pronunciada o una rotonda, el operario finaliza el fichero.
- El operario registra el código `FF` en la hoja de campo.
- `FF` es una marca registrada por el operario, no generada por PEGASE (por confirmar).
- Al registrar FF se conserva el último número de medida asociado.

## 9. Registro del último número de medida y código FF por el operario
- El operario anota el último número de medida antes de FF.
- Se registra FF junto con el último número de medida en la hoja de campo.

## 10. Continuación de la medición con otro fichero dentro de la misma campaña
- La campaña permanece abierta después de finalizar un fichero.
- Al salir de la rotonda se crea otro fichero dentro de la misma campaña.
- La numeración de medidas puede continuar o reiniciarse (por confirmar).

## 11. Extracción posterior de los datos mediante USB
- Los datos recopilados se extraen mediante USB de los equipos de medición.
- Los datos de los geófonos no forman parte de la hoja manual de campo.
- La hoja de campo contiene solo la información operaria (operario, conductor, fecha, vía, tipo de vía).

## 12. Organización y exportación con Ausculta Assistant
- Ausculta Assistant organiza la hoja de campo recopilada.
- Facilita la exportación de la información para el equipo de procesos.
- Ausculta Assistant no crea ni modifica campañas o ficheros en PEGASE.
- Solo registra referencias que PEGASE ya ha generado.

### Resumen de responsabilidades

**PEGASE:**
- Crea campañas.
- Crea ficheros.
- Genera números de medida (~5m interval).
- Captura imágenes y datos técnicos.
- Genera identificadores de campaña y fichero.

**Operario:**
- Recibe e consulta la planificación.
- Registra observaciones en la hoja de campo por número de medida.
- Registra el código `FF` para finalizar fichero.
- Anota el último número de medida al cerrar fichero.
- Exporta la hoja de campo mediante Ausculta Assistant.