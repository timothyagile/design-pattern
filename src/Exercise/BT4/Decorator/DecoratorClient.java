package Exercise.BT4.Decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Soldier baseSoldier = new BaseSoldier();
        baseSoldier.getItem();
        System.out.println("\nClient::Decorated\n");

        baseSoldier = new Skill(baseSoldier, "Shoot");
        baseSoldier = new Weapon(baseSoldier, "Gun");
        baseSoldier = new Equipment(baseSoldier, "Balo");
        baseSoldier = new Rank(baseSoldier, "Boss");

        baseSoldier.getItem();
    }
}
