package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Human me = new Human();
        me.firstName = "Adrian";
        Car Audi = new Car("A3","Audi",2021,4344.54);
        //me.car = new Car("A4","Audi",1992);
        //System.out.println(me.car);
        Car Golf = new Car("5","Volkswagen",2012,54444.54);
        Car Fiat = new Car("Punto","Fiat",1993,344.54);
        System.out.println();
        //zad2
        //System.out.println("Name:" +me.firstName+",salary "+me.getSalary()+"Zł");
        //zad3,4
        //me.setSalary(-343.54);
        //me.setSalary(5435.65);

        //zad 5?

        me.getCar();
        System.out.println();
        me.setCar(Audi);
        System.out.println();
        me.setCar(Golf);
        System.out.println();
        me.setCar(Fiat);
    }
}