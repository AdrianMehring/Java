package com.company;
import java.time.LocalDateTime;
public class Human {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private Double salary;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    protected String phone;

    public double getSalary() {
        System.out.println("Data pobrania "+java.time.LocalDateTime.now());

        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("nowe dane zostały wysłane do systemu księgowego");
            System.out.println("odebranie aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = salary;

        }
    }
}

