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
    void testConsumeMessage_ReturnsCorrectMessage() {
        // GIVEN
        String expectedMessage = "Hello, World!";
        // WHEN
        kafkaConsumerService.consumeMessage(expectedMessage);
        // THEN
        assertEquals(expectedMessage, kafkaConsumerService.getMessage());
    }
}