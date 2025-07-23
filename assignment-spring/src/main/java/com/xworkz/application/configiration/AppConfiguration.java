package com.xworkz.application.configiration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.application")
public class AppConfiguration {

    public AppConfiguration() {
        System.out.println("AppConfiguration Created...");
    }
}
