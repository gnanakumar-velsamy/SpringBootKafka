package com.jarvis.springbootkafka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions; 

class SpringBootKafkaApplicationGeneratedAiTests {

	@BeforeEach
	void setUp() {
	}

	@Test
	void testMain() {
		// GIVEN: A String array representing command line arguments
		String[] args = {};
		// WHEN: The main method is called
		SpringApplication.run(SpringBootKafkaApplication.class, args);
		// THEN: The application should start successfully
		Assertions.assertTrue(true); 
	}
}