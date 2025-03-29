package Exercise.BT5.CoR;

public interface Handler {
    void setNextHandler(Handler handler);
    void handleRequest(Request request);
}
