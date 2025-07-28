package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.verify;


public class KafkaProducerServiceGeneratedAiTests {

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @InjectMocks
    private KafkaProducerService kafkaProducerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSend_MessageSentToKafkaTopic() {
        // GIVEN - A message to be sent
        String message = "Hello, Kafka!";
        // WHEN - The send method is called
        kafkaProducerService.send(message);
        // THEN - The KafkaTemplate should have been called with the message and topic
        verify(kafkaTemplate).send("my-topic", message);
    }
}