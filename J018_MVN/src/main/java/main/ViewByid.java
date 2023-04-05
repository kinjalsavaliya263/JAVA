package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class ViewByid {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();

		Student std = s.load(Student.class, 2);
		System.out.println(std.getId() + "" + std.getName() + " " + std.getEmail());

		tx.commit();
	}
}
