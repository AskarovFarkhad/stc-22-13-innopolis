package test.validators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;
@Component
public class EmailValidatorRegexImpl implements EmailValidator {

    private Pattern pattern;

    public void setPattern(@Value("${validator.email.regex}") String regex) {
        this.pattern = Pattern.compile(regex);
    }
    @Override
    public void validate(String email) {
        //Если строка не подходит под регулярное выражение, то мы выкинем exception
        //В нашем случае, если будет отсутствовать знак @, то почта некорректна
        if (!pattern.matcher(email).find()) {
            throw new IllegalArgumentException("Некорректная почта. Нет '@'");
        }
    }
}
