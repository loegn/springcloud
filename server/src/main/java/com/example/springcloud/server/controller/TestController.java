package com.example.springcloud.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date : 2019/08/15
 * @author: liangenmao
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
