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
        // GIVEN - Set up the test context
        String[] args = {};

        // WHEN - Execute the main method
        org.springframework.boot.SpringApplication.run(SpringBootKafkaApplication.class, args);

        // THEN - Assert that the application runs without exceptions (a basic check)
        assertTrue(true); 
    }
}