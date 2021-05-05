package com.example.serviceb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${REPLY:hm?}")
    private String reply;

    @GetMapping(path = "/b")
    public String response(){
        return "Service B (Private) 5.0.1: " + reply;
    }

}
