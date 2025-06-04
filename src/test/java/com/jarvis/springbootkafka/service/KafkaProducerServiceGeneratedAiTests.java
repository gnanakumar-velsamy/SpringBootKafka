package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Assertions.*;

class KafkaProducerServiceGeneratedAiTests {
    @InjectMocks
    private KafkaProducerService kafkaProducerService;

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSend_SendsMessageToKafkaTopic() {
        // GIVEN - A message to send
        String message = "test message";
        // WHEN - The send method is called with the message
        kafkaProducerService.send(message);
        // THEN - The KafkaTemplate's send method should be called with the topic and message
        verify(kafkaTemplate).send("my-topic", message);
    }
}