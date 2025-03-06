package Exercise.BT1.ExerciseAbstractFactory.Product;

public class ElectricCarEU implements ElectricCar{
    @Override
    public String getEngine() {
        return "Động cơ điện 150kW";
    }

    @Override
    public String getSeat() {
        return "Ghế tái chế Eco";
    }

    @Override
    public String setSize() {
        return "Kích thước: Dài 4.5m, Rộng 1.85m";
    }
}
