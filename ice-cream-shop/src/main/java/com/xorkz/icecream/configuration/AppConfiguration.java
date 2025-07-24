package com.xorkz.icecream.configuration;

import com.xorkz.icecream.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan("com.xorkz.icecream")
public class AppConfiguration{


    public AppConfiguration() {
        System.out.println("AppConfiguration Created.....");
    }
    @Bean
    public OrderServiceImpl service() {
        return new OrderServiceImpl();
    }
}
