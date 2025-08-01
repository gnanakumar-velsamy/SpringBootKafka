package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AppController.class)
public class AppControllerGeneratedAiTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private KafkaProducerService kafkaProducerService;

    @Test
    void sendMessage_shouldCallKafkaProducerService() throws Exception {
        // GIVEN - Set up a mock KafkaProducerService that records calls to send()
        Mockito.when(kafkaProducerService.send("test message")).thenReturn();

        // WHEN - Send a POST request to /send with a test message
        mockMvc.perform(post("/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"message\":\"test message\"}"))
                .andExpect(status().isOk());

        // THEN - Verify that the kafkaProducerService.send() method was called with the expected message
        Mockito.verify(kafkaProducerService).send("test message");
    }
}