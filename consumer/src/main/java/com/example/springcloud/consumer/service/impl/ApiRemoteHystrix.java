package com.example.springcloud.consumer.service.impl;

import com.example.springcloud.consumer.service.ApiRemoteService;
import org.springframework.stereotype.Component;

@Component
public class ApiRemoteHystrix implements ApiRemoteService {
    @Override
    public String hello(String name) {
        return "request failed";
    }

    @Override
    public String get(String name) {
        return "request failed";
    }

    @Override
    public String post(String name) {
        return "request failed";
    }
}
