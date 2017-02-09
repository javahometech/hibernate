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
			s1.setEmail("sitha@gmail.com");
			s1.setName("Sitha K");
			session.update(s1);
			tx.commit();
		}
	}
}
