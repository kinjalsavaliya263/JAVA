package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Book;

public class BookDao {

	SessionFactory sf;

	public BookDao() {

		Configuration cfg = new Configuration();
		cfg = cfg.configure("resources/hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Book.class);
		sf = cfg.buildSessionFactory();

	}

	private int addBook(Book b) {

		int i = 1;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(b);
		tx.commit();
	}
	
	public List<Book> viewAllBook() {
		
		Session s=sf.openSession();
		Transaction tx
	}

}
