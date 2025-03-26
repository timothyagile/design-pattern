package CoRPattern;

public class AuthenticationMiddleware extends Middleware{

    public AuthenticationMiddleware(Server server) {
        super(server);
    }


    @Override
    public boolean check(String email, String password) {
        User user = server.getUser(email);
        if (user == null || !user.getPassword().equals(password)) {
            System.out.println("Authentication failed: Invalid credentials.");
            return false;
        }
        System.out.println("Authentication successful for user: " + email);
        return checkNext(email, password);
    }
}
