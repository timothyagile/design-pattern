package Exercise.BT4.Decorator;

public class Skill extends BaseDecorator {

    private final String skill;
    public Skill(Soldier soldier, String skill) {
        super(soldier);
        this.skill = skill;
    }

    @Override
    public void getItem() {
        super.getItem();
        System.out.println("Skill::" + skill);
    }
}
