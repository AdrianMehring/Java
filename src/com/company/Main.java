package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Human me = new Human();
        me.firstName = "Adrian";

        me.car = new Car("A4","Audi",1992);
        //System.out.println(me.car);
        System.out.println();
        //zad2
        System.out.println("Name:" +me.firstName+",salary "+me.getSalary()+"Zł");
        //zad3,4
        me.setSalary(-343.54);
        me.setSalary(5435.65);



    }
}