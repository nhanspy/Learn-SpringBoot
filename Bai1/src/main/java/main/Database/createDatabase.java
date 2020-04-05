package main.Database;

import org.hibernate.Session;

import main.model.Product;

public class createDatabase {

	public createDatabase() {
		try (Session session = HibernateUtils.getSessionFactory().openSession();) {
			// Begin a unit of work
			session.beginTransaction();

			// Insert user
			Product product = new Product();
			product.setName("cat " + System.currentTimeMillis());
			System.out.println("Cat id = " + session.save(product));

			// Commit the current resource transaction, writing any unflushed changes to the
			// database.
			session.getTransaction().commit();
		}
	}
}
