package Exercise.BT5.CoR;

public class Patient {
    private int patientId;
    private String name;
    private String symptoms;

    public Patient(int patientId, String name, String symptoms) {
        this.patientId = patientId;
        this.name = name;
        this.symptoms = symptoms;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getSymptoms() {
        return symptoms;
    }
}
