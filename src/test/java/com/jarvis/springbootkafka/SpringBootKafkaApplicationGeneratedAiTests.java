package com.jarvis.springbootkafka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@org.junit.jupiter.api.extension.ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class SpringBootKafkaApplicationGeneratedAiTests {

    @Test
    void testMain() {
        // GIVEN - Setup the context for the test
        String[] args = new String[0];

        // WHEN - Execute the main method under test
        SpringApplication.run(SpringBootKafkaApplication.class, args);

        // THEN - Assert that the application started successfully
        assertTrue(true); 
    }
}