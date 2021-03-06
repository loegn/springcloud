package com.example.springcloud.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @GetMapping("/getRequest")
    public String home(@RequestParam String name) {
        return "hi " + name + ", this is get request and i am from port:" + port;
    }

    @PostMapping("/postRequest")
    public String get(@RequestParam String name){
        return "hi " + name + ", this is post request and i am from port:" + port;
    }
}
