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
        String message = "Hello, World!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(message);
        // THEN the message should be stored in the service instance
        assertEquals(message, kafkaConsumerService.getMessage());
    }

}