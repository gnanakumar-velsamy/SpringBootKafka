package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AppController.class)
public class AppControllerGeneratedAiTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void sendMessage_shouldSendKafkaMessage() throws Exception {
        // GIVEN - A message to be sent
        String message = "Hello from Spring Boot Kafka!";
        // WHEN - Send the message to the controller
        mockMvc.perform(MockMvcRequestBuilders.post("/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(message))
                // THEN - Verify the status code is OK
                .andExpect(status().isOk());
    }
}