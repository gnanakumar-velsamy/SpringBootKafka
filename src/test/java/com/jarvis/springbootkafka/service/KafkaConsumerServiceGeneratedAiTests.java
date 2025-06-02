package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import static org.junit.jupiter.api.Assertions.*;

class KafkaConsumerServiceGeneratedAiTests {

    @InjectMocks
    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConsumeMessage() {
        // GIVEN
        String expectedMessage = "Hello, World!";
        // WHEN
        kafkaConsumerService.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 1L, 0L, 0L, "key", expectedMessage));
        // THEN
        assertEquals(expectedMessage, kafkaConsumerService.getMessage());
    }

}