package Exercise.BT2.Singleton;

public class Patient {
    private String id;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String id, String name, int age, String diagnosis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }
}
