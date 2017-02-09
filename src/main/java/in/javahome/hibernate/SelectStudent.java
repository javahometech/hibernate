package in.javahome.hibernate;

import org.hibernate.Session;

import in.javahome.hibernate.entity.Student;

public class SelectStudent {
	public static void main(String[] args) {

		Session session = MyHibUtil.getSession();
		Student s1 = session.load(Student.class, 2);
		session.close();
		
		System.out.println(s1.getName());// LazyInitializationException
	}
}
