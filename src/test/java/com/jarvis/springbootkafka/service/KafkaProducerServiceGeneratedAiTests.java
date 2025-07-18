package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.kafka.core.KafkaTemplate;
import static org.mockito.Mockito.*;

public class KafkaProducerServiceGeneratedAiTests {

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @InjectMocks
    private KafkaProducerService kafkaProducerService;

    @Test
    void testSend() {
        // GIVEN
        String message = "test message";
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        verify(kafkaTemplate, times(1)).send("my-topic", message);
    }
}