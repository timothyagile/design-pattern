package Exercise.BT1.ExerciseAbstractFactory.Product;

public class SUVCarEU implements SUVCar{
    @Override
    public String getEngine() {
        return "Động cơ Diesel Euro6";
    }

    @Override
    public String getSeat() {
        return "Ghế da cao cấp có sưởi";
    }

    @Override
    public String setSize() {
        return "Kích thước: Dài 4.8m, Rộng 2m";
    }
}
