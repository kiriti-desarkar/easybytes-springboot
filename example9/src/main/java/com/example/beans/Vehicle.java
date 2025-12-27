package com.example.beans;

public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle Bean created by Spring");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println(
                "Printing Hello from Vehicle Bean"
        );
    }

    @Override
    public String toString(){
        return "Vehicle name is: " + name;
    }

}
