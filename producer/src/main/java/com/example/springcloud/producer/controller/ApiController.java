package com.example.springcloud.producer.controller;

import com.example.springcloud.api.service.ApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ApiController implements ApiService {
    @Value("${server.port}")
    private String port;
    @Value("${neo.hello}")
    private String hello;

    @Override
    public String hello(String name) {
        return hello + ", this is from " + port;
    }

    @Override
    public String get(String name) {
        return "hello " + name + ", this is get request from " + port;
    }

    @Override
    public String post(String name) {
        return "hello " + name + ", this is post request from " + port;
    }
}
