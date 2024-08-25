package com.example.springhelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/world")
    public String world() {
        return "Hello World!";
    }
}