package CoRPattern;

class LoggingMiddleware extends Middleware {
    public LoggingMiddleware(Server server) {
        super(server);
    }

    @Override
    public boolean check(String name, String password) {
        System.out.println("Logging request: User " + server.getUser(name).getName() +
                " is request into system");
        return checkNext( name, password);
    }
}