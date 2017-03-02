package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class FlushExample {
	public static void main(String[] args) {

		Session session = MyHibUtil.getSession() ;
			Transaction tx = session.beginTransaction();
			Student s3 = new Student("Raghu", "raghu@javahome.in");
			session.save(s3);
			tx.commit();
	
	}
}
