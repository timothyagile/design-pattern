package Mediator;

public class MediatorClient {
    public static void main(String[] args) {

        AirTrafficControl atc = new TowerControl();

        Aircraft plane1 = new Aircraft("VN001", atc);
        Aircraft plane2 = new Aircraft("VN002", atc);

        plane1.requestLanding();
        plane2.requestLanding(); // Không thể hạ cánh ngay lập tức

        atc.releaseLanding();

        plane2.requestLanding();
    }
}
