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
    void sendMessage_shouldCallKafkaProducerServiceWithGivenMessage() {
        // GIVEN - A message to send
        String message = "test message";
        // WHEN - The sendMessage method is called with the given message
        appController.sendMessage(message);
        // THEN - The KafkaProducerService should have been called with the provided message
        verify(kafkaProducerService).send(message);
    }

}