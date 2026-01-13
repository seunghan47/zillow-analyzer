package com.house.analyzer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping ("/")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping("/item")
    public void postItem() {

    }
}

