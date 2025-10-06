package com.jarvis.springbootkafka.controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
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
        // GIVEN - A message to send
        String message = "test message";
        // WHEN - The sendMessage method is called
        appController.sendMessage(message);
        // THEN - The kafkaProducerService.send method should be called once
        verify(kafkaProducerService, times(1)).send(message);
    }
}