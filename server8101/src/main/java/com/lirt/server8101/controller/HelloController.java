package com.lirt.server8101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("hello")
    public String hello () {
        String url = "http://serverPro/hello";
        String s = restTemplate.getForObject(url, String.class);
        return "hello,i'm server8101!正在调用服务"+s;
    }
}
