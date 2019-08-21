package com.example.springcloud.consumer.service;

import com.example.springcloud.consumer.service.impl.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.example.springcloud.consumer.constant.ApplicationConstant.PRODUCER_NAME;

@Primary
@FeignClient(value = PRODUCER_NAME, contextId = "hello", fallback = HelloRemoteHystrix.class)
public interface HelloRemoteService {

    @GetMapping("/getRequest")
    String get(@RequestParam String name);

    @PostMapping("/postRequest")
    String post(@RequestParam String name);
}
