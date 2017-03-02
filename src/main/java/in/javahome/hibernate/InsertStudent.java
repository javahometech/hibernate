package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class InsertStudent {
	public static void main(String[] args) {

		try (Session session = MyHibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student s1 = new Student("Babu", "babu@javahome.in");
			
			session.persist(s1);

			tx.commit();
		}
	}
}
