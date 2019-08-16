package com.example.springcloud.consumer.controller;

import com.example.springcloud.consumer.sevice.HelloRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date : 2019/08/15
 * @author: liangenmao
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemoteService helloRemoteService;
    @Value("${neo.hello}")
    private String hello;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        String get = helloRemoteService.get(name);
        String post = helloRemoteService.post(name);
        return get + "</br>" + post;
    }
}
