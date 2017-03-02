package in.javahome.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;

public class MaxCost {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Query query = session.createQuery("select max(cost) from Book");
			Object max = query.uniqueResult();
			System.out.println(max);
		}
	}
}
