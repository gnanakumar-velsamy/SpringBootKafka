package com.jarvis.springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private String message;

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consumeMessage(String message){
        this.message =message;
        System.out.println("Received message: "+ message);
    }

    public String getMessage() {
        return message;
    }

}
