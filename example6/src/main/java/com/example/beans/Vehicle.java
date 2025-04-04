package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

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

    @PostConstruct
    //You set a name for the bean that will be managed for IOC container,
    //you can set other things
    public void initialize() {
        this.name = "honda";
    }
    

    public void printHello(){
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }

}
