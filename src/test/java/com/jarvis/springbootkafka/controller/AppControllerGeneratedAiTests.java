package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.verify;
import com.jarvis.springbootkafka.service.KafkaProducerService; 



@SpringBootTest
class AppControllerGeneratedAiTests {

    @Autowired
    private AppController appController;

    @MockBean
    private KafkaProducerService kafkaProducerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void sendMessage() {
        // GIVEN
        String message = "test message";
        // WHEN
        appController.sendMessage(message);
        // THEN
        verify(kafkaProducerService).send(message);
    }
}