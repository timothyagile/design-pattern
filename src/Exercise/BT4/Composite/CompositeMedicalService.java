package Exercise.BT4.Composite;

import CompositePattern.FileComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompositeMedicalService extends MedicalService {

    List<MedicalService> compositeMedical = new ArrayList<>();


    public void add(MedicalService medicalService) {
        compositeMedical.add(medicalService);
    }

    public void remove(long index) {
        compositeMedical.remove(index);
    }

    @Override
    public void getDescription() {
        for (MedicalService component : compositeMedical) {
            component.getDescription();
        }
    }

    @Override
    public double getCost() {

        double total = 0;
        for (MedicalService component : compositeMedical) {
            total += component.getCost();
        }
        return total;
    }
}
