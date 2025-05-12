package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AppController.class)
public class AppControllerGeneratedAiTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private KafkaProducerService kafkaProducerService;

    @Test
    void sendMessage_shouldSendKafkaMessage() throws Exception {
        // GIVEN - Set up the request payload
        String message = "test message";

        // WHEN - Send a POST request to /send with the message payload
        mockMvc.perform(post("/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(message))
                .andExpect(status().isOk());

        // THEN - Verify that the KafkaProducerService was called with the expected message
        verify(kafkaProducerService).send(message);
    }
}