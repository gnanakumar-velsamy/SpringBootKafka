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
        // GIVEN a consumer service and a message to consume
        String messageToConsume = "Hello from Kafka!";
        // WHEN the message is consumed
        kafkaConsumerService.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 0, 0, null, "my-topic", messageToConsume));
        // THEN the message is stored in the service's message variable
        assertEquals(messageToConsume, kafkaConsumerService.getMessage());
    }

}