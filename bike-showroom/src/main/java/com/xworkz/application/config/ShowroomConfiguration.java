package com.xworkz.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.application")
public class ShowroomConfiguration {

    public ShowroomConfiguration() {

        System.out.println("ShowroomConfiguration Created");
    }
}
