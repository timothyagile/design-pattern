package Exercise.BT1.ExerciseAbstractFactory;

import Exercise.BT1.ExerciseAbstractFactory.Factory.CarASFactory;
import Exercise.BT1.ExerciseAbstractFactory.Factory.CarEUFactory;
import Exercise.BT1.ExerciseAbstractFactory.Factory.Factory;
import Exercise.BT1.ExerciseFactoryMethodPattern.Factory.BurgerFactory;
import Exercise.BT1.ExerciseFactoryMethodPattern.Factory.PastaFactory;
import Exercise.BT1.ExerciseFactoryMethodPattern.Factory.PizzaFactory;

import java.util.Scanner;

public class AbstractFactory {
    public static void demo() {
        System.out.println("--UIT Factory--");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type of market: ");
        String type = scanner.next();

        Factory factory = createFactory(type);

        Client client = new Client(factory);
        client.operate();
    }

    //--Factory Method--\\

    static Factory createFactory(String typeFactory) {
        Factory factory;
        switch (typeFactory){
            case "asian":
                factory = new CarASFactory();
                return factory;
            case "europian":
                factory = new CarEUFactory();
                return factory;
            default:
                throw new IllegalStateException("Unexpected value: " + typeFactory);
        }
    }
}
