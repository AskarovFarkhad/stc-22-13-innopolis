package intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class IntroMain {
    public static void main(String[] args) {
        //Создаем объект конфигурации Hibernate
        Configuration configuration = new Configuration();
        //Скармливаем инструкцию, написанную нами, Hibernate
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Animal animal = Animal.builder()
                    .countLegs(4)
                    .type("cat")
                    .tail(true)
                    .build();
            session.save(animal);
            System.out.println("Животное добавлено");
        }
    }
}
