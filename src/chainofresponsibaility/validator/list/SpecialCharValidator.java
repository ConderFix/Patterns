package chainofresponsibaility.validator.list;

import chainofresponsibaility.validator.Validator;

public class SpecialCharValidator implements Validator {

    @Override
    public String validate(String data) {
        return (!data.matches(".*[!@#$%8*()].*")) ? "Validation failed: data must contain a special character." : null;
    }
}
