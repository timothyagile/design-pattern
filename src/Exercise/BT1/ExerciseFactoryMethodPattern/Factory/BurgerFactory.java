package Exercise.BT1.ExerciseFactoryMethodPattern.Factory;

import Exercise.BT1.ExerciseFactoryMethodPattern.Product.Burger;
import Exercise.BT1.ExerciseFactoryMethodPattern.Product.Food;

public class BurgerFactory extends Factory {
    @Override
    public Food createFood() {
        return new Burger();
    }
}
