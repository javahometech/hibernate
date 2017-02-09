package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class InsertStudent {
	public static void main(String[] args) {

		try (Session session = MyHibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student s1 = new Student(2, "Sitha", "sitha@javahome.in");
			session.save(s1);
			tx.commit();
		}
	}
}
