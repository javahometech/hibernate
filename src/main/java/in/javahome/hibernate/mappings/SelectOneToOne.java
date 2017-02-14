package in.javahome.hibernate.mappings;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Employee;
import in.javahome.hibernate.entity.Passport;

public class SelectOneToOne {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			// Get Employee & his Passport
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, "6666GF");
			
			System.out.println(emp.getName());
		    System.out.println(emp.getEmail());
		    emp.setName("Prasad");
		    Passport passport = emp.getPassport();
		    
		    System.out.println(passport.getPassportNo());
		    System.out.println(passport.getLocation());
		
			tx.commit();
			
		}
	}
}
