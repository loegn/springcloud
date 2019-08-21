package com.example.springcloud.consumer.controller;

import com.example.springcloud.consumer.service.ApiRemoteService;
import com.example.springcloud.consumer.service.HelloRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    @Autowired
    private HelloRemoteService helloRemoteService;
    @Value("${neo.hello}")
    private String hello;
    @Value("${default}")
    private String defaultValue;

    @Autowired
    private ApiRemoteService apiRemoteService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        String br = "</br>";
        String get = helloRemoteService.get(name);
        String post = helloRemoteService.post(name);
        String api = apiRemoteService.hello(name);
        String apiget = apiRemoteService.get(name);
        String apipost = apiRemoteService.post(name);
        return hello + br + get + br + post + br + api + br + apiget + br + apipost;
    }
}
