package com.company;
public class Car {

    final public String model;
    final public String producer;
    public int year;
    public Double value = 32544.00;


public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;

        }
    @Override
    public String toString() {
        return "Car{" +
                "\nmodel='" + model + '\'' +
                ", \nproducer='" + producer + '\'' +
                ", \nvalue=" + value +
                '}';
    }
public Car( String model, String producer, int year,Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;

        }
        }