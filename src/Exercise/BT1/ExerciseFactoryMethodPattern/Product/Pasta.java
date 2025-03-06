package Exercise.BT1.ExerciseFactoryMethodPattern.Product;

public class Pasta implements Food{
    @Override
    public void prepare() {
        System.out.println("Preparing pasta");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }

    @Override
    public void serve() {
        System.out.println("Serving pasta");
    }
}
