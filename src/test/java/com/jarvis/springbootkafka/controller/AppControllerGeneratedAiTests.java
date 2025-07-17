package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class AppControllerGeneratedAiTests {

    @InjectMocks
    private AppController appController;

    @Mock
    private KafkaProducerService kafkaProducerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sendMessage_shouldCallKafkaProducerServiceSendMethod() {
        // GIVEN
        String message = "test message";
        // WHEN
        appController.sendMessage(message);
        // THEN
        verify(kafkaProducerService, times(1)).send(message);
    }
}