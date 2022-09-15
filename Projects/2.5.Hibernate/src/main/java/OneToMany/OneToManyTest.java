package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OneToManyTest {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
//            AirPlane airPlane = AirPlane.builder()
//                    .name("Boing 777")
//                    .build();
//            Passenger passenger1 = Passenger.builder()
//                    .airplane(airPlane)
//                    .firstname("Oleg")
//                    .lastname("Igonin")
//                    .build();
//
//            Passenger passenger2 = Passenger.builder()
//                    .airplane(airPlane)
//                    .firstname("Iezekel")
//                    .lastname("FusRuDah")
//                    .build();
//
//            session.save(airPlane);
//            session.save(passenger1);
//            session.save(passenger2);
//            System.out.println("All ok");

            List airPlane = session.createQuery("from AirPlane ").list();

            int i = 0;
        }
    }
}
