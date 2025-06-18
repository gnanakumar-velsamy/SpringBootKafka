package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.Test
public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    public void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    public void testConsumeMessage() {
        // GIVEN - A message to be consumed
        String message = "Test Message";
        // WHEN - The message is consumed
        kafkaConsumerService.consumeMessage(message);
        // THEN - The message is stored in the service and printed to the console
        assertEquals(message, kafkaConsumerService.getMessage());
        assertTrue(System.out.println(message));
    }
}