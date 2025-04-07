package Exercise.BT6.Mediator;

import java.util.ArrayList;
import java.util.List;

public class TrafficMediator implements Mediator{
    private List<TrafficLight> trafficLights = new ArrayList<>();

    @Override
    public void registerLight(TrafficLight light) {
        trafficLights.add(light);
    }

    @Override
    public void changeLight(TrafficLight currentLight) {
        System.out.println("\n--- Điều phối đèn giao thông ---");
        currentLight.turnGreen();
        for (TrafficLight light : trafficLights) {
            if (!light.equals(currentLight)) {
                light.turnRed(); // Các đèn khác chuyển sang đỏ
            }
        }
    }
}
