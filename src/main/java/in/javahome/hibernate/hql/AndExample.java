package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class AndExample {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			String hql = "from Book where cost>? and bookId>?";
			Query query = session.createQuery(hql);
			query.setDouble(0, 200.0);
			query.setInteger(1, 0);
			List<Book> list = query.list();
			for (Book book : list) {
				System.out.println(book.getName());
			}
		}
	}
}
