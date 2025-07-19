package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AppController.class)
class AppControllerGeneratedAiTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private KafkaProducerService kafkaProducerService;

    @Test
    void sendMessage_shouldSendKafkaMessage() throws Exception {
        // GIVEN - A message to send
        String message = "test message";
        // WHEN - Send the message
        mockMvc.perform(post("/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(message))
                // THEN - Verify that the KafkaProducerService was called with the message
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("")));

        verify(kafkaProducerService).send(message);
    }
}