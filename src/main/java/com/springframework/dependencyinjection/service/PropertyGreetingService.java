package com.springframework.dependencyinjection.service;

public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property!";
    }
}
