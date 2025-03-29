package Exercise.BT5.Flyweight;

public class FlyweightClient {
    public static void main(String[] args) {
        // Tạo các đội bóng (chỉ được tạo một lần)
        Team teamA = TeamFactory.getTeam("Team A", "LogoA.png", "Red");
        Team teamB = TeamFactory.getTeam("Team B", "LogoB.png", "Blue");

        // Tạo cầu thủ, các cầu thủ dùng chung thông tin đội bóng
        Player player1 = new Player("Messi", 10, "Forward", teamA);
        Player player2 = new Player("Ronaldo", 7, "Forward", teamB);
        Player player3 = new Player("Neymar", 11, "Midfielder", teamA);

        // Hiển thị thông tin
        player1.showInfo();
        player2.showInfo();
        player3.showInfo();
    }
}
