package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.verify;

class KafkaProducerServiceGeneratedAiTests {
    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;
    @InjectMocks
    private KafkaProducerService kafkaProducerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSend_SendsMessageToKafkaTopic() {
        // GIVEN - A message to be sent
        String message = "Hello, Kafka!";
        // WHEN - The send method is called with the message
        kafkaProducerService.send(message);
        // THEN - Verify that the kafkaTemplate.send method was called with the expected topic and message
        verify(kafkaTemplate).send("my-topic", message);
    }
}