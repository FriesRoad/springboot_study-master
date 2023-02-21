package com.test.course01_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @RequestMapping("/springboot")
    public String startSpringBoot(){
        return "welcome to the world of Spring Boot.";
    }
}
