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
    void testConsumeMessage_StoresReceivedMessage() {
        // GIVEN a message to consume
        String expectedMessage = "Hello from Kafka!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(expectedMessage);
        // THEN the message should be stored in the service instance
        assertEquals(expectedMessage, kafkaConsumerService.getMessage());
    }

}