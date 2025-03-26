package Exercise.BT4.Decorator;

public class Equipment extends BaseDecorator{
    private final String equipment;
    public Equipment(Soldier soldier, String equipment) {
        super(soldier);
        this.equipment = equipment;
    }

    @Override
    public void getItem() {
        super.getItem();
        System.out.println("Equipment::" + equipment);
    }
}
