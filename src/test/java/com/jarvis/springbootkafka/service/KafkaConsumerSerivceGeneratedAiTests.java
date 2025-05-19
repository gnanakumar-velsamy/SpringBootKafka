package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.ConsumerFactory;

import java.util.concurrent.CountDownLatch;

import static org.junit.jupiter.api.Assertions.*;


class KafkaConsumerSerivceGeneratedAiTests {

    @InjectMocks
    private KafkaConsumerSerivce kafkaConsumerSerivce;

    @Mock
    private ConsumerFactory<String, String> consumerFactory;

    private CountDownLatch latch = new CountDownLatch(1);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void consumeMessage() {
        // GIVEN - A message to be consumed
        String message = "Hello from Kafka!";

        // WHEN - The message is consumed by the service
        kafkaConsumerSerivce.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 1L, 1L, "key", message));

        // THEN - The message is printed to the console
        assertTrue(latch.await());
    }
}