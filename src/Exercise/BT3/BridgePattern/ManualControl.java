package Exercise.BT3.BridgePattern;

public class ManualControl implements ControlSystem {
    @Override
    public void control() {
        System.out.println("Controlling irrigation manually.");
    }
}
