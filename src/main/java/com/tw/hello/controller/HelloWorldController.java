package com.tw.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    private String homePage() {
        Greeter greeter = new Greeter();
        return greeter.sayHelloWorld() + " The current local time is: " + LocalTime.now();
    }
}
