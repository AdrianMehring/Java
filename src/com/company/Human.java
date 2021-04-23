package com.company;
import devices.Phone;
import devices.Car;
public class Human extends Animal implements Washable, Comparable<Human> {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private Double salary = 555.43;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Car car;

    public Double cash;

    static final public String SPECIES = "Homo sapiens";

    public Human(){
        super(SPECIES);
    }
    @Override
    public String toString() {
        return "Human{" +
                "salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone='" + phone + '\'' +
                ", car=" + car +
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

    public void getCar() {
    }
        public void setCar(Car car) {
            if (salary > car.value)
            {
                System.out.println("udało się kupić za gotówkę\n "+car.producer+" "+car.model+" "+"Rocznik "+car.yearofproduction);
                this.car = car;
            }
            else if (salary> car.value/12){
                System.out.println("udało się kupić na kredyt\n "+car.producer+""+car.model+" "+"Rocznik "+car.yearofproduction);
                this.car = car;
            }
            else {
                System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }
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
}

