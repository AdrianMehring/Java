package com.company.Animal;
import com.company.Human;
import com.company.Salleable;

public abstract class Animal implements Salleable,Feedable {
    final public String species;
    public String name;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double weight;

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    static final public double DEFAULT_ANIMAL_WEIGHT = 1.0;
    static final public double DEFAULT_DOG_WEIGHT = 13.0;
    static final public double DEFAULT_CAT_WEIGHT = 4.0;
    static final public double DEFAULT_COW_WEIGHT = 132.0;

    public Animal(String species) {
        this.species = species;


        switch (species) {
            case "dog" -> weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> weight = DEFAULT_CAT_WEIGHT;
            case "cow" -> weight = DEFAULT_COW_WEIGHT;
            default -> weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }

    public void feed() {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet!= this){
            System.out.println("Nie możesz sprzedać czegos czego nie posiadasz");

        }
        else if(buyer.cash<price){
            System.out.println("Nie stać Cię");

        }
        else{
            seller.cash +=price;
            buyer.cash -=price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transakcja udana sprzedano"+ this + "za "+price);
        }
    }

}