package com.example.beans;

import org.springframework.stereotype.Component;

//Make it easy to create a bean, instead of use @Bean which you have to white lots of code
@Component
public class Vehicle {

    private String name;

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }

}
