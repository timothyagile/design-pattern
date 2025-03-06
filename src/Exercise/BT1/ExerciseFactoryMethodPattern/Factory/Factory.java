package Exercise.BT1.ExerciseFactoryMethodPattern.Factory;

import Exercise.BT1.ExerciseFactoryMethodPattern.Product.Food;

public abstract class Factory {
    public abstract Food createFood();
    public void operate () {
        Food food = createFood();
        food.prepare();
        food.cook();
        food.serve();
    }
}
