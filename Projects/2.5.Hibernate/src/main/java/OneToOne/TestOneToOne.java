package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Passport passport = new Passport("3541 987654");
            Person person = Person.builder()
                    .name("Iezekel")
                    .lastName("Pupkin")
                    .passport(passport)
                    .build();

            session.save(passport);
            session.save(person);
        }
    }
}
