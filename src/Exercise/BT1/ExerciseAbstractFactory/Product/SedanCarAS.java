package Exercise.BT1.ExerciseAbstractFactory.Product;

public class SedanCarAS implements SedanCar{
    @Override
    public String getEngine() {
        return "Động cơ xăng tiết kiệm";
    }

    @Override
    public String getSeat() {
        return "Ghế nỉ";
    }

    @Override
    public String setSize() {
        return "Kích thước: Dài 4.5m, Rộng 1.8m";
    }
}
