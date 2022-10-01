package test.app;

import test.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.services.SignUpService;
import test.services.SignUpServiceImpl;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        SignUpService signUpService = applicationContext.getBean(SignUpServiceImpl.class);
        //SignUpService signUpService = (SignUpService) applicationContext.getBean("signUpService");

        signUpService.signUp("abrakadabra@milo.ru", "!23456");
    }
}
