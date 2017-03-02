package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class NativeSqlExample {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			String sql = "Select * FROM BOOKS";
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.addEntity(Book.class);
			List<Book> list = sqlQuery.list();
			for (Book book : list) {
				System.out.println(book.getName());
				System.out.println(book.getCost());
			}
		}
	}
}
