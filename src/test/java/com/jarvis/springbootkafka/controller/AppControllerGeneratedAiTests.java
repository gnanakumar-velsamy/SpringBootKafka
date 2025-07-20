package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.jarvis.springbootkafka.service.KafkaProducerService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppControllerGeneratedAiTests {

    @Autowired
    private AppController appController;

    @MockBean
    private KafkaProducerService kafkaProducerService;

    @Test
    void sendMessage() {
        // GIVEN
        String message = "test message";
        Mockito.when(kafkaProducerService.send(message)).thenReturn(null);

        // WHEN
        appController.sendMessage(message);

        // THEN
        Mockito.verify(kafkaProducerService, Mockito.times(1)).send(message);
    }
}