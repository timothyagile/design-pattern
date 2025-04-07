package Exercise.BT6.Iterator.Collection;

import Exercise.BT6.Iterator.Interface.VehicleCollection;
import Exercise.BT6.Iterator.Interface.VehicleInterator;
import Exercise.BT6.Iterator.Iterator.BusIterator;
import Exercise.BT6.Iterator.Vehicle.Bus;

import java.util.ArrayList;
import java.util.List;

public class BusCollection implements VehicleCollection {
    private List<Bus> buses = new ArrayList<>();

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    @Override
    public VehicleInterator createIterator() {
        return new BusIterator(buses);
    }

}
