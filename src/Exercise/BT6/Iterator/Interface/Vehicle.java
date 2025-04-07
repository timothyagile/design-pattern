package Exercise.BT6.Iterator.Interface;

public class Vehicle {
    protected String vehicleId;
    protected String type;
    protected String licensePlate;
    protected int capacity;
    protected String manufacturer;

    public Vehicle(String vehicleId, String type, String licensePlate, int capacity, String manufacturer) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return vehicleId + " " + type;
    }
}
