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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AppController.class)
public class AppControllerGeneratedAiTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private KafkaProducerService kafkaProducerService;

    @Test
    void sendMessage_shouldSendKafkaMessage() throws Exception {
        // GIVEN - A message to send
        String message = "Hello from AppController!";
        // WHEN - Send the message via POST request
        mockMvc.perform(post("/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(message))
                // THEN - Verify the message was sent to Kafka and the response status is OK
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("")));
        verify(kafkaProducerService).send(message);
    }
}