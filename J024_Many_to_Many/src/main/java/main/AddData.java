package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Subject;

public class AddData {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class).buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

//		Subject s1 = new Subject();
//		s1.setSubname("sql");
//
//		Student s2 = new Student();
//		s2.setStname("kinjal");
//		s2.addSubject(s1);
//
//		Student s3 = new Student();
//		s3.setStname("nidhi");
//		s3.addSubject(s1);
//
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);

		Subject s1 = session.get(Subject.class, 2);
		Student s2 = session.get(Student.class, 3);
		s2.addSubject(s1);
		session.save(s2);
		tx.commit();

	}
}