package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.kafka.core.KafkaTemplate;
import static org.mockito.Mockito.*;

public class KafkaProducerServiceGeneratedAiTests {

    private KafkaProducerService kafkaProducerService;
    private KafkaTemplate<String, String> kafkaTemplateMock;

    @BeforeEach
    void setUp() {
        kafkaTemplateMock = mock(KafkaTemplate.class);
        kafkaProducerService = new KafkaProducerService();
        kafkaProducerService.kafkaTemplate = kafkaTemplateMock;
    }

    @Test
    void testSend() {
        // GIVEN
        String message = "test message";
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        verify(kafkaTemplateMock, times(1)).send("my-topic", message);
    }
}