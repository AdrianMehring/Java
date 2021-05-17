package devices;

public class Diesel extends Car {

    public Diesel(String model, String producer, int yearofproduction, Double value) {
        super(model, producer, yearofproduction, value);
    }


    @Override
    public void refuel() {
        System.out.println("Zatankowano samochód");
    }
}