package CoRPattern;

public class AuthorizationMiddleware extends Middleware{

    private String requiredRole;

    public AuthorizationMiddleware(Server server, String requiredRole) {
        super(server);
        this.requiredRole = requiredRole;
    }

    @Override
    public boolean check(String email, String password) {
        User user = server.getUser(email);
        if (user != null && requiredRole.equals(user.getRole())) {
            System.out.println("Authorization successful: " + requiredRole +  " access granted.");
            return checkNext(email, password);
        }
        System.out.println("Authorization failed: User does not have admin privileges.");
        return false;
    }
}
