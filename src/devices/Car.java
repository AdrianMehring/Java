package devices;

import com.company.Human;
import com.company.Salleable;
import java.util.ArrayList;
public abstract class Car extends Device implements Salleable {
    public Double value;
    public ArrayList<Human> Owner = new ArrayList<>();


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
    //Aktualny własciciel
    public Human Current(){
        if(Owner.isEmpty())
            return null;
        else
            return  Owner.get(Owner.size()-1);
    }
    //Dodawanie człowieka do listy
    public void addOwner(Human human)
    {
        Owner.add(human);
    }
    //czy ktoś był włascicielem
    public boolean wasTheOwner(Human human){
        return Owner.contains(human);
    }
    //liczba transakcji
    public Integer NumberofTransactions(){
        return Owner.size() /2;
        //przez 2 bo są 2 osoby podczas 1 transakcji
    }
    public boolean isBuyerSoldCar(Human buyer, Human seller){
        return Owner.lastIndexOf(seller) == Owner.lastIndexOf(buyer);
    }
    public abstract void refuel();
}