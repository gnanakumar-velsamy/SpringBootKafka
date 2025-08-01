package com.jarvis.springbootkafka;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SpringBootKafkaApplicationGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testMain() {
        // GIVEN - Set up the necessary context for the test
        String[] args = {}; 

        // WHEN - Call the main method under test
        org.springframework.boot.SpringApplication.run(SpringBootKafkaApplication.class, args); 

        // THEN - Assert that the execution of the main method did not throw any exceptions
        assertTrue(true);
    }
}