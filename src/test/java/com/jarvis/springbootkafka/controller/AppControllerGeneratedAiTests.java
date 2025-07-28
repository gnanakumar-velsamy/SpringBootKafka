package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.jarvis.springbootkafka.service.KafkaProducerService; 

import static org.junit.jupiter.api.Assertions.*;
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
    void sendMessage_shouldCallKafkaProducerServiceSendMethodWithGivenMessage() {
        // GIVEN - A message to be sent
        String message = "Test Message";
        // WHEN - The sendMessage method is called with the given message
        appController.sendMessage(message);
        // THEN - The kafkaProducerService.send method should be called with the same message
        verify(kafkaProducerService).send(message);
    }
}