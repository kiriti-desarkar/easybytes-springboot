package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle){
        System.out.println("Person Bean created by Spring");
        this.vehicle = vehicle;
    }

    private String name="Lucy";

//    @Autowired
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

//    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

}
