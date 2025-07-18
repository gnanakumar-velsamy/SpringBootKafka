package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import com.jarvis.springbootkafka.service.KafkaProducerService; 


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
        // WHEN - The sendMessage method is called with the message
        appController.sendMessage(message);
        // THEN - verify that KafkaProducerService.send() was called with the provided message
        verify(kafkaProducerService).send(message);
    }
}