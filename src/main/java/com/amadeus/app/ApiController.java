package com.amadeus.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value="/api")
public class ApiController {
    @GetMapping("/")
    public String hello() {
        return "Hello World Travel!";
    }
}
