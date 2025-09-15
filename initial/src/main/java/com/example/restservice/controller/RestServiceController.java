package com.example.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {

    @GetMapping("/")
    public String index() {
        return "Welcome to your Spring " +
                "Boot app!" +
                " HPE Forage Job Sim";

    }
}

