Ausculta Assistant
Asistente digital de trabajo para operarios de auscultación de carreteras.
Descripción
Ausculta Assistant es una aplicación local diseñada para facilitar la planificación, el
seguimiento y la documentación de trabajos de auscultación de carreteras.
La aplicación no sustituye a PEGASE ni modifica su funcionamiento. PEGASE continúa siendo
el sistema encargado de crear campañas y ficheros, realizar las mediciones cada 5 metros,
capturar imágenes y almacenar los datos técnicos.
Ausculta Assistant actúa como una herramienta complementaria para que el operario pueda:
Consultar digitalmente la planificación recibida en Excel.
Visualizar los tramos y P.K. que deben medirse.
Consultar observaciones y restricciones del trabajo.
Registrar los datos de la medición realizada en PEGASE.
Mantener una hoja de campo digital por cada fichero.
Registrar observaciones vinculadas al número de medida.
Documentar el cierre de un fichero cuando se levanta la cadena.
Continuar la misma campaña mediante un fichero nuevo.
Importar posteriormente los datos disponibles mediante USB.
Exportar información estructurada para el equipo de procesos.
Objetivo
Reducir la escritura repetitiva, evitar errores de organización y facilitar la relación entre:
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
Contexto operativo
El flujo de trabajo actual es el siguiente:
1. El operario recibe una planificación en formato físico o Excel.
2. La planificación contiene las vías, tramos y P.K. que deben medirse.
3. El operario inicia PEGASE.
4. PEGASE crea o muestra la campaña correspondiente.
5. Dentro de la campaña se crean uno o varios ficheros.
6. PEGASE registra las medidas cada 5 metros y almacena las imágenes y datos técnicos.
7. Si es necesario levantar la cadena por una curva pronunciada, rotonda u otra
circunstancia, se finaliza el fichero.
8. En la hoja de campo se anota el último número de medida y el código 
FF — fin de fichero.
9. Al continuar la medición, se crea otro fichero dentro de la misma campaña.
10. Posteriormente los datos se extraen mediante un disco duro externo o pendrive.
11. Ausculta Assistant organiza las referencias y facilita la elaboración de la hoja de campo.
Responsabilidades de cada sistema
PEGASE
PEGASE es responsable de:
Crear campañas.
Crear ficheros.
Generar el número de medida.
Registrar las mediciones cada 5 metros.
Capturar imágenes.
Almacenar los datos técnicos.
Organizar las carpetas y archivos de adquisición.
Ausculta Assistant
Ausculta Assistant es responsable de:
Importar la planificación Excel.
Mostrar los tramos de trabajo.
Mostrar carretera, calzada, carril y P.K.
Mostrar observaciones y restricciones.
Registrar el código de campaña generado por PEGASE.
Registrar el número de fichero generado por PEGASE.
Registrar operario, conductor y fecha.
Crear una hoja de campo digital por fichero.
Registrar marcas mediante número de medida y código.
Registrar cierres de fichero con 
FF.
Relacionar ficheros consecutivos dentro de una campaña.
Importar datos desde medios extraíbles.
Exportar información para procesos.
La aplicación no crea ni modifica campañas o ficheros dentro de PEGASE. Solo registra
las referencias que PEGASE ya ha generado.
Conceptos principales
Petición
Archivo de planificación recibido para un trabajo de auscultación.
Ejemplo:
PETICIONES-_-DEFLEXIONES_AVILA_-07_09_2026.xlsx
Tramo planificado
Segmento de carretera incluido en la petición.
Puede contener:
Carretera.
Código de tramo.
Calzada.
Carril.
P.K. inicial.
P.K. final.
Longitud.
Punto de inicio.
Punto final.
Observaciones.
Enlace cartográfico.
Campaña
Conjunto de mediciones de un tramo o trabajo dentro de PEGASE.
Ejemplo:
S260155
Ausculta Assistant guarda este código como referencia, pero no lo genera.
Fichero
Bloque concreto de medición dentro de una campaña.
Una campaña puede tener varios ficheros si la medición se interrumpe.
Campaña S260155
├──
 Fichero 1
├──
 Fichero 2
└──
 Fichero 3
Medida
Registro generado por PEGASE cada 5 metros aproximadamente. El número de medida se
utiliza como referencia en la hoja de campo.
Marca de campo
Observación manual asociada a un número de medida.
Ejemplos:
5434 — LP — Límite de provincia
6200 — FF — Fin de fichero
7350 — CF — Cambio de firme
Datos de la hoja de campo
Cada fichero tendrá su propia hoja de campo.
Cabecera
Campaña.
Fichero.
Fecha.
Nombre del operario.
Nombre del conductor.
Nombre de la vía.
Tipo de vía.
Código de tramo.
Calzada.
Carril.
P.K. inicial.
P.K. final.
Observaciones generales.
Detalle de observaciones
Número de medida.
P.K., si procede.
Código de observación.
Descripción.
Observaciones adicionales.
Los valores técnicos de los geófonos no forman parte de la hoja manual de campo. Esos datos
pertenecen a los ficheros técnicos generados por PEGASE.
Códigos de observación iniciales
Los siguientes códigos son provisionales y deben confirmarse con el equipo de procesos:
Código
Significado
IP Inicio de tramo
FP Final de tramo
LP Límite de provincia
CF Cambio de firme
DC Inicio o cambio a doble calzada
CG Cambio a calzada única
GI Inicio de glorieta
GF Final de glorieta
FF Fin de fichero
INC Incidencia
OBS Observación general
Regla de fin de fichero
Un fichero puede finalizar antes de que termine la campaña.
Ejemplo:
Campaña: S260155
Fichero: 1
Última medida: 5434
Observación: FF
Motivo: Cadena levantada para atravesar una rotonda
Después de atravesar la rotonda:
Campaña: S260155
Fichero: 2
Estado: En medición
La campaña continúa abierta. Solo se ha cerrado el fichero anterior.
Ejemplo de hoja de campo
CAMPAÑA: S260155
FICHERO: 1
FECHA: 07/09/2026
OPERARIO: Carlos Gómez
CONDUCTOR: Miguel Sánchez
VÍA: A-50
TIPO DE VÍA: Autovía
TRAMO: 05A5011
CALZADA: 1
CARRIL: 1
P.K. INICIAL: 0+820
P.K. FINAL: 54+460
|      
6000      
|      
Arquitectura prevista
Nº MEDIDA | P.K. | CÓDIGO | OBSERVACIÓN----------|------|--------|------------------------------
5434      
| FF     
| LP     
| Fin de fichero por rotonda
| Límite de provincia
La primera versión está pensada como una aplicación local, ya que el entorno actual no
dispone de red local y los ordenadores de adquisición utilizan Windows XP.
Excel de planificación
↓
Ausculta Assistant
↓
PEGASE realiza la adquisición
↓
USB o disco duro externo
↓
Ausculta Assistant importa y organiza
↓
Exportación para procesos
Backend
Tecnologías previstas:
Java 21.
Spring Boot 3.
Spring Web.
Spring Data JPA.
SQLite para el MVP local.
Flyway para migraciones.
Bean Validation.
OpenAPI/Swagger.
JUnit y Mockito.
Frontend
Tecnologías previstas:
Angular.
TypeScript.
Componentes standalone.
Signals.
RxJS.
Formularios reactivos.
SCSS.
Angular Material o componentes equivalentes.
Módulos funcionales
Peticiones
Tramos
Campañas PEGASE
Ficheros PEGASE
Hojas de campo
Marcas y observaciones
Importación desde USB
Exportación
Catálogos
Plan de desarrollo
Fase 0 — Análisis
Documentar el proceso real.
Confirmar el formato de los archivos PEGASE.
Confirmar cómo se numeran las medidas.
Confirmar si la numeración continúa entre ficheros o se reinicia.
Confirmar los códigos de observación aceptados por procesos.
Recoger ejemplos de hojas de campo reales.
Fase 1 — Proyecto base
Crear repositorio.
Crear backend Spring Boot.
Configurar SQLite.
Configurar Flyway.
Crear frontend Angular.
Crear layout y navegación.
Crear documentación inicial.
Fase 2 — Peticiones y tramos
Importar la planificación Excel.
Detectar la hoja y sus cabeceras.
Ignorar filas de totales.
Guardar peticiones.
Guardar tramos.
Mostrar listados y detalles.
Mostrar observaciones y enlaces cartográficos.
Fase 3 — Campañas y ficheros
Registrar código de campaña PEGASE.
Registrar número de fichero PEGASE.
Registrar operario y conductor.
Registrar fecha y datos generales.
Registrar P.K. real inicial y final.
Mantener relación entre campaña y ficheros.
Fase 4 — Hojas de campo
Crear una hoja por fichero.
Añadir marcas de campo.
Registrar número de medida.
Seleccionar códigos de observación.
Registrar observaciones adicionales.
Implementar el cierre 
FF.
Crear referencia del siguiente fichero.
Fase 5 — Importación USB
Seleccionar carpeta de origen.
Detectar campañas y ficheros.
Validar carpetas y archivos.
Detectar duplicados.
Asociar ficheros con tramos.
Mostrar incidencias de importación.
Fase 6 — Exportación
Exportar Excel por campaña.
Exportar Excel por fichero.
Exportar CSV de marcas.
Exportar PDF de hojas de campo.
Crear informes de incidencias.
Primer MVP
El primer MVP debe permitir:
1. Importar el Excel de peticiones.
2. Mostrar los tramos planificados.
3. Consultar carretera, calzada, carril y P.K.
4. Mostrar observaciones importantes.
5. Registrar el código de campaña PEGASE.
6. Registrar el número de fichero PEGASE.
7. Registrar operario, conductor y fecha.
8. Crear una hoja de campo por fichero.
9. Añadir observaciones por número de medida.
10. Registrar 
FF al finalizar un fichero.
11. Exportar la hoja de campo a Excel o CSV.
Roadmap de microtareas
AA-01 — Documentación inicial del dominio
AA-02 — Crear backend Spring Boot
AA-03 — Configurar base de datos y migraciones
AA-04 — Crear entidades Petición y Tramo
AA-05 — Crear API de peticiones y tramos
AA-06 — Crear frontend Angular base
AA-07 — Crear listado de peticiones
AA-08 — Crear listado y detalle de tramos
AA-09 — Implementar importación Excel
AA-10 — Crear referencia de campaña PEGASE
AA-11 — Crear referencia de fichero PEGASE
AA-12 — Crear cabecera de hoja de campo
AA-13 — Crear marcas de campo
AA-14 — Implementar código FF
AA-15 — Implementar continuidad entre ficheros
AA-16 — Implementar importación USB
AA-17 — Implementar exportación Excel y CSV
AA-18 — Implementar exportación PDF
AA-19 — Añadir pruebas y validaciones
AA-20 — Documentación y cierre del MVP
Flujo de trabajo de desarrollo
El proyecto se desarrollará en microtareas pequeñas:
1. Crear una rama de funcionalidad.
2. Analizar la estructura existente.
3. Implementar una única funcionalidad.
4. Ejecutar pruebas.
5. Revisar los cambios.
6. Actualizar 
docs/working-log.md.
7. Crear un commit claro.
8. Integrar la rama en 
main.
9. Verificar que el proyecto continúa estable.
Estado actual
Proyecto en fase de definición funcional y arquitectura.
Siguiente objetivo recomendado:
AA-01 — Documentar el dominio y el proceso operativo real
Licencia
Pendiente de decidir.
