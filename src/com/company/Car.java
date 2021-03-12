package com.company;
public class Car {

    final public String model;
    final public String producer;
    public int year;

public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
        }

public Car( String model, String producer, int year) {
        this.model = model;
        this.producer = producer;
        this.year = year;

        }
        }