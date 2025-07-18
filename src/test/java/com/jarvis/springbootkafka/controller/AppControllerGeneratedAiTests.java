package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.jarvis.springbootkafka.service.KafkaProducerService; 

import static org.mockito.Mockito.verify;

@SpringBootTest
public class AppControllerGeneratedAiTests {

    @InjectMocks
    private AppController appController;

    @Mock
    private KafkaProducerService kafkaProducerService; 

    @Test
    void sendMessage_shouldCallKafkaProducerService() {
        // GIVEN - A message to be sent
        String message = "test message";
        // WHEN - The sendMessage method is called with the message
        appController.sendMessage(message);
        // THEN - Verify that the KafkaProducerService's send method was called with the message
        verify(kafkaProducerService).send(message);
    }
}