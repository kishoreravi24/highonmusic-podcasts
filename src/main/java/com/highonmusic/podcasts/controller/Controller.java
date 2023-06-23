package com.highonmusic.podcasts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcasts")
public class Controller {
    @GetMapping("/")
    public String test(){
        return "Hello, from podcasts microservice";
    }
}
