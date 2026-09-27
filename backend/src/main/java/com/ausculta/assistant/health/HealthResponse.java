package com.ausculta.assistant.health;

public record HealthResponse(
        String status,
        String application
) {
    public String getStatus() {
        return status;
    }

    public String getApplication() {
        return application;
    }
}