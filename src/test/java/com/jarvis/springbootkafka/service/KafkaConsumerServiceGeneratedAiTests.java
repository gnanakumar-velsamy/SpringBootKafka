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
    void consumeMessage_shouldStoreReceivedMessage() {
        // GIVEN
        String expectedMessage = "Hello from Kafka!";
        // WHEN
        kafkaConsumerService.consumeMessage(expectedMessage);
        // THEN
        assertEquals(expectedMessage, kafkaConsumerService.getMessage());
    } 
}