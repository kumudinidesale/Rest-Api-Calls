package com.example.restapicall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiCallApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiCallApplication.class, args);
        System.out.print("Hello");
    }

}
