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
        // GIVEN a message to consume
        String expectedMessage = "Hello, world!"; 
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(expectedMessage);
        // THEN the message should be stored in the service instance
        assertEquals(expectedMessage, kafkaConsumerService.getMessage());
    } 

}