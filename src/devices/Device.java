package devices;

public abstract class Device {
    final public String producer;
    final public String model;
    public int yearofproduction;

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + yearofproduction +
                '}';
    }

    public Device(String producer, String model, int year) {
        this.producer = producer;
        this.model = model;
        this.yearofproduction = year;
    }
    abstract public  void turnOn();



}