# Working Log

## 2026-09-27

### Microtarea
AA-01 — Documentar el proceso operativo y el modelo de dominio.

### Completado
- docs/process.md: Documentado el proceso operativo completo con 12 pasos, diferenciando acciones de PEGASE vs operario.
- docs/domain-model.md: Definidas 9 entidades (petición, tramo, campaña, fichero, medida, hoja de campo, marca de campo, persona, tipo de vía) con diagramas de relaciones.
- docs/business-rules.md: Estructuradas 4 secciones (responsabilidades, ficheros, hoja de campo, pendientes de confirmar) con 5 puntos pendientes por validar.
- docs/working-log.md: Actualizada con registro de microtarea AA-01.

### Estado de la documentación
Todos los archivos de la microtarea AA-01 han sido creado/actualizados con el contenido especificado.

### Decisiones aplicadas
1. `FF` documentado como marca registrada por el operario, no generada por PEGASE (según corrección #2).
2. Número de medida debe conservarse exactamente como aparece en PEGASE (corrección #5).
3. Intervalos ~5m son operativos, no reglas técnicas rígidas (corrección #6).
4. Pendientes identificados y sección incluída en business-rules.md para confirmación futura.

### Pendientes de confirmar
- Si la numeración de medidas continúa entre ficheros o se reinicia.
- Si el número de medida se puede importar directamente desde archivos PEGASE.
- Si PEGASE genera identificador relacionado con FF.
- Catálogo definitivo de códigos de observación.
- Formato exacto de exportación requerido por procesos.

### Próxima microtarea
AA-02 — Crear la estructura base del backend (modelos, repositorios, API endpoints mínimos).