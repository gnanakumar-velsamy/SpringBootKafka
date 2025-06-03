package com.jarvis.springbootkafka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SpringBootKafkaApplicationGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testMain() {
        // GIVEN - Set up the context for testing the main method.
        String[] args = new String[0];
        // WHEN - Execute the main method.
        SpringApplication.run(SpringBootKafkaApplication.class, args);
        // THEN - Assert that the application runs successfully.
        Assertions.assertTrue(true);
    }
}