package com.company;

public class Doctor extends Hospital {
    String specialization;
    String name;

    public Doctor(String specialization, String name) {
        this.specialization = specialization;
        this.name = name;
    }
    //Getters and Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
