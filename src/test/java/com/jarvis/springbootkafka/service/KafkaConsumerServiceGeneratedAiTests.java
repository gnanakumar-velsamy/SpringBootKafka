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
    void testConsumeMessage_ReceivesAndStoresMessage() {
        // GIVEN a message to be consumed
        String expectedMessage = "Hello from Kafka!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(expectedMessage);
        // THEN the received message should be equal to the input message
        assertEquals(expectedMessage, kafkaConsumerService.getMessage());
    } 
}