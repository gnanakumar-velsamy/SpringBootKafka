package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    void testConsumeMessage() {
        // GIVEN
        String message = "Hello from Kafka!";
        // WHEN
        kafkaConsumerService.consumeMessage(message);
        // THEN
        assertEquals("Received message: Hello from Kafka!", kafkaConsumerService.getMessage());
    }

}