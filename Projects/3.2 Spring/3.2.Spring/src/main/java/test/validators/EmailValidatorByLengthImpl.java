package test.validators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "ByLength")
//Класс, который проверяет почту на длину
public class EmailValidatorByLengthImpl implements EmailValidator {

    private final int minLength;

    public EmailValidatorByLengthImpl(@Value("${validator.password.minLength}") int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String email) {
        if (email.length() < minLength) {
            throw new IllegalArgumentException("Длина почты некорректна");
        }
    }
}
