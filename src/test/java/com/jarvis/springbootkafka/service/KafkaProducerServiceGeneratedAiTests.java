package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class KafkaProducerServiceGeneratedAiTests {

    @Mock
    private org.springframework.kafka.core.KafkaTemplate<String, String> kafkaTemplate;

    @InjectMocks
    private KafkaProducerService kafkaProducerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSend_SendsMessageToTopic() {
        // GIVEN - A message to be sent
        String message = "Hello, Kafka!";
        // WHEN - The send method is called
        kafkaProducerService.send(message);
        // THEN - Verify that the kafkaTemplate.send method was called with the expected arguments
        verify(kafkaTemplate).send("my-topic", message);
    }

}