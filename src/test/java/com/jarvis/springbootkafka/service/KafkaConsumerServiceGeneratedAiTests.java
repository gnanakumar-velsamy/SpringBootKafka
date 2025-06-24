package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach("Setup method to initialize the KafkaConsumerService")
    public void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test("Test that the consumeMessage method sets the message correctly")
    public void testConsumeMessage() {
        // GIVEN a KafkaConsumerService instance
        String message = "Hello from Kafka!";
        // WHEN the consumeMessage method is called with the message
        kafkaConsumerService.consumeMessage(message);
        // THEN the message attribute should be set to the received message
        assertEquals(message, kafkaConsumerService.getMessage());
    }

}