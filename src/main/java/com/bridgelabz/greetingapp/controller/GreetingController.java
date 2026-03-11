package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String greeting() {
        return greetingService.getGreeting();
    }
}