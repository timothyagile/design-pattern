package Exercise.BT2.BuilderPattern;

public class Director {
    public DietPlan createMediterranean() {
        return new DietPlanBuilder()
                .setProtein("Fish")
                .setCarbohydrate("Olive")
                .setVegetable("Fresh vegetable")
                .setBeverage("Wine")
                .build();
    }

    public DietPlan createDash() {
        return new DietPlanBuilder()
                .setProtein("Chicken")
                .setCarbohydrate("Brown rice")
                .setVegetable("Green vegetable")
                .setBeverage("Fruit juice")
                .build();
    }

    public DietPlan createVegetable() {
        return new DietPlanBuilder()
                .setProtein("Tofu")
                .setCarbohydrate("Potato")
                .setVegetable("Mixed vegetable")
                .setBeverage("Water")
                .build();
    }
}
