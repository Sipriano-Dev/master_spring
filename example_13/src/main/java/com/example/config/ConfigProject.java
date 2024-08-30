package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//You can use this in many packages, only if all the classes will be bean
@ComponentScan(basePackages = {
        "com.example.implementation",
        "com.example.services"})
//You put the name of class complete, don't need "
//In this way this package can have other classes that are not beans
//It's more efficient to IoC container
@ComponentScan(basePackageClasses = {
        com.example.beans.Person.class,
        com.example.beans.Vehicle.class
})
public class ConfigProject {


}
