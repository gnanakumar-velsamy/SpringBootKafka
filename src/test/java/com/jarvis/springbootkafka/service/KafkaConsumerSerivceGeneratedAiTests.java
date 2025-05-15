package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.test.utils.KafkaTestUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord; 

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class KafkaConsumerSerivceGeneratedAiTests {

    @InjectMocks
    private KafkaConsumerSerivce kafkaConsumerSerivce;

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage() {
        // GIVEN
        String message = "Hello World!";
        ConsumerRecord<String, String> record = new ConsumerRecord<>("my-topic", "my-group", 1L, 0L, "key", message);
        // WHEN
        kafkaConsumerSerivce.consumeMessage(record);
        // THEN
        verify(kafkaTemplate, times(1)).send("my-topic", "my-group", record);
    }
}