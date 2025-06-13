package com.jarvis.springbootkafka;

import org.springframework.boot.SpringApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpringBootKafkaApplicationGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testMain() {
        // GIVEN: The application is running.
        // WHEN: The main method is executed.
        SpringApplication.run(SpringBootKafkaApplication.class, new String[]{});
        // THEN: The application should start successfully.
        assertTrue(true);
    }
}