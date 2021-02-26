package com.company;

import java.io.File;

public class Animal {
    final public String species;
    public String name;
    public File pic;
    private Double weight;

    public Animal(String species, Double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    void feed() {
        weight += 1;
        System.out.println("Thx for food, bro");
    }
}