package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class UpdateStudent {
	public static void main(String[] args) {

		try (Session session = MyHibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			// Fetch the date
			Student s1 = session.get(Student.class, 2);
			// Update data by calling setters 
			Student s2 = new Student();
			s2.setEmail("rahul@gmail.com");
			s2.setName("rahul K");
			s2.setStdId(2);
			session.update(s2);
			tx.commit();
		}
	}
}
