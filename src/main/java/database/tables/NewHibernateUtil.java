package database.tables;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import utilities.Log;
/**
 * Created by harish on 3/11/16.
 */

public class NewHibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
            try {
                // Create the SessionFactory from standard (hibernate.cfg.xml)
                // config file.
                sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            } catch (Exception ex) {
                // Log the exception.
                Log.logger.error("Initial SessionFactory creation failed." + ex.getMessage());
//            throw new ExceptionInInitializerError(ex);
            }

    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

