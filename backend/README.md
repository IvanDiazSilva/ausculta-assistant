# Ausculta Assistant - Backend

## Descripción

Este es el módulo backend de Ausculta Assistant, una aplicación local para operarios de auscultación de carreteras.

## Tecnologías

- **Java 21**
- **Spring Boot 3.2.2**
- **Maven**
- **Spring Web** - para endpoints REST
- **Spring Boot Test** - para testing

## Estructura del proyecto

```
src/main/java/com/ausculta/assistant/
├── BackendApplication.java      # Clase principal de Spring Boot
├── controller/                  # Controladores REST
│   └── HealthController.java    # Endpoint GET /api/health
└── health/                      # DTOs para respuestas
    └── HealthResponse.java      # Respuesta JSON del health check

src/test/java/com/ausculta/assistant/
└── BackendApplicationTests.java # Pruebas automáticas

src/main/resources/application.yml # Configuración de Spring Boot
```

## Endpoints disponibles

### GET /api/health

Verifica que la aplicación está en funcionamiento.

**Respuesta:**
```json
{
  "status": "UP",
  "application": "ausculta-assistant"
}
```

## Compilación y ejecución

```powershell
# Desde la carpeta backend
.\mvnw spring-boot:run
```

o

```powershell
# Compilar
.\mvnw clean package

# Ejecutar pruebas
.\mvnw test
```