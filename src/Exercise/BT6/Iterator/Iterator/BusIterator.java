package Exercise.BT6.Iterator.Iterator;

import Exercise.BT6.Iterator.Interface.Vehicle;
import Exercise.BT6.Iterator.Interface.VehicleInterator;
import Exercise.BT6.Iterator.Vehicle.Bus;

import java.util.List;

public class BusIterator implements VehicleInterator {
    private List<Bus> buses;
    private int index = 0;

    public BusIterator(List<Bus> buses) {
        this.buses = buses;
    }

    @Override
    public boolean hasNext() {
        return index < buses.size();
    }

    @Override
    public Vehicle next() {
        return hasNext() ? buses.get(index++) : null;
    }
}
