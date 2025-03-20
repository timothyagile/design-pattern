package Exercise.BT3.BridgePattern;

public class BridgePatternClient {
    public static void operate() {
        // Kết hợp Drip Irrigation với Manual Control
        IrrigationController system1 = new IrrigationController(new DripIrrigation(), new ManualControl());
        system1.startIrrigation();

        System.out.println();

        // Kết hợp Sprinkler Irrigation với Automatic Control
        IrrigationController system2 = new IrrigationController(new SprinklerIrrigation(), new AutomaticControl());
        system2.startIrrigation();

        System.out.println();

        // Kết hợp Manual Irrigation với Manual Control
        IrrigationController system3 = new IrrigationController(new ManualIrrigation(), new ManualControl());
        system3.startIrrigation();
    }
}
