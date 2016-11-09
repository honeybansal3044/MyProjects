package persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Startup Hibernate and provide access to the singleton SessionFactory
 */
public class HibernateUtil {

  private static SessionFactory sessionFactory;
  private static SessionFactory sessionFactoryMySql;

  static {
    try {
       sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       sessionFactoryMySql = new Configuration().configure("hibernate.mysql.cfg.xml").buildSessionFactory();
    } catch (Throwable ex) {
       throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory() {
      // Alternatively, we could look up in JNDI here
      return sessionFactory;
  }
  
  public static SessionFactory getSessionFactoryMySql() {
      // Alternatively, we could look up in JNDI here
      return sessionFactoryMySql;
  }

  public static void shutdown() {
      // Close caches and connection pools
      getSessionFactory().close();
      getSessionFactoryMySql().close();
  }
}