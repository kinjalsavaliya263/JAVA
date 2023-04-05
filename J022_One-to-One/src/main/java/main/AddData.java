package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;
import model.UserDetails;

public class AddData {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetails.class).buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		User user = new User();
		user.setUname("kajal");
		user.setEmail("kajal@gmail.com");

//		User user = session.load(User.class, 2);

		UserDetails userDetails = new UserDetails();
		userDetails.setYoutube_channel("wd");
		userDetails.setUser(user);

		session.save(userDetails);

		tx.commit();

	}
}