package com.example.names_lab.controllers;

import com.example.names_lab.models.Celebration;
import com.example.names_lab.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Celebration getGreeting(@RequestParam(value = "name", defaultValue = "Everyone") String name,
                              @RequestParam(value = "timeOfDay", defaultValue = "Good Afternoon") String timeOfDay) {
        Greeting greeting = new Greeting(name, timeOfDay);
        String message = greeting.toString();
        return new Celebration(message);
    }

    @GetMapping("/greeting/summer")
    public Celebration getSummerGreeting() {
        String message = "Happy Summer Solstice!";
        return new Celebration(message);
    }
}
