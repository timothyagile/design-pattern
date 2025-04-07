package Exercise.BT6.Iterator.Vehicle;

import Exercise.BT6.Iterator.Interface.Vehicle;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String vehicleId, String licensePlate, int capacity, String manufacturer, int loadCapacity) {
        super(vehicleId, "Truck", licensePlate, capacity, manufacturer);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
