package lfe.sample.refactoring.usermanagementsystem;

public class UserService {

    public User createUser(String name, String email) {
        return new User(name,email);
    }

    public void updateUser(User user) {
        // Update logic
    }
}

