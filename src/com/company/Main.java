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
        me.setSalary(313.00);

        System.out.println("Name:" +me.firstName+",salary "+me.getSalary()+"Zł");



    }
}