package com.example.restapicall.spring;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloWordController {
    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }
    }

