package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.jarvis.springbootkafka.service.KafkaProducerService;

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
        // GIVEN - A string message to be sent
        String message = "test message";

        // WHEN - The sendMessage method is called with the message
        appController.sendMessage(message);

        // THEN - Verify that the kafkaProducerService.send method was called with the message
        verify(kafkaProducerService).send(message);
    }
}