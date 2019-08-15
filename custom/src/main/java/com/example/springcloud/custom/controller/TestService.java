package com.example.springcloud.custom.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @date : 2019/08/15
 * @author: liangenmao
 */
@FeignClient("service-hi")
public interface TestService {
    @RequestMapping("/hi")
    public String home(String name);
}
