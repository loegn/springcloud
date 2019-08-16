package com.example.springcloud.consumer.service;

import com.example.springcloud.api.service.ApiService;
import com.example.springcloud.consumer.service.impl.ApiRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;

import static com.example.springcloud.consumer.constant.ApplicationConstant.PRODUCER_NAME;

/**
 * @date : 2019/08/16
 * @author: liangenmao
 */
@Primary
@FeignClient(value = PRODUCER_NAME, contextId = "apiservice", fallback = ApiRemoteHystrix.class)
public interface ApiRemoteService extends ApiService {
}
