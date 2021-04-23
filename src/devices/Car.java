package devices;

import com.company.Human;
import com.company.Salleable;

public class Car extends Device implements Salleable {
    public Double value = 32544.00;



    public Car(String model, String producer, int yearofproduction, Double value) {
        super(model,producer,yearofproduction);
        this.yearofproduction = yearofproduction;
        this.value = value;

        }
    @Override
    public void turnOn() {
        System.out.println("Przekręć kluczyk");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car != this) {
            System.out.println("Błąd");
        } else if (buyer.cash < price) {
            System.out.println("Błąd");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.car = seller.car;
            seller.car = null;
            System.out.println("Transakcja udana sprzedano"+ this + "za "+price);
        }
    }
}