package com.example.implementation;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "michelin")
@Primary
public class MichelinTyres implements Tyre {

    @Override
    public void rotate() {
        System.out.println("Michelin rotating");
    }
}
