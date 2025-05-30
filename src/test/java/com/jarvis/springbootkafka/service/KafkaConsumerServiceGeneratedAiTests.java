package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class KafkaConsumerServiceGeneratedAiTests {

    @InjectMocks
    private KafkaConsumerService kafkaConsumerService;

    @Mock
    private ConsumerRecord<String, String> consumerRecord;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage_shouldSetMessageProperty() {
        // GIVEN
        when(consumerRecord.value()).thenReturn("test message");

        // WHEN
        kafkaConsumerService.consumeMessage(consumerRecord);

        // THEN
        assertThat(kafkaConsumerService.getMessage()).isEqualTo("test message");
    }
}
