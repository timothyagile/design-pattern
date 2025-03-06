package Exercise.BT1.ExerciseFactoryMethodPattern;


import Exercise.BT1.ExerciseFactoryMethodPattern.Factory.BurgerFactory;
import Exercise.BT1.ExerciseFactoryMethodPattern.Factory.Factory;
import Exercise.BT1.ExerciseFactoryMethodPattern.Factory.PastaFactory;
import Exercise.BT1.ExerciseFactoryMethodPattern.Factory.PizzaFactory;

import java.util.Scanner;

public class FactoryMethodExercise {
    private static Factory factory;

    public static void demoFactoryMethod() {
        System.out.println("--UIT Restaurant--");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type of food: ");
        String type = scanner.next();

        createFood(type);
        operate();
    }

    //--Factory Method--\\

    static void createFood(String typeFood) {
        switch (typeFood){
            case "pizza":
                factory = new PizzaFactory();
                break;
            case "burger":
                factory = new BurgerFactory();
                break;
            case "pasta":
                factory = new PastaFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typeFood);
        }
    }

    static void operate() {
        factory.operate();
    }
}
