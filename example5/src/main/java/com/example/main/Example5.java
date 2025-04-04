package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);

        //The name will be null unlike @Bean, @Component spring creates the bean before we put a name
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
        //This will print because we put it in the class
        veh.printHello();

    }

}
