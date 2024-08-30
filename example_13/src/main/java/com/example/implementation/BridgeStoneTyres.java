package com.example.implementation;

import com.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component("bridgeStone") //You don't need to put value =
public class BridgeStoneTyres implements Tyre {


    @Override
    public void rotate() {
        System.out.println("Bridge Stone Rotating");
    }
}
