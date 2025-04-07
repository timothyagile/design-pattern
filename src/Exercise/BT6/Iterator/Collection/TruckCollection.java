package Exercise.BT6.Iterator.Collection;

import Exercise.BT6.Iterator.Interface.VehicleCollection;
import Exercise.BT6.Iterator.Interface.VehicleInterator;
import Exercise.BT6.Iterator.Iterator.TruckIterator;
import Exercise.BT6.Iterator.Vehicle.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckCollection implements VehicleCollection {
    private List<Truck> trucks = new ArrayList<>();

    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    public VehicleInterator createIterator() {
        return new TruckIterator(trucks);
    }
}
