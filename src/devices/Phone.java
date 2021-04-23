package devices;

public class Phone extends Device {
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
}