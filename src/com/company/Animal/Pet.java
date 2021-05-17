package com.company.Animal;



public class Pet extends Animal {

    public Pet(String species) {
        super(species);
    }
    @Override
    public void feed(double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.print("Thx for food, bro. My weight is now " + this.weight + "\n");
        } else
            System.out.print("Your pet died. You monster!\n");
    }
}
