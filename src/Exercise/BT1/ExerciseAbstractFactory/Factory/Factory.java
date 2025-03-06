package Exercise.BT1.ExerciseAbstractFactory.Factory;

import Exercise.BT1.ExerciseAbstractFactory.Product.*;

public abstract class Factory {
    public abstract SedanCar createSedanCar();
    public abstract SUVCar createSUVCar();
    public abstract ElectricCar createElectricCar();

    public void operate() {
        SedanCar sedanCar = createSedanCar();
        SUVCar suvCar = createSUVCar();
        ElectricCar electricCar = createElectricCar();

        System.out.println("Sedan car info: " + sedanCar.getEngine()
                + sedanCar.getSeat() + sedanCar.setSize());
        System.out.println("SUV car info: " + suvCar.getEngine()
                + suvCar.getSeat() + suvCar.setSize());
        System.out.println("Electric car info: " + electricCar.getEngine()
                + electricCar.getSeat() + electricCar.setSize());
    }
}
