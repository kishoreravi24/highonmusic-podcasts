package com.highonmusic.podcasts.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcasts")
@EnableDiscoveryClient
public class Controller {
    @GetMapping("")
    public String test(){
        return "Hello, from podcasts microservice";
    }
}
