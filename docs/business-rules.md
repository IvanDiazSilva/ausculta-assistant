# Reglas de Negocio

## Responsabilidades

### PEGASE
- Crea campañas.
- Crea ficheros.
- Genera números de medida.
- Captura imágenes y datos técnicos.
- Genera identificadores de campaña y fichero.

### Ausculta Assistant
- No crea ni modifica campañas o ficheros dentro de PEGASE.
- Registra referencias a campañas y ficheros PEGASE.
- Organiza la información de la hoja de campo.
- Facilita la exportación para procesos.

## Ficheros

- Una campaña puede contener varios ficheros.
- Un fichero puede finalizar antes que la campaña.
- Levantar la cadena puede provocar el cierre del fichero (operario decide).
- Una rotonda o curva pronunciada puede generar la necesidad de continuar con otro fichero.
- La campaña continúa abierta después de finalizar un fichero.
- El código `FF` indica fin de fichero, no fin de campaña.
- Pendiente confirmar: si PEGASE genera algún identificador relacionado con FF.
- Pendiente confirmar: si la numeración de medidas continúa entre ficheros o se reinicia.

## Hoja de campo

- Cada fichero tiene su propia hoja de campo.
- La hoja incluye: operario, conductor, fecha, vía y tipo de vía.
- Las observaciones se vinculan a números de medida.
- `FF` significa "fin de fichero".
- El operario registra `FF` junto con el último número de medida.
- Los datos de geófonos no forman parte de la hoja manual.
- El número de medida debe conservarse exactamente como aparece en PEGASE.
- Pendiente confirmar: si el número de medida se puede importar directamente desde los archivos PEGASE.

## Pendientes de confirmar

1. **Numeración de medidas entre ficheros:**
   - ¿Continúa la numeración de medidas de un fichero al siguiente dentro de la misma campaña?
   - ¿Se reinicia el número de medida en cada nuevo fichero?

2. **Importación de números de medida:**
   - ¿Se puede importar el número de medida directamente desde los archivos PEGASE?
   - ¿O debe teclearse/manualmente registrarse en Ausculta Assistant?

3. **Identificador de FF:**
   - ¿Genera PEGASE algún identificador específico adicional para `FF`?
   - O `FF` es solo una marca de control del operario?

4. **Catálogo de códigos de observación:**
   - Definir catálogo definitivo de códigos de observación (LP, límite provincia, etc.).
   - Establecer códigos estándar para tipos de observaciones.

5. **Formato de exportación:**
   - Definir formato exacto de exportación requerido por procesos.
   - Especificar qué datos deben incluirse en el archivo exportado.
   - Definir estructura de archivo (CSV, Excel, PDF, etc.).