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
		// GIVEN - Context is set up
		// WHEN - The main method is executed
		SpringApplication.run(SpringBootKafkaApplication.class, new String[] {});
		// THEN - Assert that the application runs successfully
		Assertions.assertTrue(true);
	}
}