package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class InsertStudent {
	public static void main(String[] args) {

		try (Session session = MyHibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student s1 = new Student(6, "Ram", "ram@javahome.in");
			Student s2 = new Student(4, "Krish", "krish@javahome.in");
			Student s3 = new Student(5, "Raghu", "raghu@javahome.in");
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.evict(s2);
			tx.commit();
		}
	}
}