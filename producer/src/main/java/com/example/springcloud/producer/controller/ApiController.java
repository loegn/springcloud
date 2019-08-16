package com.example.springcloud.producer.controller;

import com.example.springcloud.api.service.ApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date : 2019/08/16
 * @author: liangenmao
 */
@RestController
public class ApiController implements ApiService {
    @Value("${server.port}")
    private String port;

    @Override
    public String hello(String name) {
        return "hello " + name + ", this is from " + port;
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
