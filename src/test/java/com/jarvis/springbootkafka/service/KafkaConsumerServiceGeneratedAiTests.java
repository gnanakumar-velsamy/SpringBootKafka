package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.kafka.clients.consumer.ConsumerRecord;

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
        kafkaConsumerService.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 0, 0, null, message, null));
        // THEN the message is stored correctly
        Assertions.assertEquals(message, kafkaConsumerService.getMessage());
    }
}