package com.company;

public class Director extends Hospital {
    private String name;
    private String surname;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

