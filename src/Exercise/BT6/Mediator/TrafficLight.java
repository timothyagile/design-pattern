package Exercise.BT6.Mediator;

public class TrafficLight {
    private String direction;
    private TrafficLightColor color;
    private TrafficMediator mediator;

    public TrafficLight(String direction, TrafficMediator mediator) {
        this.direction = direction;
        this.mediator = mediator;
        this.color = TrafficLightColor.RED; // Mặc định ban đầu là đèn đỏ
    }

    public String getDirection() {
        return direction;
    }

    public TrafficLightColor getColor() {
        return color;
    }

    public void turnGreen() {
        System.out.println("Đèn tại hướng " + direction + " chuyển sang XANH");
        color = TrafficLightColor.GREEN;
    }

    public void turnRed() {
        System.out.println("Đèn tại hướng " + direction + " chuyển sang ĐỎ");
        color = TrafficLightColor.RED;
    }

    public void turnYellow() {
        System.out.println("Đèn tại hướng " + direction + " chuyển sang VÀNG");
        color = TrafficLightColor.YELLOW;
    }
}
