package com.jarvis.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    public KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message){
        kafkaProducerService.send(message);
    }
} 

package com.jarvis.springbootkafka.controller;

import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class AppControllerGeneratedAiTests {
    @Test
    void sendMessage() {
        // GIVEN
        AppController appController = new AppController();
        KafkaProducerService kafkaProducerServiceMock = mock(KafkaProducerService.class);
        appController.kafkaProducerService = kafkaProducerServiceMock;
        // WHEN
        appController.sendMessage("Test Message");
        // THEN
        verify(kafkaProducerServiceMock, times(1)).send("Test Message");
    }
}