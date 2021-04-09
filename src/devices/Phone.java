package devices;

public class Phone {
    final public String producer;
    final public String model;
    final public Double screenSize;
    final public String operationSystem;

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }

    public Phone(String producer, String model, Double screenSize, String operationSystem) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }
}
