package Exercise.BT6.Iterator.Collection;

import Exercise.BT6.Iterator.Interface.VehicleInterator;
import Exercise.BT6.Iterator.Iterator.CarIterator;
import Exercise.BT6.Iterator.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class CarCollection {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public VehicleInterator createIterator() {
        return new CarIterator(cars);
    }
}
