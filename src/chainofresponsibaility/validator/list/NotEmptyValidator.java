package chainofresponsibaility.validator.list;

import chainofresponsibaility.validator.Validator;

public class NotEmptyValidator implements Validator {

    @Override
    public String validate(String data) {
        return (data == null || data.isEmpty() ? "Validation failed: data is empty." : null);
    }
}
