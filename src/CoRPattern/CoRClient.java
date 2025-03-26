package CoRPattern;

public class CoRClient {

    public static void main(String[] args) {
        Server server = new Server();

        server.registerUser("admin", "password123", "admin");
        server.registerUser("user1", "userpass", "user");

        Middleware middleware = Middleware.linkWith(
                new LoggingMiddleware(server),
                new AuthenticationMiddleware(server),
                new AuthorizationMiddleware(server, "admin")
        );

        server.setMiddleware(middleware);

        // Yêu cầu từ User bình thường
        System.out.println("\n[Attempt 1: User login]");
        server.handleRequest("user1", "password123");

        // Yêu cầu từ Admin
        System.out.println("\n[Attempt 2: Admin login]");
        server.handleRequest("admin", "password123");
        }
}
