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
        // GIVEN a KafkaConsumerService instance
        // WHEN a message is consumed
        kafkaConsumerService.consumeMessage("test message");
        // THEN the message should be stored in the service
        assertEquals("test message", kafkaConsumerService.getMessage());
    }

}