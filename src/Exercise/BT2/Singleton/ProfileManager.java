package Exercise.BT2.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ProfileManager {
    private static ProfileManager instance;
    private Map<String, Patient> patientRecords;

    // Constructor private để ngăn chặn khởi tạo từ bên ngoài
    private ProfileManager() {
        patientRecords = new HashMap<>();
    }

    // Phương thức để lấy thể hiện duy nhất của lớp
    public static synchronized ProfileManager getInstance() {
        if (instance == null) {
            instance = new ProfileManager();
        }
        return instance;
    }

    // Thêm hồ sơ bệnh nhân mới
    public void addPatient(String id, String name, int age, String diagnosis) {
        if (!patientRecords.containsKey(id)) {
            patientRecords.put(id, new Patient(id, name, age, diagnosis));
            System.out.println("Bệnh nhân " + name + " đã được thêm vào hệ thống.");
        } else {
            System.out.println("Bệnh nhân với ID " + id + " đã tồn tại.");
        }
    }

    // Cập nhật thông tin bệnh nhân
    public void updatePatient(String id, String name, int age, String diagnosis) {
        if (patientRecords.containsKey(id)) {
            patientRecords.put(id, new Patient(id, name, age, diagnosis));
            System.out.println("Thông tin bệnh nhân " + name + " đã được cập nhật.");
        } else {
            System.out.println("Bệnh nhân với ID " + id + " không tồn tại.");
        }
    }

    // Lấy thông tin bệnh nhân theo ID
    public Patient getPatient(String id) {
        return patientRecords.get(id);
    }
}
