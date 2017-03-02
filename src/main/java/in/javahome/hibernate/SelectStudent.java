package in.javahome.hibernate;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.entity.Student;

public class SelectStudent {
	public static void main(String[] args) {

		Thread r1 = new Thread() {

			public void run() {
				try (Session session = MyHibUtil.getSession()) {
					Transaction tx = session.beginTransaction();
					Student s1 = session.get(Student.class, 2, LockMode.PESSIMISTIC_WRITE);
					System.out.println("T1 "+s1.getName());
					try {
						Thread.sleep(5 * 5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					tx.commit();
				}
			}
		};

		Thread r2 = new Thread() {

			public void run() {
				try (Session session = MyHibUtil.getSession()) {
					Transaction tx = session.beginTransaction();
					Student s1 = session.get(Student.class, 2, LockMode.PESSIMISTIC_WRITE);
					System.out.println("T2 "+s1.getName());
					try {
						Thread.sleep(5 * 5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					tx.commit();
				}
			}
		};
		r1.start();
		r2.start();
		
	}
}
