package com.jarvis.springbootkafka;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootKafkaApplicationGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testMainMethod() {
        // GIVEN - Set up the context for testing the main method
        // WHEN - Execute the main method
        SpringApplication.run(SpringBootKafkaApplication.class, new String[] {});
        // THEN - Assert that the application started successfully
    }
}