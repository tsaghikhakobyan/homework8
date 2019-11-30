package com.company;

public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    //Getters and Setters

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
