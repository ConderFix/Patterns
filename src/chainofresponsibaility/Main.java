package chainofresponsibaility;

import chainofresponsibaility.validator.Validator;
import chainofresponsibaility.validator.list.LengthValidator;
import chainofresponsibaility.validator.list.NotEmptyValidator;
import chainofresponsibaility.validator.list.SpecialCharValidator;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Validator> validators = new ArrayList<>();

    @SneakyThrows
    public static void main(String[] args) {
        validators.add(new NotEmptyValidator());
        validators.add(new LengthValidator());
        validators.add(new SpecialCharValidator());

        validate("");
        validate("abc");
        validate("abcde");
        validate("abcde!");
        validate("valid@123");
    }

    private static void validate(String data) {
        for (Validator validator : validators) {
            final String result = validator.validate(data);
            if (result != null) {
                System.out.println(result);
                return;
            }
        }
        System.out.println("Validation successful.");
    }
}
