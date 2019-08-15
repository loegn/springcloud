package com.example.springcloud.custom.sevice.impl;

import com.example.springcloud.custom.sevice.HelloRemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @date : 2019/08/15
 * @author: liangenmao
 */
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