package hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class ProductDaoImpl implements ProductDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Product> loadProductsByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from hibernate.Product product where product.name=?");
		List<Product> list = query.setParameter(0, name).list();
		return list;
	}
}
