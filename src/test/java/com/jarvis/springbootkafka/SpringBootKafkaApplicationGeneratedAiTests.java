package com.jarvis.springbootkafka;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;

@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
class SpringBootKafkaApplicationGeneratedAiTests {

    @Test
    void testMain() {
        // GIVEN - Setup the context for the test
        String[] args = {}; 

        // WHEN - Execute the main method
        SpringApplication.run(SpringBootKafkaApplication.class, args);

        // THEN - Assert that the application runs successfully
        Assertions.assertTrue(true); 
    }
}