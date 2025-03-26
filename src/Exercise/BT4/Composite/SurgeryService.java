package Exercise.BT4.Composite;

public class SurgeryService extends MedicalService{
    @Override
    public void getDescription() {
        System.out.println("Consultant description::");
    }

    @Override
    public double getCost() {
        return 100;
    }
}
