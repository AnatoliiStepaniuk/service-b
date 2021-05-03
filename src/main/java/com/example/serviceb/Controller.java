package com.example.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/b")
    public String response(){
        return "Response from the Private Service (B) 3.0.0";
    }

}
