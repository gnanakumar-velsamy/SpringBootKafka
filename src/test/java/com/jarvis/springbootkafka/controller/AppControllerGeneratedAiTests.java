package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
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
    void sendMessage_shouldCallKafkaProducerService() {
        // GIVEN - A message to be sent
        String message = "test message";
        // WHEN - The sendMessage method is called
        appController.sendMessage(message);
        // THEN - Verify that the kafkaProducerService.send method was called with the message
        verify(kafkaProducerService).send(message);
    }

}