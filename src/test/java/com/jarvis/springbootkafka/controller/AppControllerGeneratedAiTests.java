package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppControllerGeneratedAiTests {
    @InjectMocks
    private AppController appController;

    @Mock
    private KafkaProducerService kafkaProducerService;

    @Test
    void sendMessage() {
        // GIVEN
        String message = "test message";
        // WHEN
        appController.sendMessage(message);
        // THEN
        org.junit.jupiter.api.Assertions.assertTrue(kafkaProducerService.send(message) == null);
    }
}