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
    void testSend_SendsMessageToKafkaTopic() {
        // GIVEN - A message to be sent
        String message = "Hello from Kafka Producer!";
        // WHEN - The send method is called with the message
        kafkaProducerService.send(message);
        // THEN - The kafkaTemplate should have been called with the topic and message
        verify(kafkaTemplate).send("my-topic", message);
    }
}