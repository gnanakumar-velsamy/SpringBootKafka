package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class KafkaConsumerServiceGeneratedAiTests {

    @InjectMocks
    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage_shouldPrintReceivedMessage() {
        // GIVEN
        String expectedMessage = "Hello, World!";
        org.apache.kafka.clients.consumer.ConsumerRecord<String, String> record = mock(org.apache.kafka.clients.consumer.ConsumerRecord.class);
        when(record.value()).thenReturn(expectedMessage);

        // WHEN
        kafkaConsumerService.consumeMessage(record);

        // THEN
        verify(record).value();
        System.out.println("Received message: " + expectedMessage);
    }
}
