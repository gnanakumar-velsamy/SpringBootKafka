package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        String message = "Hello from Kafka!";
        // WHEN - The message is consumed by the service
        kafkaConsumerService.consumeMessage(message);
        // THEN - The received message should match the input message
        assertEquals(message, kafkaConsumerService.getMessage());
    }
}