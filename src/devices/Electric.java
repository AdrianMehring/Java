package devices;

public class Electric extends Car {
    public Electric(String model, String producer, int yearofproduction, Double value) {
        super(model, producer, yearofproduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Naładowano samochód");
    }
}
