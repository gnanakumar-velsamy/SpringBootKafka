package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.kafka.clients.consumer.ConsumerRecord; 
import static org.junit.jupiter.api.Assertions.*;

public class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
    }

    @Test
    void testConsumeMessage() {
        // GIVEN a ConsumerRecord with a value
        ConsumerRecord<String, String> record = new ConsumerRecord<>("my-topic", "my-group", 0, 0, null, "test message", null);
        // WHEN the consumeMessage method is called with the record
        kafkaConsumerService.consumeMessage(record);
        // THEN the message field of the KafkaConsumerService is set to the received value
        assertEquals("test message", kafkaConsumerService.getMessage());
    } 
}