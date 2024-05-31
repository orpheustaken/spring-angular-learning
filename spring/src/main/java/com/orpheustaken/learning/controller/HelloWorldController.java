package com.orpheustaken.learning.controller;

import com.orpheustaken.learning.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matheus Fernandes on 5/31/24.
 */
@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    // Annotation not obligatory:
    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/")
    public String index() {
        return helloWorldService.sayGreeting();
    }

}
