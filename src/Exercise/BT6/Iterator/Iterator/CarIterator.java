package Exercise.BT6.Iterator.Iterator;

import Exercise.BT6.Iterator.Interface.Vehicle;
import Exercise.BT6.Iterator.Interface.VehicleInterator;
import Exercise.BT6.Iterator.Vehicle.Car;

import java.util.List;

public class CarIterator implements VehicleInterator {
    private List<Car> cars;
    private int index = 0;

    public CarIterator(List<Car> cars) {
        this.cars = cars;
        this.cars = cars.stream()
                .sorted((c1, c2) -> c1.getRegistrationDate()
                        .compareTo(c2.getRegistrationDate()))
                .toList();
    }

    @Override
    public boolean hasNext() {
        return index < cars.size();
    }

    @Override
    public Vehicle next() {
        return hasNext() ? cars.get(index++) : null;
    }
}
