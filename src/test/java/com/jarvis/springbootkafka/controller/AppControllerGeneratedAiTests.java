package com.jarvis.springbootkafka.controller;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.jarvis.springbootkafka.service.KafkaProducerService;

@ExtendWith(MockitoExtension.class)
class AppControllerGeneratedAiTests {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sendMessage_shouldSendKafkaMessage() {
        // GIVEN
        String message = "test message";
        // WHEN
        kafkaProducerService.send(message);
        // THEN
        verify(kafkaProducerService).send(message);
    }
}