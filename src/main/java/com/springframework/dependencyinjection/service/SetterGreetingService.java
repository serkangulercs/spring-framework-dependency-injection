package com.springframework.dependencyinjection.service;

public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter!";
    }
}
