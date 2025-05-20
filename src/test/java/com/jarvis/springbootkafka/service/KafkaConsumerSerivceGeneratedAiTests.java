package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import static org.assertj.core.api.Assertions.*;


class KafkaConsumerSerivceGeneratedAiTests {

    @Mock
    private ConsumerRecord<String, String> record; 

    @InjectMocks
    private KafkaConsumerSerivce kafkaConsumerSerivce;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage_shouldPrintReceivedMessage() {
        //GIVEN
        String expectedMessage = "Hello from Kafka!";
        record.setValue(expectedMessage); 

        //WHEN
        kafkaConsumerSerivce.consumeMessage(record);

        //THEN
        assertThat(System.out.println("Received message: "+ record.value())).isEqualTo("Received message: Hello from Kafka!");
    } 
}