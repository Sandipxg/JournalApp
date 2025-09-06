package com.project1.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class health {

    @GetMapping("/health-check")
    public String healthchk(){
        return "OK";
    }
}
