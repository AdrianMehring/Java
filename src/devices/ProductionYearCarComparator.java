package devices;

import java.util.Comparator;

public class ProductionYearCarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2){

        return car2.yearofproduction - car1.yearofproduction;
    }
}
