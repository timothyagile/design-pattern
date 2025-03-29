package Exercise.BT5.CoR;

import Exercise.BT5.CoR.ConcreteHandler.ConsultationHandler;
import Exercise.BT5.CoR.ConcreteHandler.DiagnosisHandler;
import Exercise.BT5.CoR.ConcreteHandler.ReceptionHandler;
import Exercise.BT5.CoR.ConcreteHandler.TreatmentHandler;

public class CoRClient {
    public static void main(String[] args) {
        Handler h1 = new ReceptionHandler();
        Handler h2 = new DiagnosisHandler();
        Handler h3 = new TreatmentHandler();
        Handler h4 = new ConsultationHandler();

        h1.setNextHandler(h2);
        h2.setNextHandler(h3);
        h3.setNextHandler(h4);

        // Tạo yêu cầu khám bệnh
        Request request = new Request(
                new Patient(1, "NguyenVanA", "Sốt cao, ho")
                , "Normal");

        // Bắt đầu xử lý
        h1.handleRequest(request);
    }
}
