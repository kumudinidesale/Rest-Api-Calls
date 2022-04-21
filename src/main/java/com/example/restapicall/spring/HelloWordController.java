package com.example.restapicall.spring;

import com.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web")
public class HelloWordController {
    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " From BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From BridgeLabz";
    }
    @PostMapping ("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }
    @PutMapping ("/put/{FirstName}")
    public String sayHelloPut(@PathVariable String FirstName,@RequestParam String lastName) {
        return "Hello" + FirstName + " " + " !";
    }
}
