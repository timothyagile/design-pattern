package Exercise.BT4.Composite;

public class XRayService extends MedicalService{
    @Override
    public void getDescription() {
        System.out.println("XRay description::");
    }

    @Override
    public double getCost() {
        return 50;
    }
}
