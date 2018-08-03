package com.example.demo.runner;


import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Batch1 implements ApplicationRunner {

    @Autowired
    HelloService helloService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        if (!applicationArguments.containsOption("Batch1")) return;
        helloService.sayHello();
        System.out.println("=== from Batch 1 ===");
    }
}
