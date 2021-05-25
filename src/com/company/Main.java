package com.company;
import com.company.Animal.Animal;
import devices.Car;
import devices.Phone;
import devices.Diesel;
import devices.Electric;
import devices.LPG;
//import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Date date = new Date();
        Human me = new Human();
        Animal burek = new Animal("cow") {
            @Override
            public void feed(double foodWeight) {

            }
        };
        Phone Apple = new Phone ("Apple","I5",2021,5.0,"IOS");
        me.firstName = "Adrian";
        LPG Audi = new LPG("A3", "Audi", 2021, 4344.54) {
            @Override
            public void refuel() {

            }
        };
        //me.car = new Car("A4","Audi",1992);
        //System.out.println(me.car);
        Car Golf = new Diesel("5", "Volkswagen", 2012, 54444.54) {
            @Override
            public void refuel() {

            }
        };
        Car Fiat = new Electric("Punto", "Fiat", 1993, 344.54) {
            @Override
            public void refuel() {

            }
        };

        System.out.println();
        //zad2
        //System.out.println("Name:" +me.firstName+",salary "+me.getSalary()+"Zł");
        //zad3,4
        //me.setSalary(-343.54);
        //me.setSalary(5435.65);

        //zad 5?
        //me.getCar();
        //System.out.println();
        //me.setCar(Audi);
        //System.out.println();
        //me.setCar(Golf);
        //System.out.println();
        //me.setCar(Fiat);
        //System.out.println();

        //Zadanie 6
        //System.out.println(burek);
        // System.out.println(Apple);
        // System.out.println(Golf);





        //Zadanie 7,8
        //System.out.println(me instanceof Human);
        //System.out.println(me instanceof com.company.Animal);
        //System.out.println(Apple.model);
        //System.out.println(Apple.producer);
        Apple.turnOn();
        Audi.turnOn();


        //Human Adrian = new Human();
        //Adrian.cash = 0.0;
       // Adrian.pet= new Animal("dog") {
           // @Override
            //public void feed(double foodWeight) {

            //}
       // };

        //Human Brother = new Human();
        //Brother.cash = 1000.0;
        //Adrian.pet.sell(Adrian,Brother,300.0);

        me.getSalary();
        me.setSalary(3000.0);
        me.getSalary();

        System.out.println(me.getCar(1));
        me.setCar(Audi,1);
        System.out.println(me.getCar(1));

        me.garage[1] = Audi;
        me.garage[0] = Golf;

        System.out.println(("Garaż"));




    }
}