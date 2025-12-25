package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle Name for non-spring context is: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value of Spring context is:"+hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value of Spring context is:"+number);

    }
}
