package com.example.springcloud.custom.sevice;

import com.example.springcloud.custom.sevice.impl.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @date : 2019/08/15
 * @author: liangenmao
 */
@FeignClient(value = "provider-hi", fallback = HelloRemoteHystrix.class)
public interface HelloRemoteService {

    @GetMapping("/getRequest")
    String get(@RequestParam String name);

    @PostMapping("/postRequest")
    String post(@RequestParam String name);
}
