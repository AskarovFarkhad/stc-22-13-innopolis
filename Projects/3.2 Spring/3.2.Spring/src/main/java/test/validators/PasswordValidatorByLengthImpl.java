package test.validators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Проверка пароля по длине
@Component(value = "PasswordByLength")
public class PasswordValidatorByLengthImpl implements PasswordValidator {

    private final int minLength;

    public PasswordValidatorByLengthImpl(@Value("${validator.password.minLength}") int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String password) {
        if (password.length() < minLength) {
            throw new IllegalArgumentException("Длина пароля некорректна");
        }
    }
}
