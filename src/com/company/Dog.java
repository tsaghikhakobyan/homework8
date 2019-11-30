package com.company;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    //Getters and setters

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

