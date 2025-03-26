package Exercise.BT4.Facade;

public class DonHangFacade {
    private KiemTraHangTon kiemTraHangTon;
    private XuLyThanhToan xuLyThanhToan;
    private VanChuyen vanChuyen;

    public DonHangFacade(KiemTraHangTon kiemTraHangTon,
                         XuLyThanhToan xuLyThanhToan,
                         VanChuyen vanChuyen) {
        this.kiemTraHangTon = kiemTraHangTon;
        this.xuLyThanhToan = xuLyThanhToan;
        this.vanChuyen = vanChuyen;
    }

    public void operate() {
        if(!kiemTraHangTon.checkWareHouse()) {
            System.out.println("Operate::Goods is unavailable");
        }

        xuLyThanhToan.payment();
        vanChuyen.transport();
    }
}
