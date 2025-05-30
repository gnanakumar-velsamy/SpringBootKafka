package com.jarvis.springbootkafka.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class KafkaProducerServiceGeneratedAiTests {

    @MockBean
    private KafkaProducerService kafkaProducerService;

    private KafkaTemplate<String, String> kafkaTemplateMock;

    @BeforeEach
    void setUp() {
        kafkaTemplateMock = Mockito.mock(KafkaTemplate.class);
        kafkaProducerService.kafkaTemplate = kafkaTemplateMock;
    }

    @Test
    void testSend() {
        // GIVEN
        String message = "test message";
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        Mockito.verify(kafkaTemplateMock).send("my-topic", message);
    }
}
