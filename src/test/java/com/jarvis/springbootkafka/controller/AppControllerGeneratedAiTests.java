package com.jarvis.springbootkafka.controller;

import com.jarvis.springbootkafka.service.KafkaProducerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

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
    void sendMessage_shouldCallKafkaProducerService() {
        // GIVEN - A message to send
        String message = "test message";
        // WHEN - The sendMessage method is called
        appController.sendMessage(message);
        // THEN - The KafkaProducerService should have been called with the message
        verify(kafkaProducerService).send(message);
    }
}