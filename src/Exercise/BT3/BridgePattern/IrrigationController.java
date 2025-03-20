package Exercise.BT3.BridgePattern;

public class IrrigationController {
    protected IrrigationSystem irrigationSystem;
    protected ControlSystem controlSystem;

    public IrrigationController(IrrigationSystem irrigationSystem, ControlSystem controlSystem) {
        this.irrigationSystem = irrigationSystem;
        this.controlSystem = controlSystem;
    }

    public void startIrrigation() {
        controlSystem.control();
        irrigationSystem.waterPlants();
    }
}
