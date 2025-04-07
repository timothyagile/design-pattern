package Exercise.BT6.Mediator;

public class MediatorClient {
    public static void main(String[] args) {
        TrafficMediator mediator = new TrafficMediator();

        TrafficLight eastLight = new TrafficLight("Đông", mediator);
        TrafficLight westLight = new TrafficLight("Tây", mediator);
        TrafficLight northLight = new TrafficLight("Bắc", mediator);
        TrafficLight southLight = new TrafficLight("Nam", mediator);

        mediator.registerLight(eastLight);
        mediator.registerLight(westLight);
        mediator.registerLight(northLight);
        mediator.registerLight(southLight);

        // Giả lập chuyển đổi trạng thái
        mediator.changeLight(eastLight);
        System.out.println();

        mediator.changeLight(westLight);
        System.out.println();

        mediator.changeLight(northLight);
        System.out.println();

        mediator.changeLight(southLight);
    }
}
