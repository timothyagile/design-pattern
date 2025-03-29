package Exercise.BT5.CoR;

public class BaseHandler implements Handler{

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Reception::Patient::" + request.getPatient().getName());
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
