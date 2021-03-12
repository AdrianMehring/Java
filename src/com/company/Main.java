package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.car = new Car("A4","Audi",1992);
        System.out.println(me.car);

    }
}