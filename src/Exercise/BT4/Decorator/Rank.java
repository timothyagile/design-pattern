package Exercise.BT4.Decorator;

public class Rank extends BaseDecorator {
    private final String rank;
    public Rank(Soldier soldier, String rank) {
        super(soldier);
        this.rank = rank;
    }

    @Override
    public void getItem() {
        super.getItem();
        System.out.println("Rank::" + rank);
    }
}
