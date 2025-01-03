public class User {
    private int id;
    private String name;
    private String email;

    // Constructors, Getters, and Setters
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
