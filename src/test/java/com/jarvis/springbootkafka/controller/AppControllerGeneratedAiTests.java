package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.jarvis.springbootkafka.service.KafkaProducerService; 

import static org.mockito.Mockito.verify;

@SpringBootTest
class AppControllerGeneratedAiTests {

    @InjectMocks
    private AppController appController;

    @Mock
    private KafkaProducerService kafkaProducerService; 

    @Test
    void sendMessage_shouldCallKafkaProducerService() {
        // GIVEN
        String message = "test message";
        // WHEN
        appController.sendMessage(message);
        // THEN
        verify(kafkaProducerService).send(message);
    }
}