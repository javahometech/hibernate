package in.javahome.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;

public class DeleteExample {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			String hql = "delete from Book where bookId=?";
			Query query = session.createQuery(hql);
			query.setDouble(0, 1);
			query.executeUpdate();
	
		}
	}
}
