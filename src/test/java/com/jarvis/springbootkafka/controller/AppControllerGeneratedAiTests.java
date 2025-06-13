package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jarvis.springbootkafka.service.KafkaProducerService;

import static org.mockito.Mockito.verify;

public class AppControllerGeneratedAiTests {
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
        // GIVEN - Set up the test scenario
        String message = "test message";

        // WHEN - Call the method under test
        appController.sendMessage(message);

        // THEN - Verify the expected behavior
        verify(kafkaProducerService).send(message);
    }
}