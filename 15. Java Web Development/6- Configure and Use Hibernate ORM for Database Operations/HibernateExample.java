import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        // Create Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // Build SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Create Session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Create an entity
        User user = new User();
        user.setId(1);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        // Save entity
        session.save(user);
        tx.commit();

        // Close session
        session.close();
        factory.close();
        System.out.println("User saved successfully!");
    }
}
