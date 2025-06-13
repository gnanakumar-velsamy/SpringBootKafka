package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

class KafkaProducerServiceGeneratedAiTests {
    @InjectMocks
    private KafkaProducerService kafkaProducerService;

    @Mock
    private org.springframework.kafka.core.KafkaTemplate<String, String> kafkaTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSend_SendsMessageToTopic() {
        // GIVEN - A message to be sent
        String message = "test message";
        // WHEN - The send method is called with the message
        kafkaProducerService.send(message);
        // THEN - The KafkaTemplate's send method should be called with the topic and message
        verify(kafkaTemplate).send("my-topic", message);
    }
}