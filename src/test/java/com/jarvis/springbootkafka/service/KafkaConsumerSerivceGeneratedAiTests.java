package com.jarvis.springbootkafka.service;

import org.junit.jupiter.api.*;
import org.mockito.*;
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
        // GIVEN
        String expectedMessage = "Hello from Kafka!";
        kafkaConsumerSerivce.consumeMessage(new ConsumerRecord<>("my-topic", "my-group", 1, 0, null, null, expectedMessage));
        // WHEN

        // THEN
        assertTrue(latch.await());
    }
}