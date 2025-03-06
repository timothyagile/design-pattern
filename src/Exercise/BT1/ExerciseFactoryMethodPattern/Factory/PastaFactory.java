package Exercise.BT1.ExerciseFactoryMethodPattern.Factory;

import Exercise.BT1.ExerciseFactoryMethodPattern.Product.Food;
import Exercise.BT1.ExerciseFactoryMethodPattern.Product.Pasta;

public class PastaFactory extends Factory{
    @Override
    public Food createFood() {
        return new Pasta();
    }
}
