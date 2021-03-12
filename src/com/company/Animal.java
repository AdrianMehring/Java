package com.company;

import java.io.File;

public class Animal {
    final public String species;
    public String name;
    private Double weight;

    public Animal(String species, Double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    void feed() {
        if(weight<=0){
            System.out.println("U cant feed death pet");


        }
        else{
            weight += 1;
            System.out.println("Thx for food, bro");
        }
    }
    void takeForAWalk(){

        if(weight>=1){
            weight-=1;
            System.out.println("Thx for a walk");


        }
        else{
            System.out.println("Cant go for a walk with death pet");
        }

    }
}