package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.apache.kafka.clients.consumer.ConsumerRecord;

class KafkaConsumerSerivceGeneratedAiTests {

    @InjectMocks
    private KafkaConsumerSerivce kafkaConsumerSerivce;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage() {
        //GIVEN
        String message = "Hello from Kafka!";
        //WHEN
        kafkaConsumerSerivce.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 1, 0, null, message, null));
        //THEN
        assertThat("Received message: "+message).isEqualTo("Received message: Hello from Kafka!");
    }

}
