package com.jarvis.springbootkafka.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.jarvis.springbootkafka.service.KafkaProducerService;

class AppControllerGeneratedAiTests {
    @Mock
    private KafkaProducerService kafkaProducerService;
    @InjectMocks
    private AppController appController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sendMessage_shouldCallKafkaProducerServiceSendMethod(){
        //GIVEN
        String message = "test message";
        //WHEN
        appController.sendMessage(message);
        //THEN
        verify(kafkaProducerService).send(message);
    }
}