package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducerServiceGeneratedAiTests {

    private KafkaProducerService kafkaProducerService;
    private KafkaTemplate kafkaTemplateMock;

    @BeforeEach
    void setUp() {
        kafkaProducerService = new KafkaProducerService();
        kafkaTemplateMock = Mockito.mock(KafkaTemplate.class);
        kafkaProducerService.kafkaTemplate = kafkaTemplateMock;
    }

    @Test
    void testSend() {
        // GIVEN
        String message = "test message";
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        Mockito.verify(kafkaTemplateMock).send("my-topic", message);
    }
}