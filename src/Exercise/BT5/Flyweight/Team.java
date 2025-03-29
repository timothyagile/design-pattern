package Exercise.BT5.Flyweight;

public class Team {
    private String name;
    private String logo;
    private String color;

    public Team(String name, String logo, String color) {
        this.name = name;
        this.logo = logo;
        this.color = color;
    }

    public void showInfo() {
        System.out.println("\nTeam::" + name + "\nLogo::" + logo + "\nColor::" + color);
    }
}
