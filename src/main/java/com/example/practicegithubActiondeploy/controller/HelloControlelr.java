package com.example.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlelr {

    @GetMapping("/")
    public String hello () {
        return "Hello World! Hello BE BootCamp!";
    }
}
