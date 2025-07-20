package com.jarvis.springbootkafka;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;

@ExtendWith(org.junit.jupiter.api.extension.ExtendWith.class)
public class SpringBootKafkaApplicationGeneratedAiTests {

    @Test
    void testMain() {
        // GIVEN - Set up the testing environment
        String[] args = {}; 

        // WHEN - Execute the main method
        SpringApplication.run(SpringBootKafkaApplication.class, args);

        // THEN - Assert that the application started successfully
        Assertions.assertTrue(true); // Replace with a meaningful assertion based on your application's behavior
    }
}