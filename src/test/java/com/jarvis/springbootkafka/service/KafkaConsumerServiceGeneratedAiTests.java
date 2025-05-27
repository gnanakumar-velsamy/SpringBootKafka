package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.apache.kafka.clients.consumer.ConsumerRecord;

class KafkaConsumerServiceGeneratedAiTests {

    @InjectMocks
    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage() {
        // GIVEN
        String message = "Hello, World!";
        ConsumerRecord<String, String> record = new ConsumerRecord<>("my-topic", 1, 0L, "key", message);
        // WHEN
        kafkaConsumerService.consumeMessage(record);
        // THEN
        assertThat(kafkaConsumerService.getMessage()).isEqualTo("Hello, World!");

    }


}
