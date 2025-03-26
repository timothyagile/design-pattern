package CoRPattern;

public class User {
    private String name;
    private String password;
    private String role;

    public User(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
