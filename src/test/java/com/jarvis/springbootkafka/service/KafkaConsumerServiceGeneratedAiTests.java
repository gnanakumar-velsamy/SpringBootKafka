package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    public void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    void testConsumeMessage_StoresReceivedMessage() {
        // GIVEN a message to be consumed
        String message = "Hello from Kafka!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(message);
        // THEN the message should be stored in the service instance
        assertEquals(message, kafkaConsumerService.getMessage());
    }

}