package com.orpheustaken.learning.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author Matheus Fernandes on 5/31/24.
 */
@Component
public class HelloWorld {

    private String greeting = "To be or not to be...";

    public HelloWorld() {
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloWorld that = (HelloWorld) o;
        return Objects.equals(greeting, that.greeting);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(greeting);
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "greeting='" + greeting + '\'' +
                '}';
    }

    public String sayGreeting() {
        return getGreeting();
    }

}
