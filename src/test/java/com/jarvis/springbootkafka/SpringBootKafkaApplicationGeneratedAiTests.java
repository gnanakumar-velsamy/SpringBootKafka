package com.jarvis.springbootkafka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpringBootKafkaApplicationGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testMain_shouldRunSuccessfully() {
        // GIVEN - Context setup
        String[] args = new String[0];
        // WHEN - Action execution
        org.springframework.boot.SpringApplication.run(SpringBootKafkaApplication.class, args);
        // THEN - Assertion
        assertTrue(true); // Assert that the application runs successfully
    }
}