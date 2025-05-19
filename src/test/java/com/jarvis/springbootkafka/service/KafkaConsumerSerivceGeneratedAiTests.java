package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.test.utils.KafkaTestUtils;

class KafkaConsumerSerivceGeneratedAiTests {

    private KafkaConsumerSerivce kafkaConsumerSerivce;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kafkaConsumerSerivce = new KafkaConsumerSerivce();
    }

    @Test
    void consumeMessage_ShouldPrintReceivedMessage() {
        // GIVEN
        String expectedMessage = "Hello, World!";
        // WHEN
        kafkaConsumerSerivce.consumeMessage(new org.apache.kafka.clients.consumer.ConsumerRecord<>("my-topic", "my-group", 0L, 0L, null, "my-topic", expectedMessage));
        // THEN
        assertThat(System.out.println("Received message: "+ expectedMessage)).isEqualTo(expectedMessage);
    }

}
