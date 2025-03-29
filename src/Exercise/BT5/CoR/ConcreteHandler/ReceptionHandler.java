package Exercise.BT5.CoR.ConcreteHandler;

import Exercise.BT5.CoR.BaseHandler;
import Exercise.BT5.CoR.Request;

public class ReceptionHandler extends BaseHandler {

    public void handleRequest(Request request) {
        System.out.println("\nReception::" + request.getPatient().getName());
        super.handleRequest(request);
    }

}
