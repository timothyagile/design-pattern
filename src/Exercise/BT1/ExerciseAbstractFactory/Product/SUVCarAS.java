package Exercise.BT1.ExerciseAbstractFactory.Product;

public class SUVCarAS implements SUVCar {
    @Override
    public String getEngine() {
        return "Động cơ xăng Hybrid";
    }

    @Override
    public String getSeat() {
        return "Ghế da tổng hợp";
    }

    @Override
    public String setSize() {
        return "Kích thước: Dài 4.7m, Rộng 1.9m";
    }
}
