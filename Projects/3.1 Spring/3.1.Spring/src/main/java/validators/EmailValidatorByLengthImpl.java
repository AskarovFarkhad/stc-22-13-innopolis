package validators;

//Класс, который проверяет почту на длину
public class EmailValidatorByLengthImpl implements EmailValidator {

    private int minLength;

    public EmailValidatorByLengthImpl(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String email) {
        if (email.length() < minLength) {
            throw new IllegalArgumentException("Длина почты некорректна");
        }
    }
}
