package Exercise.BT6.Iterator;

import Exercise.BT6.Iterator.Collection.BusCollection;
import Exercise.BT6.Iterator.Collection.CarCollection;
import Exercise.BT6.Iterator.Collection.TruckCollection;
import Exercise.BT6.Iterator.Interface.VehicleInterator;
import Exercise.BT6.Iterator.Vehicle.Bus;
import Exercise.BT6.Iterator.Vehicle.Car;
import Exercise.BT6.Iterator.Vehicle.Truck;

import java.util.Date;

public class IteratorClient {
    public static void main(String[] args) {
        BusCollection busCollection = new BusCollection();
        busCollection.addBus(new Bus("B001", "ABC-123", 50, "Mercedes"));
        busCollection.addBus(new Bus("B002", "XYZ-789", 40, "Volvo"));

        TruckCollection truckCollection = new TruckCollection();
        truckCollection.addTruck(new Truck("T001", "DEF-456", 2, "Isuzu", 15));
        truckCollection.addTruck(new Truck("T002", "GHI-321", 2, "Toyota", 8));

        CarCollection carCollection = new CarCollection();
        carCollection.addCar(new Car("C001", "JKL-654", 4, "Toyota", new Date(1672531200000L))); // 1 Jan 2022
        carCollection.addCar(new Car("C002", "MNO-987", 4, "Honda", new Date(1640995200000L))); // 1 Jan 2023

        System.out.println("Duyệt qua xe buýt:");
        VehicleInterator busIterator = busCollection.createIterator();
        while (busIterator.hasNext()) {
            System.out.println(busIterator.next().toString());
        }

        System.out.println("\nDuyệt qua xe tải (trọng tải > 10 tấn):");
        VehicleInterator truckIterator = truckCollection.createIterator();
        while (truckIterator.hasNext()) {
            System.out.println(truckIterator.next().toString());
        }

        System.out.println("\nDuyệt qua xe hơi theo ngày đăng ký:");
        VehicleInterator carIterator = carCollection.createIterator();
        while (carIterator.hasNext()) {
            System.out.println(carIterator.next().toString());
        }
    }
}
