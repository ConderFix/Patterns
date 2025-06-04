package builder;

public class Main {

    public static void main(String[] args) {
        final User user = new UserBuilder("Пушкин", "Александр")
                .address("г. Москва, Улица Пушкина, дом 24, квартира 5")
                .email("test@gmail.com")
                .build();

        System.out.println(user);
    }


}
