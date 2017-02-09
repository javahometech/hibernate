package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class DeleteStudent {
	public static void main(String[] args) {

		try (Session session = MyHibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student s1 = session.get(Student.class, 1);
			session.delete(s1);
			tx.commit();
		}
	}
}
