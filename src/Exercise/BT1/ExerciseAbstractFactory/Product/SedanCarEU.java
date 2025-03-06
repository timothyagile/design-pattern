package Exercise.BT1.ExerciseAbstractFactory.Product;

public class SedanCarEU implements SedanCar {
    @Override
    public String getEngine() {
        return "Động cơ Turbo Diesel";
    }

    @Override
    public String getSeat() {
        return "Ghế vải cao cấp";
    }

    @Override
    public String setSize() {
        return "Kích thước: Dài 4.6m, Rộng 1.85m";
    }
}
