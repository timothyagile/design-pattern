package Exercise.BT2.Singleton;

public class Client {
    public static void operate() {
        ProfileManager manager = ProfileManager.getInstance();

        // Thêm bệnh nhân
        manager.addPatient("P001", "Nguyen Van A", 30, "Cảm cúm");
        manager.addPatient("P002", "Tran Thi B", 25, "Sốt xuất huyết");

        //Xem thử đã thêm thành công hay chưa
        System.out.println(manager.getPatient("P001"));
        System.out.println(manager.getPatient("P002"));

        // Thử thêm hồ sơ trùng

        manager.addPatient("P001", "Nguyen Van A", 30, "Viêm họng");

        //Cập nhật
        manager.updatePatient("P001", "Nguyen Van A", 31, "Viêm họng");

        // Truy vấn thông tin bệnh nhân
        System.out.println(manager.getPatient("P001"));
        System.out.println(manager.getPatient("P002"));
    }
}
