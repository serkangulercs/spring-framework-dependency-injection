package com.springframework.dependencyinjection.service;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor!";
    }
}
