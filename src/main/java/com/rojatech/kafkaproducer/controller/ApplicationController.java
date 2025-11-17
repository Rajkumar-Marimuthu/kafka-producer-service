package com.rojatech.kafkaproducer.controller;

import com.rojatech.kafkaproducer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {


    final private KafkaProducerService kafkaProducerService;

    public ApplicationController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestParam String message) {
        kafkaProducerService.sendMessage("my-topic", message);
    }
}
