package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final Environment environment;

    @GetMapping
    public String home() {

        String test = environment.getProperty("TEST_KEY");
        return test == null ? "Khong co" : test;
    }

}