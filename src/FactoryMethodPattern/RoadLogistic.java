package FactoryMethodPattern;

public class RoadLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new TruckTransport();
    }
}


