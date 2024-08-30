package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private final Vehicle vehicle; //You can make it final because @Autowired is in the constructor

    @Autowired
    public Person(Vehicle vehicle) {
        this.name = "Anderson";
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //Once it's a final var, will not accept changes
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }

    public void goingOut() {
        vehicle.getVehicleServices().start();
        vehicle.getVehicleServices().playSong();
    }

}
