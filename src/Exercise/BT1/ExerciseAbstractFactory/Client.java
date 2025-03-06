package Exercise.BT1.ExerciseAbstractFactory;

import Exercise.BT1.ExerciseAbstractFactory.Factory.Factory;
import Exercise.BT1.ExerciseAbstractFactory.Product.ElectricCar;
import Exercise.BT1.ExerciseAbstractFactory.Product.SUVCar;
import Exercise.BT1.ExerciseAbstractFactory.Product.SedanCar;

public class Client {
    private final Factory factory;

    public Client (Factory factory) {
        this.factory = factory;
    }

    public void operate() {
        factory.operate();
    }
}
