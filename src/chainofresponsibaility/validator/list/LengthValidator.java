package chainofresponsibaility.validator.list;

import chainofresponsibaility.validator.Validator;

public class LengthValidator implements Validator {

    @Override
    public String validate(String data) {
        return (data.length() < 5) ? "Validation failed: data length is less than 5." : null;
    }
}
