package Exercise.BT2.BuilderPattern;

public class DietPlanBuilder implements Builder {

    String protein;
    String carbohydrate;
    String vegetable;
    String beverage;

    @Override
    public Builder setProtein(String protein) {
        this.protein = protein;
        return this;
    }

    @Override
    public Builder setCarbohydrate(String carbohydrate) {
        this.carbohydrate = carbohydrate;
        return this;
    }

    @Override
    public Builder setVegetable(String vegetable) {
        this.vegetable = vegetable;
        return this;
    }

    @Override
    public Builder setBeverage(String beverage) {
        this.beverage = beverage;
        return this;
    }

    @Override
    public DietPlan build() {
        return new DietPlan(protein, carbohydrate, vegetable, beverage);
    }
}
