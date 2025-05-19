package com.jarvis.springbootkafka.service;

import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.extension.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.extension.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;

public class KafkaConsumerSerivceGeneratedAiTests {

    @Mock
    private org.apache.kafka.clients.consumer.ConsumerRecord<String, String> record;

    @InjectMocks
    private KafkaConsumerSerivce kafkaConsumerSerivce;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage() {
        //GIVEN
        String expectedMessage = "Hello, World!";
        record.value(expectedMessage);
        //WHEN
        kafkaConsumerSerivce.consumeMessage(record);
        //THEN
        assertThat(System.out.println("Received message: "+ record.value())).contains("Received message: Hello, World!");
    }
}
