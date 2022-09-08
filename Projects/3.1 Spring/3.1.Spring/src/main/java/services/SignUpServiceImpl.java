package services;

import models.Account;
import validators.EmailValidator;
import validators.PasswordBlackList;
import validators.PasswordValidator;

public class SignUpServiceImpl implements SignUpService {

    private EmailValidator emailValidator;
    private PasswordValidator passwordValidator;

    private PasswordBlackList passwordBlackList;

    public SignUpServiceImpl(EmailValidator emailValidator,
                             PasswordValidator passwordValidator,
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
