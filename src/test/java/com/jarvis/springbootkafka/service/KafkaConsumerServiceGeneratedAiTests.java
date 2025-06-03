package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    public void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    public void testConsumeMessage() {
        // GIVEN a KafkaConsumerService instance
        String message = "Hello, World!";
        // WHEN the consumeMessage method is called with the message
        kafkaConsumerService.consumeMessage(message);
        // THEN the received message should be equal to the provided message
        assertEquals(message, kafkaConsumerService.getMessage());
    }

}