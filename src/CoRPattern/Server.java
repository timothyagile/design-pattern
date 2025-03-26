package CoRPattern;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, User> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public void registerUser(String name, String password, String role) {
        users.put(name, new User(name, password, role));
    }

    public User getUser(String email) {
        return users.get(email);
    }

    public boolean handleRequest(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Action granted");
            return true;
        }
        System.out.println("Action denied.");
        return false;
    }
}
