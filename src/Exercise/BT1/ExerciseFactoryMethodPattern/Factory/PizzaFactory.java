package Exercise.BT1.ExerciseFactoryMethodPattern.Factory;

import Exercise.BT1.ExerciseFactoryMethodPattern.Product.Food;
import Exercise.BT1.ExerciseFactoryMethodPattern.Product.Pizza;

public class PizzaFactory extends Factory {
    @Override
    public Food createFood() {
        return new Pizza();
    }
}


