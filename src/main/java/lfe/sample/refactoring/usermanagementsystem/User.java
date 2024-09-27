package lfe.sample.refactoring.usermanagementsystem;

public class User {
    private String username;
    private String email;

    // Constructor, Getters, and Setters
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

