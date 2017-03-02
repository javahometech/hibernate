package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;

public class SelectNameFromBooks {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Query query = session.createQuery("select name from Book");
			List<String> list = query.list();
			for (String book : list) {
				System.out.println(book);
			}
		}
	}
}
