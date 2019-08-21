package com.example.springcloud.zuul.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {
    @RequestMapping("/error")
    public String error(){
        return "throw error";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
