package com.example.implementation;

import com.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker {


    @Override
    public void makeSound() {
        System.out.println("Bose Playing");
    }
}
