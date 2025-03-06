package Exercise.BT1.ExerciseAbstractFactory.Product;

public class ElectricCarAS implements ElectricCar {
    @Override
    public String getEngine() {
        return "Động cơ điện 130kW";
    }

    @Override
    public String getSeat() {
        return "Ghế giả da";
    }

    @Override
    public String setSize() {
        return "Kích thước: Dài 4.4m, Rộng 1.8m";
    }
}
