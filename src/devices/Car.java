package devices;
public class Car extends Device {
    public Double value = 32544.00;



    public Car(String model, String producer, int yearofproduction, Double value) {
        super(model,producer,yearofproduction);
        this.yearofproduction = yearofproduction;
        this.value = value;

        }


}