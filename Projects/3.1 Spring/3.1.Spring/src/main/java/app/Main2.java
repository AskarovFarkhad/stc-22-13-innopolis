package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.SignUpService;
import services.SignUpServiceImpl;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

        SignUpService signUpService = applicationContext.getBean(SignUpServiceImpl.class);
        //SignUpService signUpService = (SignUpService) applicationContext.getBean("signUpService");

        signUpService.signUp("abrakadabra@milo.ru", "!23456");
    }
}
