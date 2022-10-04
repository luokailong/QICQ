package com.kll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/ok")
    public String hello(){
        System.out.println("hello word!");
        return "ok";
    }

    @GetMapping("/user")
    public String user(){
        System.out.println("user");
        return "user";
    }
}
