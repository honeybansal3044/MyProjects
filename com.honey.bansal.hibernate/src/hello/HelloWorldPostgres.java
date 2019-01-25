package hello;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.HibernateUtil;

public class HelloWorldPostgres {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Message message = new Message("Hello World");
		session.save(message);

		tx.commit();
	}
}
