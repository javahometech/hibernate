package in.javahome.hibernate.critiria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Employee;

public class GetStudentByPassportID {
	public static void main(String[] args) {
		try (Session session = MyHibUtil.getSession()) {
			Criteria crit = session.createCriteria(Employee.class);
			// Select * FROM BOOKS
			Criteria pspt = crit.createCriteria("passport");
			pspt.add(Restrictions.eq("passportNo", "ABC5551B"));
			List<Employee> emps = pspt.list();
		}
	}
}
