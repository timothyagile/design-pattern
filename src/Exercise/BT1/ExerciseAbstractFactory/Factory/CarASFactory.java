package Exercise.BT1.ExerciseAbstractFactory.Factory;

import Exercise.BT1.ExerciseAbstractFactory.Product.*;

public class CarASFactory extends Factory {
    @Override
    public SedanCar createSedanCar() {
        return new SedanCarAS();
    }

    @Override
    public SUVCar createSUVCar() {
        return new SUVCarAS();
    }

    @Override
    public ElectricCar createElectricCar() {
        return new ElectricCarAS();
    }
}
