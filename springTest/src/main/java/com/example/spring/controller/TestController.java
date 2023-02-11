package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wqm
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World !";
    }
}
