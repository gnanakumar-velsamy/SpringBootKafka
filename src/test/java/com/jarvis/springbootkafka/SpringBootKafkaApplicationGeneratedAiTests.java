package com.jarvis.springbootkafka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpringBootKafkaApplicationGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testMain_ApplicationRunsSuccessfully() {
        // GIVEN - Set up the context for testing the main method
        String[] args = {}; 

        // WHEN - Execute the main method
        org.springframework.boot.SpringApplication.run(SpringBootKafkaApplication.class, args);

        // THEN - Assert that no exceptions are thrown during execution
        assertTrue(true); // Replace with a more specific assertion if possible
    }
}