package Exercise.BT4.Composite;

public class ConsultantService extends MedicalService{
    @Override
    public void getDescription() {
        System.out.println("Consultant description::");
    }

    @Override
    public double getCost() {
        return 20;
    }
}
