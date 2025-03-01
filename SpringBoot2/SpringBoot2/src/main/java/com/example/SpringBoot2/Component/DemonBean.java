package com.example.SpringBoot2.Component;

import org.springframework.stereotype.Component;

@Component
public class DemonBean {

    public String sayHello() {
        return "Hello from DemoBean!";
    }

    @Override
    public String toString() {
        return "DemoBean is initialized!";
    }
}