package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Welcome to your Spring " +
                "Boot app!" +
                " Are changes being tracked" +
                " in real time though?";

    }
}
