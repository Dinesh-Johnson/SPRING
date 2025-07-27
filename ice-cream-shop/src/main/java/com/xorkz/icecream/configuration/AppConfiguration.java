package com.xorkz.icecream.configuration;

import com.xorkz.icecream.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
