package in.javahome.hibernate.mappings;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Employee;
import in.javahome.hibernate.entity.Passport;

public class SaveOneToOne {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Transaction tx = session.beginTransaction();
			
			Passport p = new Passport();
			p.setPassportNo("500XY45699");
			p.setDob(new Date());
			p.setLocation("PUNE");
			
			Employee e = new Employee();
			e.setEmpId("6111GF");
			e.setEmail("ram@gmailcom");
			e.setName("Ram Krishna");
			// set passport to the employee
			e.setPassport(p);
			
			session.persist(e);
//			session.save(p);
			tx.commit();
			
		}
	}
}
