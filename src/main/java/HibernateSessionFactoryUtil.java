import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Employee.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySetting(configuration.getProperty());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        }catch (Exception e){
                e.printStackTrace();
            }}
        return sessionFactory;
    }
}