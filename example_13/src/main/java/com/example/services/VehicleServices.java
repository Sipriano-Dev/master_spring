package com.example.services;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    //Autowired, you can put here too
    private Speaker speaker; //You can put @Qualifier here
    private Tyre tyre;

    public VehicleServices() {
    }

    @Autowired
    //You don't need @Qualifier here, once the chosen bean is mark with @Primary, it is only to show others ways to choose beans
    public VehicleServices(@Qualifier("boseSpeakers") Speaker speaker, @Qualifier("michelin") Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    //You can @Autowire here as well,
    public void setTyre(Tyre tyre/*Qualifier("Michelin")*/) {
        this.tyre = tyre;
    }

    public void start() {
        tyre.rotate();
    }

    public void playSong() {
        speaker.makeSound();
    }


}
