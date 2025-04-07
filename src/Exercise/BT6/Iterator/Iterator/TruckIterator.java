package Exercise.BT6.Iterator.Iterator;

import Exercise.BT6.Iterator.Interface.Vehicle;
import Exercise.BT6.Iterator.Interface.VehicleInterator;
import Exercise.BT6.Iterator.Vehicle.Truck;

import java.util.List;

public class TruckIterator implements VehicleInterator {
    private List<Truck> trucks;
    private int index = 0;

    public TruckIterator(List<Truck> trucks) {
        this.trucks = trucks;
    }

    @Override
    public boolean hasNext() {
        while (index < trucks.size()) {
            if (trucks.get(index).getLoadCapacity() > 10) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Vehicle next() {
        return hasNext() ? trucks.get(index++) : null;
    }
}
