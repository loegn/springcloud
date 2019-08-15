package com.example.springcloud.custom.controller;

import com.example.springcloud.custom.sevice.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @Autowired
    TestService testService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        testService.home("test");
        return helloService.hiService(name);
    }
}
