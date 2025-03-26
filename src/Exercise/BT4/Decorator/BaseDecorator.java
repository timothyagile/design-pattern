package Exercise.BT4.Decorator;

public abstract class BaseDecorator implements Soldier {
    private Soldier soldier;

    public BaseDecorator(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void getItem() {
        soldier.getItem();
    }
}
