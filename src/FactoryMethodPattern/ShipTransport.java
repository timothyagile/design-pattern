package FactoryMethodPattern;

public class ShipTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("Transport by ship");
    }
}
