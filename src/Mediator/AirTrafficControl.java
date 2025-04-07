package Mediator;

public interface AirTrafficControl {
    boolean requestLanding(Aircraft aircraft);
    void notifyAircraft(Aircraft aircraft, String message);
    void aircraftLanded(Aircraft aircraft);
    void releaseLanding();

}
