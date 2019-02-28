package com.xiaobai.provider.service.Impl;

import com.xiaobai.provider.service.SayHelloService;
import org.springframework.stereotype.Service;

@Service
public class SayHelloImpl implements SayHelloService {
    public String sayHello(String name){
        return "Hello " + name + "!";
    }
}
