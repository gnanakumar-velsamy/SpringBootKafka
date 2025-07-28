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
    void sendMessage_shouldCallKafkaProducerServiceSendMethod() {
        // GIVEN - Set up the input message
        String message = "test message";

        // WHEN - Call the sendMessage method on the AppController
        appController.sendMessage(message);

        // THEN - Verify that the kafkaProducerService.send method was called with the expected message
        verify(kafkaProducerService).send(message);
    }
}