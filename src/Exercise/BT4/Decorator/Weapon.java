package Exercise.BT4.Decorator;

public class Weapon extends BaseDecorator {

    private final String weapon;
    public Weapon(Soldier soldier, String weapon) {
        super(soldier);
        this.weapon = weapon;
    }

    @Override
    public void getItem() {
        super.getItem();
        System.out.println("Weapon::" + weapon);
    }
}
