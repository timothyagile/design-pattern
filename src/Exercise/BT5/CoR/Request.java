package Exercise.BT5.CoR;

public class Request {
    private Patient patient;
    private String condition;

    public Request(Patient patient, String condition) {
        this.patient = patient;
        this.condition = condition;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getCondition() {
        return condition;
    }
}
