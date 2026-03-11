package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/name")
    public String greeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        return greetingService.getGreeting(firstName, lastName);
    }
    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }
}