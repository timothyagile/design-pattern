package Exercise.BT1.ExerciseAbstractFactory.Factory;

import Exercise.BT1.ExerciseAbstractFactory.Product.*;

public class CarEUFactory extends Factory {
    @Override
    public SedanCar createSedanCar() {
        return new SedanCarEU();
    }

    @Override
    public SUVCar createSUVCar() {
        return new SUVCarEU();
    }

    @Override
    public ElectricCar createElectricCar() {
        return new ElectricCarEU();
    }
}
