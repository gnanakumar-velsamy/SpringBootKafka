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
    void testConsumeMessage() {
        // GIVEN A message to consume
        String message = "Hello from Kafka!";
        // WHEN The message is consumed
        kafkaConsumerService.consumeMessage(message);
        // THEN The received message should be equal to the consumed message
        assertEquals(message, kafkaConsumerService.getMessage());
    }
}