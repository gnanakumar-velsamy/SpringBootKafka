package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.apache.kafka.clients.consumer.ConsumerRecord;

class KafkaConsumerServiceGeneratedAiTests {

    private KafkaConsumerService kafkaConsumerService;

    @BeforeEach
    void setUp() {
        kafkaConsumerService = new KafkaConsumerService();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConsumeMessage() {
        // GIVEN
        String expectedMessage = "Hello, World!";
        
        // WHEN
        kafkaConsumerService.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 0, 0, null, expectedMessage));

        // THEN
        assertThat(kafkaConsumerService.getMessage()).isEqualTo(expectedMessage);
    }   
}
