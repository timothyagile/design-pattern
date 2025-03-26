package Exercise.BT4.Composite;

public class CompositeClient {
    public static void main(String[] args) {
        MedicalService consultation = new ConsultantService();
        MedicalService xray = new XRayService();
        MedicalService surgery = new SurgeryService();

        // Tạo một gói dịch vụ y tế tổng hợp
        CompositeMedicalService healthPackage = new CompositeMedicalService();
        healthPackage.add(consultation);
        healthPackage.add(xray);

        // Tạo một gói dịch vụ khác bao gồm cả phẫu thuật
        CompositeMedicalService fullPackage = new CompositeMedicalService();
        fullPackage.add(healthPackage);
        fullPackage.add(surgery);

        consultation.getDescription();
        System.out.println("Consultant::" + consultation.getCost());
        xray.getDescription();
        System.out.println("Xray::" + xray.getCost());
        surgery.getDescription();
        System.out.println("Surgery::" + surgery.getCost());


        healthPackage.getDescription();
        System.out.println("Health Package::" + healthPackage.getCost());
        fullPackage.getDescription();
        System.out.println("Full Package::" + fullPackage.getCost());
    }
}
