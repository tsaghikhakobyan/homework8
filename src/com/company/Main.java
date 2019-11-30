package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //region 8.1-8.13
        //8.1
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Orange");
        colours.add("Black");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Red");
        System.out.println(colours);
        /*or, second version to display
        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i));
        }*/
        //8.2 insert an element into the existing  array list at the first position
        colours.add(0, "White");
        System.out.println(colours);
        //8.3 retrieve an element
        colours.get(2);
        //8.4 remove the third element from a array list.
        colours.remove(2);
        //8.5 copy one array list into another
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Italy");
        countries.add("China");
        Collections.copy(colours, countries);
        System.out.println(colours);
        //8.6 reverse elements in an array list
        Collections.reverse(colours);
        System.out.println(colours);
        //8.7 join two array lists
        colours.addAll(countries);
        System.out.println(colours);
        //8.8  empty an array list.
        colours.clear();
        //remove  all even numbers from array list
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(13);
        numbers.add(20);
        numbers.add(2);
        numbers.add(21);
        numbers.add(5);
        for (int i = 0; i < numbers.size(); i++) {
            while (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
        //8.10
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Tommy"));
        dogs.add(new Dog("Crazy"));
        dogs.add(new Dog("Bethoven"));
        dogs.add(new Dog("Sevuk"));
        for (int i = 0; i < dogs.size(); i++) {
            System.out.print(dogs.get(i).getName() + " ");
        }
        System.out.println();
        //8.11
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Catcat"));
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Pnjik"));
        for (int i = 0; i < cats.size(); i++) {
            System.out.print(cats.get(i).getName() + " ");
        }
        System.out.println();
        //8.12
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat("catA"));
        animals.add(new Cat("catB"));
        animals.add(new Cat("catC"));
        animals.add(new Cat("catD"));
        animals.add(new Dog("dogA"));
        animals.add(new Dog("dogB"));
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i).getName() + " ");
        }
        //endregion
        ArrayList<Hospital> nairiBK = new ArrayList<Hospital>();
        nairiBK.add(new Director("John", "Smith"));
        nairiBK.add(new Doctor("pediatrician", "Grigor Grigoryan"));
        nairiBK.add(new Doctor("cardiologist", "Lilit Gasparyan"));
        nairiBK.add(new Doctor("neurologist", "Davit Davtyan"));
        nairiBK.add(new Patient("Kate Johnson", 145));
        nairiBK.add(new Patient("John Benson", 315));
    }
}

