package com.jarvis.springbootkafka.controller;

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
    void sendMessage_shouldCallKafkaProducerService() {
        // GIVEN - A message to be sent
        String message = "test message";

        // WHEN - The sendMessage method is called
        appController.sendMessage(message);

        // THEN - The KafkaProducerService should have been called with the message
        verify(kafkaProducerService).send(message);
    }
}