package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class HomeController {

    @Value("${TEST}")
    private String test;

    @GetMapping
    public String home() {
        return test == null ? "hello" : test;
    }

}