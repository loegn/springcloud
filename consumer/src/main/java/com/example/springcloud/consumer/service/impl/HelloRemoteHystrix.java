package com.example.springcloud.consumer.service.impl;

import com.example.springcloud.consumer.service.HelloRemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemoteService {
    @Override
    public String get(@RequestParam String name) {
        return "hello " + name + ", get request is failed";
    }

    @Override
    public String post(@RequestParam String name) {
        return "hello " + name + ", post request is failed";
    }
}
