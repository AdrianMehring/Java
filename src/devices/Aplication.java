package devices;

public class Aplication {


    String name;
    String version;
    Double price;

    public Aplication(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Double getPrice() {
        return price;
    }
}
