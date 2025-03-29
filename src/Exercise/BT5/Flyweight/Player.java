package Exercise.BT5.Flyweight;

class Player {
    private String name;
    private int number;
    private String position;
    private Team team; // Sử dụng Flyweight

    public Player(String name, int number, String position, Team team) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }

    public void showInfo() {
        System.out.println("\nPlayer::" + name + "\nNumber::"
                + number + "\nPosition::" + position);
        team.showInfo(); // Gọi thông tin đội bóng
    }
}
