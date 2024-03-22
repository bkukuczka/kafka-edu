package com.example.kafkaedu.api;

import com.example.kafkaedu.producer.MessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaEduController {

    private final MessageProducer producer;

    public KafkaEduController(MessageProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/message")
    String triggerMessage() {
        producer.sendMessage("quickstart-events", "test message");
        return "received";
    }
}
