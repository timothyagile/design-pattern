package FactoryMethodPattern;

public class TruckTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("Transport by Truck");
    }
}
