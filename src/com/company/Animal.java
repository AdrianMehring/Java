package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;

    static final public double DEFAULT_ANIMAL_WEIGHT = 1.0;
    static final public double DEFAULT_DOG_WEIGHT = 13.0;
    static final public double DEFAULT_CAT_WEIGHT = 4.0;
    static final public double DEFAULT_COW_WEIGHT = 132.0;

    public Animal(String species) {
        this.species = species;


        switch (species){
            case "dog":
                weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                weight = DEFAULT_CAT_WEIGHT;
                break;
            case "cow":
                weight = DEFAULT_COW_WEIGHT;
                break;
            default:
                weight = DEFAULT_ANIMAL_WEIGHT;
                break;

        }

    }

    void feed() {
        if(weight<=0){
            System.out.println("U cant feed death pet"+weight);


        }
        else{
            weight += 1;
            System.out.println("Thx for food, bro"+weight);
        }
    }
    void takeForAWalk(){

        if(weight>=1){
            weight-=1;
            System.out.println("Thx for a walk"+weight);


        }
        else{
            System.out.println("Cant go for a walk with death pet"+weight);
        }

    }
}