package builder;

public class UserBuilder {

    final String firstName;
    final String lastName;
    String email;
    String phoneNumber;
    String address;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
