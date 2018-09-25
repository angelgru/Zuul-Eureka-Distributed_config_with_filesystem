package com.angel.discoveryclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${zone}")
    private String zone ;

    @GetMapping("/ping")
    public String ping() {
        return "I'm in zone " + zone;
    }
}
