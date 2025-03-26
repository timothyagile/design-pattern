package Exercise.BT4.Decorator;

public class BaseSoldier implements Soldier {

    @Override
    public void getItem() {
        System.out.println("Base soldier::Have no item");
    }
}
