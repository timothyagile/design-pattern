package Exercise.BT6.Mediator;

public interface Mediator {
    void registerLight(TrafficLight trafficLight);
    void changeLight(TrafficLight currentLight);
}
