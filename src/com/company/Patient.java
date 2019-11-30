package com.company;

public class Patient extends Hospital {
    String name;
    int numberRoom;

    public Patient(String name, int numberRoom) {
        this.name = name;
        this.numberRoom = numberRoom;
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

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }
}
