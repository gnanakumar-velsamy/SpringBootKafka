package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    void testConsumeMessage() {
        // GIVEN a message to consume
        String message = "Hello from Kafka!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(message);
        // THEN the message should be stored in the service instance
        Assertions.assertEquals(message, kafkaConsumerService.getMessage());
    }
}