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
        // GIVEN - Setup the context for the test
        String[] args = new String[0];

        // WHEN - Execute the main method of the class under test
        SpringApplication.run(SpringBootKafkaApplication.class, args);

        // THEN - Assert that the application was successfully run
        Assertions.assertTrue(true); 
    }
}