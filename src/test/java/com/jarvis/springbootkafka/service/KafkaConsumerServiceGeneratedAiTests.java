package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class KafkaConsumerServiceGeneratedAiTests {

    @BeforeEach
    void setup() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    void consumeMessageTest() {
        // GIVEN
        String message = "Hello from Kafka!";
        // WHEN
        kafkaConsumerService.consumeMessage(message);
        // THEN
        assertEquals("Received message: "+ message, kafkaConsumerService.getMessage());
    }
    private KafkaConsumerService kafkaConsumerService;
}