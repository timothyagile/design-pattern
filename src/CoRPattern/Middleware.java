package CoRPattern;

public abstract class Middleware {
    private Middleware next;

    protected Server server;

    public Middleware(Server server) {
        this.server = server;
    }

    public static Middleware linkWith(Middleware first, Middleware... chain) {
        Middleware head = first;

        for(Middleware nextChain : chain) {
            head.next = nextChain;
            head = nextChain;
        }

        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null)
            return true;

        return next.check( email, password);
    }
}
