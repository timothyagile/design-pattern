package Exercise.BT1.ExerciseFactoryMethodPattern.Product;

public class  Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing burger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burger");
    }

    @Override
    public void serve() {
        System.out.println("Serving burger");
    }
}
