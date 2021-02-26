package com.company;

import java.io.File;

public class Animal {
    String species;
    Double weight;
    String name;
    File pic;
    void feed(){
        weight += 1;
        System.out.println("Thx for food, bro");
    }
}
