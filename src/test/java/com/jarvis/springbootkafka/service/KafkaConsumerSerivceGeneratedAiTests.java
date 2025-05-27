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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.apache.kafka.clients.consumer.ConsumerRecord; // Import ConsumerRecord


static org.mockito.Mockito.*;

class KafkaConsumerServiceGeneratedAiTests {

    @Mock
    private ConsumerRecord<String, String> record;

    @InjectMocks
    private KafkaConsumerService kafkaConsumerSerivce;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage() {
        //GIVEN
        String expectedMessage = "test message";
        when(record.value()).thenReturn(expectedMessage);
        //WHEN
        kafkaConsumerSerivce.consumeMessage(record);
        //THEN
        verify(record).value();
        System.out.println("Received message: "+ record.value());
    }

}