package com.jarvis.springbootkafka.controller;

import com.jarvis.springbootkafka.service.KafkaProducerService; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

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
    void sendMessage_shouldCallKafkaProducerServiceSendMethod() {
        // GIVEN - A message to be sent
        String message = "Test Message";
        // WHEN - The sendMessage method is called
        appController.sendMessage(message);
        // THEN - Verify that the KafkaProducerService send method was called with the provided message
        verify(kafkaProducerService).send(message);
    }
}