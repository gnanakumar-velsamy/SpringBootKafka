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
        String message = "Hello from Kafka!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(message);
        // THEN the received message should be equal to the consumed message
        assertEquals(message, kafkaConsumerService.getMessage());
    }

    @Test
    void testGetMessage() {
        // GIVEN an initial empty message
        String expectedMessage = "";
        // WHEN getMessage is called
        String actualMessage = kafkaConsumerService.getMessage();
        // THEN the received message should be empty
        assertEquals(expectedMessage, actualMessage);
    }

}