package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.assertj.core.api.Assertions;

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
    void testSend() {
        // GIVEN
        String message = "test message";
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        Assertions.assertThat(kafkaTemplate.send("my-topic", message)).isNotNull();
    }
}