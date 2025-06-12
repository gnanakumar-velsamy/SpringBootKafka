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
        //GIVEN - A message to be consumed
        String message = "Hello from Kafka";
        //WHEN - The message is consumed by the service
        kafkaConsumerService.consumeMessage(message);
        //THEN - The message is stored in the service and printed to the console
        assertEquals(message, kafkaConsumerService.getMessage());
    }
}