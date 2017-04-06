package pl;

/**
 * Created by Andrzej on 06.04.2017.
 */
public class User {
    private String firstName;
    private Role role;

    public User(Role role) {
        this.role = role;
    }

    public Role updateRoleAndReturnPreviousOne(Role role) {
        Role previous = this.role;
        this.role = role;
        return previous;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
            "firstName='" + firstName + '\'' +
            ", role=" + role +
            '}';
    }
}
