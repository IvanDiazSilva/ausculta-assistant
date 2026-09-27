# Modelo de Dominio

## Entidades

### Petición o planificación
- Origen: Excel o KLM.
- Contiene tramos planificados con: carretera, calzada, carril, P.K.

### Tramo planificado
- Secuencia de medición dentro de una carretera.
- Define el inicio y fin de la zona a auscultar.

### Campaña PEGASE
- Identificador generado por PEGASE.
- Contiene uno o más ficheros.
- Se mantiene abierta después de finalizar un fichero.

### Fichero PEGASE
- Identificador generado por PEGASE.
- Pertenece a una campaña.
- Tiene su propia hoja de campo.
- Puede finalizar con código `FF`.
- La campaña continúa abierta tras cerrar fichero.

### Medida
- Número de medida generado por PEGASE.
- Approximately every 5 meters (intervalo operativo, no regla técnica rígida).
- Debe conservarse exactamente como aparece en PEGASE.
- Vinculada a una marca de campo/observación.

### Hoja de campo
- Documento digital por fichero.
- Contiene:
  - Nombre del operario.
  - Nombre del conductor.
  - Fecha.
  - Vía.
  - Tipo de vía.
- Lista de números de medida con observaciones asociadas.
- Incluye código `FF` al final del fichero.

### Marca de campo
- Relacionada con un número de medida.
- Puede ser: observación (ej. LP, límite de provincia), código `FF`.
- Una marca de campo se asocia a un número de medida.

### Persona
- Operario: profesional que realiza la medición.
- Conductor: acompañante del vehículo.

### Tipo de vía
- Clasificación de la vía (carretera, autovía, etc.).

## Relaciones (diagramas de texto)

### Campaña - Fichero
```
Campaña PEGASE 1
│
├── Fichero A (PK 0+000 al PK 5+000)
│   └── Hoja de campo A + medidas + observaciones
│
└── Fichero B (PK 5+000 al PK 10+000)
    └── Hoja de campo B + medidas + observaciones
```

### Fichero - Medida - Marca de campo
```
Fichero actual
│
├── Medida 5432 → Observación: LP (límite provincia)
├── Medida 5433 → Sin observación
├── Medida 5434 → Observación: curva pronunciada
│
└── FF (fin de fichero)
    └── Última medida: 5434
```

### Hoja de campo - Persona - Datos técnicos
```
Hoja de campo del fichero X
│
├── Operario: [Nombre]
├── Conductor: [Nombre]
├── Fecha: [Fecha]
├── Vía: [Nombre vía]
├── Tipo de vía: [Asfalto / Concreto]
│
├── Medidas registradas:
│   • 5432, 5433, 5434, ..., FF
│
└── Datos de geófonos: NO incluidos (estan en PEGASE)
```

### Relaciones clave
- **Una campaña puede tener varios ficheros.** (1:N)
- **Cada fichero tiene su propia hoja de campo.** (1:1)
- **Una marca de campo se relaciona con un número de medida.** (1:1)
- **Una hoja de campo contiene: operario, conductor, fecha, vía, tipo de vía.** (atributos)
- **Los datos de los geófonos no forman parte de la hoja manual de campo.** (exclusión)