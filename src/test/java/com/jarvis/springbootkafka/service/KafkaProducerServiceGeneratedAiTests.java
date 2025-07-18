package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.kafka.core.KafkaTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KafkaProducerServiceGeneratedAiTests {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @MockBean
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    void testSend_shouldSendMessageToKafkaTopic() {
        // GIVEN
        String message = "test message";
        Mockito.when(kafkaTemplate.send("my-topic", message)).thenReturn(null);
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        Mockito.verify(kafkaTemplate, Mockito.times(1)).send("my-topic", message);
    }
}