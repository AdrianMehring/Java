package devices;

import com.company.Human;
import com.company.Salleable;

public abstract class Car extends Device implements Salleable {
    public Double value;



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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this))
            throw new Exception("Sprzedawca nie ma auta");
        if(!buyer.hasFreeParkingLot())
            throw new Exception("Kupujacy nie ma miejsca");
        if(buyer.cash< price)
            throw new Exception("Kupujacy nie ma kasy");
        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash +=price;
        buyer.cash += price;
        System.out.println("sprzedano");
    }

    public abstract void refuel();
}