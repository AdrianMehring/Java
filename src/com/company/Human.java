package com.company;

public class Human {
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

    protected String phone;
    private Car car;
    public void getCar() {
    }

        public void setCar(Car car) {
            if (salary > car.value)
            {
                System.out.println("udało się kupić za gotówkę\n "+car.producer+" "+car.model+" "+"Rocznik "+car.year);

            }
            else if (salary> car.value/12){
                System.out.println("udało się kupić na kredyt\n "+car.producer+""+car.model+" "+"Rocznik "+car.year);

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

