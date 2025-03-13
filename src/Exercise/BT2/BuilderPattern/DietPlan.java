package Exercise.BT2.BuilderPattern;

public class DietPlan {
    String protein;
    String carbohydrate;
    String vegetable;
    String beverage;


    public DietPlan() {

    }

    public DietPlan(String protein, String carbohydrate, String vegetable, String beverage) {
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.vegetable = vegetable;
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return "Meal: "
                + "\nProtein: "  + this.protein
                +  "\nCarbohydrate: "  + this.carbohydrate
                + "\nVegetable: "  + this.vegetable
                + "\nBeverage: "  + this.beverage;
    }
}
