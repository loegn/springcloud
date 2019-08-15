package com.example.springcloud.custom.controller;

import com.example.springcloud.custom.sevice.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        String get = helloService.get(name);
        String post = helloService.post(name);
        return get + "</br>" + post;
    }
}
