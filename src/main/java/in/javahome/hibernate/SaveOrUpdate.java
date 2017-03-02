package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class SaveOrUpdate {
	public static void main(String[] args) {

		try (Session session = MyHibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student s1 = new Student( "Sitha", "sitha@javahome.in");
			session.saveOrUpdate(s1);
			tx.commit();
		}
	}
}
