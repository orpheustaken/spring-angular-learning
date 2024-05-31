package com.orpheustaken.learning.service;

import com.orpheustaken.learning.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Matheus Fernandes on 5/31/24.
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    private final HelloWorld helloWorld;

    @Autowired
    public HelloWorldServiceImpl(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String sayGreeting() {
        return helloWorld.sayGreeting();
    }

}
