package Exercise.BT4.Facade;

public class FacadeClient {
    public static void main(String[] args) {

        DonHangFacade donHangFacade = new DonHangFacade(
                new KiemTraHangTon(),
                new XuLyThanhToan(),
                new VanChuyen()
        );

        donHangFacade.operate();
    }
}
