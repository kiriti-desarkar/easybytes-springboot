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

    @Bean(name="audiVehicle")
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean(value="hondaVehicle")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }


}
