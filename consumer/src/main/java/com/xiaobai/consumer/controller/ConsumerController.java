package com.xiaobai.consumer.controller;

import com.xiaobai.consumer.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private SayHelloService sayHelloService;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return sayHelloService.sayHello("xiaobai");
    }
}
