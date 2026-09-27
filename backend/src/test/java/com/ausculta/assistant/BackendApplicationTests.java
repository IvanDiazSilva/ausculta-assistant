package com.ausculta.assistant;

import com.ausculta.assistant.controller.HealthController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    private HealthController healthController;

    @Test
    void contextoCargaCorrectamente() {
        assertThat(healthController).isNotNull();
    }

    @Test
    void endpointHealthDevuelveCorrecto() {
        var response = healthController.health();
        assertThat(response.getStatus()).isEqualTo("UP");
        assertThat(response.getApplication()).isEqualTo("ausculta-assistant");
    }
}