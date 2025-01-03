package com.example.kafka.producer.controller;

import com.example.kafka.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("producer")
public class ProducerController {
    @Autowired
    ProducerService producerService;
    @GetMapping
    public String healthCheck(@RequestBody String message){
        producerService.send(message);
        return "Message is sent succesfully";
    }
}
