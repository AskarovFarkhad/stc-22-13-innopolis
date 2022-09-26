package test.services;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import test.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import test.validators.EmailValidator;
import test.validators.PasswordBlackList;
import test.validators.PasswordValidator;

@Component
public class SignUpServiceImpl implements SignUpService {

    private final EmailValidator emailValidator;
    private final PasswordValidator passwordValidator;

    private final PasswordBlackList passwordBlackList;

    @Autowired
    public SignUpServiceImpl(@Qualifier("ByLength") EmailValidator emailValidator,
                             @Qualifier("PasswordByLength") PasswordValidator passwordValidator,
                             PasswordBlackList passwordBlackList) {
        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
        this.passwordBlackList = passwordBlackList;
    }

    @Override
    public void signUp(String email, String password) {

        if (passwordBlackList.contains(password)) {
            throw new IllegalArgumentException("Ваш пароль уже был взломан");
        }

        emailValidator.validate(email);
        passwordValidator.validate(password);


        Account account = Account.builder()
                .email(email)
                .password(password)
                .build();


        System.out.println("Аккаунт создан");
        System.out.println("Email - " + account.getEmail());
        System.out.println("Password - " + account.getPassword());
    }
}
