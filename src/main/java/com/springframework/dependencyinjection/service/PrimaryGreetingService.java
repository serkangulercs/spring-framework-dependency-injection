package com.springframework.dependencyinjection.service;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }
}
