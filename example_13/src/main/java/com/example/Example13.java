package com.example;

import com.example.beans.Person;
import com.example.config.ConfigProject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigProject.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Person car's name: " + person.getVehicle().getName());

        person.goingOut();

        String[] personsName = context.getBeanNamesForType(Person.class);
        for (String name : personsName) {
            System.out.println(name);
        }

    }

}
