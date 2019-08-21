package com.example.springcloud.zuul.config;

import com.example.springcloud.zuul.fallback.ConsumerFallbackProvider;
import com.example.springcloud.zuul.fallback.DefaultFallbackProvider;
import com.example.springcloud.zuul.filter.MyPreFilter;
import com.example.springcloud.zuul.filter.MyRouteFilter;
import com.example.springcloud.zuul.filter.MyPostFilter;
import org.springframework.context.annotation.Bean;

//@Configuration
public class FilterConfig {
    @Bean
    public MyPreFilter myFilter() {
        return new MyPreFilter();
    }

    @Bean
    public MyRouteFilter myRouteFilter() {
        return new MyRouteFilter();
    }

    @Bean
    public MyPostFilter postFilter() {
        return new MyPostFilter();
    }
}
