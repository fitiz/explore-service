package com.fitiz.explore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/explore")
public class HelloWorldController {
    @GetMapping("/public/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Hello private world!";
    }

}
