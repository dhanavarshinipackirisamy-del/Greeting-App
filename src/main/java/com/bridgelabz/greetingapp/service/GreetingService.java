package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    public String getGreeting(String firstName, String lastName) {

        if(firstName != null && lastName != null)
            return "Hello " + firstName + " " + lastName;

        if(firstName != null)
            return "Hello " + firstName;

        if(lastName != null)
            return "Hello " + lastName;

        return "Hello World";
    }
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }


    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
    public Greeting updateGreeting(Long id, String message) {

        Greeting greeting = greetingRepository.findById(id).orElse(null);

        if(greeting != null){
            greeting.setMessage(message);
            return greetingRepository.save(greeting);
        }

        return null;
    }
    public String deleteGreeting(Long id) {

        greetingRepository.deleteById(id);

        return "Greeting deleted successfully";
    }
}