package com.example.implementation;

import com.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //If you not choose the bean name in @Qualifier, this bean will be choose by IoC container
public class SonySpeakers implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Sony Playing");
    }
}
