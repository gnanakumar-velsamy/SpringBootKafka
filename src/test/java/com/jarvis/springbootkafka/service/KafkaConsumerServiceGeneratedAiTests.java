package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KafkaConsumerServiceGeneratedAiTests {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @org.junit.jupiter.api.Test
    void testConsumeMessage() {
        // GIVEN
        String messageToConsume = "Hello from Kafka!";
        // WHEN
        kafkaConsumerService.consumeMessage(messageToConsume);
        // THEN
        assertEquals("Received message: " + messageToConsume, kafkaConsumerService.getMessage());
    }

    private KafkaConsumerService kafkaConsumerService;
}