package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {

        //This is an implementation of ApplicationContext interface, you pass the config class,
        //where beans are configured
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //you pass the class of the bean you want to get
        //as a parameter, you can pass the name of the bean before the class in a string, otherwise
        //the bean return will be the default (@Primary) or an exception
        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

    }

}
