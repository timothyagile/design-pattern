package Exercise.BT2.BuilderPattern;

public interface Builder {
    Builder setProtein(String protein);
    Builder setCarbohydrate(String carbohydrate);
    Builder setVegetable(String vegetable);
    Builder setBeverage(String beverage);
    DietPlan build();
}
