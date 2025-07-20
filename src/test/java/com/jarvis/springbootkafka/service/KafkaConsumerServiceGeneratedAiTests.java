package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    void testConsumeMessage() {
        // GIVEN a message to be consumed
        String message = "Hello from Kafka!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(message);
        // THEN the received message should match the input message
        assertEquals(message, kafkaConsumerService.getMessage());
    }
}