package Exercise.BT5.CoR.ConcreteHandler;

import Exercise.BT5.CoR.BaseHandler;
import Exercise.BT5.CoR.Handler;
import Exercise.BT5.CoR.Request;

public class DiagnosisHandler extends BaseHandler {

    public void handleRequest(Request request) {
        System.out.println("\nDiagnosis::" + request.getPatient().getName() +
                "\nSymptoms::" + request.getPatient().getSymptoms());
        super.handleRequest(request);
    }

}

