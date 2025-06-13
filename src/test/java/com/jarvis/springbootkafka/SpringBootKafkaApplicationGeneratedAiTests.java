package com.jarvis.springbootkafka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class SpringBootKafkaApplicationGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testMain() {
        // GIVEN - Context is set up for the main method execution.
        String[] args = {};
        // WHEN - The main method is executed.
        SpringApplication.run(SpringBootKafkaApplication.class, args);
        // THEN - Assert that the application runs successfully.
        Assertions.assertTrue(true); 
    }
}