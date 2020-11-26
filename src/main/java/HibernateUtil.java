import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil {
private static final SessionFactory sessionFactory;
    static {
        File cfgFile = new File("hibernate.cfg.xml");
        sessionFactory = new Configuration().configure(cfgFile)
                .addAnnotatedClass(Student.class).addAnnotatedClass(LearningGroup.class).buildSessionFactory();
    }
public static Session getSession(){
        return sessionFactory.openSession();
}
}
