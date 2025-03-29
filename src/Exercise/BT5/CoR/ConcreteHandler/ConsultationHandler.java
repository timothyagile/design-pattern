package Exercise.BT5.CoR.ConcreteHandler;

import Exercise.BT5.CoR.BaseHandler;
import Exercise.BT5.CoR.Request;

public class ConsultationHandler extends BaseHandler {
    public void handleRequest(Request request) {
        System.out.println("\nConsultation::" + request.getPatient().getName());
        super.handleRequest(request);
    }
}
