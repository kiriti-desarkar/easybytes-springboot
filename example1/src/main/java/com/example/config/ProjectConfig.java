package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* Spring @Configuration annotation is part of the Spring Framework.
* Spring Configuration annotation indicates that the class has @Bean definition methods.
* So Spring container can process the class and generate Spring Beans to be used in the application.
 */
@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}
