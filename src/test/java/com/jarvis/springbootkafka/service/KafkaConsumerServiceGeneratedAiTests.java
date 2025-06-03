package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.kafka.clients.consumer.ConsumerRecord; 

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    void testConsumeMessage() {
        // GIVEN a message to be consumed
        String message = "Hello from Kafka!";
        // WHEN the message is consumed by the service
        kafkaConsumerService.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 0, 0, null, "key", message));
        // THEN the message is stored in the service's message variable
        assertEquals(message, kafkaConsumerService.getMessage());
    }
}