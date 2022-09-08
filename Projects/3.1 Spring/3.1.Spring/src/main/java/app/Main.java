package app;

import services.SignUpService;
import services.SignUpServiceImpl;
import validators.*;

public class Main {
    public static void main(String[] args) {

        EmailValidatorRegexImpl emailValidator = new EmailValidatorRegexImpl();
        emailValidator.setPattern(".+@.+");
        PasswordValidator passwordValidator = new PasswordValidatorByCharacterImpl();
        PasswordBlackList passwordBlackList = new PasswordBlackListImpl();

        SignUpService signUpService = new SignUpServiceImpl(emailValidator, passwordValidator, passwordBlackList);

        signUpService.signUp("abrakadabra@milo.ru", "!23456");
    }
}
