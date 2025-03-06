package Exercise.BT1.ExerciseFactoryMethodPattern.Product;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pizza");
    }

    @Override
    public void serve() {
        System.out.println("Serving pizza");
    }
}
