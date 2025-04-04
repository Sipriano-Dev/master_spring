package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//This tell to spring scan this root package for beans to add in context storage
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {


}
