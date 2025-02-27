package FactoryMethodPattern;

public abstract class Logistic {
    public abstract Transport createTransport();
    public void delivery () {
        Transport transport = createTransport();
        transport.deliver();
    }
}
