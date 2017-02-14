package in.javahome.hibernate.mappings;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Employee;

public class RemoveOneToOne {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, "6111GF");
//			We are deleting Employee, because of cascade REMOVE on
//			Passport, It also deletes associated Passport
		    session.delete(emp);
			tx.commit();
			
		}
	}
}
