package Exercise.BT6.Iterator.Vehicle;

import Exercise.BT6.Iterator.Interface.Vehicle;

import java.util.Date;

public class Car extends Vehicle {
    private Date registrationDate; // Ngày đăng ký xe

    public Car(String vehicleId, String licensePlate, int capacity, String manufacturer, Date registrationDate) {
        super(vehicleId, "Car", licensePlate, capacity, manufacturer);
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
