package devices;

import com.company.Human;
import com.company.Salleable;

public class Phone extends Device implements Salleable {
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(model, producer, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Podaj odcisk palca");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println("Błąd");
        } else if (buyer.cash < price) {
            System.out.println("Błąd");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Transakcja udana sprzedano"+ this + "za "+price);
        }
    }
}