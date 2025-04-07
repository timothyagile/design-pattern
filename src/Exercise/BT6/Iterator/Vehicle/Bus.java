package Exercise.BT6.Iterator.Vehicle;

import Exercise.BT6.Iterator.Interface.Vehicle;

public class Bus extends Vehicle {
    public Bus(String vehicleId, String licensePlate, int capacity, String manufacturer) {
        super(vehicleId, "Bus", licensePlate, capacity, manufacturer);
    }
}
