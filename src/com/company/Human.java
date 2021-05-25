package com.company;
import com.company.Animal.Animal;
import devices.Phone;
import devices.Car;
import devices.ProductionYearCarComparator;

import java.util.Arrays;

public class Human extends Animal implements Washable, Comparable<Human> {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private Double salary = 555.43;
    private static final int DEFAULT_GARAGE_SIZE = 3;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Car[] garage;
    public Double cash;
    static final public String SPECIES = "Homo sapiens";

    public Human() {
        super(SPECIES);
        this.garage = new Car[DEFAULT_GARAGE_SIZE];

    }
    @Override
    public String toString() {
        return "Human{" +
                "salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone='" + phone + '\'' +
                ", car=" + garage +
                '}';
    }

    @Override
    public void wash() {
        System.out.println("Myju mmujy");
    }

    @Override
    public void dry() {
        System.out.println("Szzzzzz");
    }

    @Override
    public int compareTo(Human otherHuman) {
        return 0;//(Double) (this.weight-otherHuman.weight);
    }

    public Car getCar(Integer parkingPlaceNumber ) {
        return this.garage[parkingPlaceNumber];
    }


    public void setCar(Car car,Integer parkingPlaceNumber) {
            this.garage[parkingPlaceNumber] = car;
        }

    public Double getGarageValue(){
        Double value = 1000.0;
        for (Car car : garage) {
            if (car.value != null) {
                value += car.value;
            }
        }
        return value;
    }


    public double getSalary() {
        System.out.println("Data pobrania "+java.time.LocalDateTime.now());
        System.out.println(this.salary);
        return this.salary;
    }
    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("nowe dane zostały wysłane do systemu księgowego");
            System.out.println("odebranie aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = salary;
            System.out.println(salary+"zł");
        }
        else {
            System.out.println("Wynagrodzenie nie moze być na "+salary);
        }
    }

    @Override
    public void feed(double foodWeight) {

    }

    public boolean hasCar(Car newCar) {
        for(Car car:garage){
            if(car == newCar)
                return true;
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for(Car car: garage){
            if(car==null)
                return true;
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for(int i =0;i<garage.length;i++){
            if(garage[i]==carToRemove)
                garage[i] =null;
        }
    }

    public void addCar(Car newCar) {
        for(int i = 0; i <garage.length;i++){
            if(garage[i]==null)
                garage[i]= newCar;
            return;
        }
    }
    public void sortCars(){
        Arrays.sort(garage, new ProductionYearCarComparator());
    }
}

