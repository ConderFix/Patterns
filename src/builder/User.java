package builder;

// Можно, кста, использовать аннотацию от Lombok "Builder", но я решил реализовать все сам
public class User {

    private final String firstName, lastName;
    private String email, phoneNumber, address;

    public User(String firstName, String lastName, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Первое имя: " + firstName + ", Последнее имя: " + lastName + ", Почта: " + email + ", Телефон: " + phoneNumber + ", Адрес: " + address;
    }
}
