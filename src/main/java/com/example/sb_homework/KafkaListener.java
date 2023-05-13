package com.example.sb_homework;

import org.springframework.stereotype.Service;

@Service
public class KafkaListener {

    @KafkaListener(topics = "test-topic", groupId = "test-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
