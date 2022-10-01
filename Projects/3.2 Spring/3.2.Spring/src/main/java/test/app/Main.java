package test.app;

import test.services.SignUpService;
import test.services.SignUpServiceImpl;
import test.validators.*;


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
