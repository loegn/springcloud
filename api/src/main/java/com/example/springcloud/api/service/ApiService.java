package com.example.springcloud.api.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ApiService {

    @RequestMapping("/api/hello")
    String hello(@RequestParam("name") String name);

    @GetMapping("/api/get")
    String get(@RequestParam("name") String name);

    @PostMapping("/api/post")
    String post(@RequestParam("name") String name);
}
