package in.javahome.hibernate;

import org.hibernate.Session;

import in.javahome.hibernate.entity.Student;

public class SelectStudent {
	public static void main(String[] args) {

		try(Session session = MyHibUtil.getSession()){
			Student s1 = session.get(Student.class, 2);
			session.clear();
			Student s2 = session.get(Student.class, 2);
		}
		
	}
}
