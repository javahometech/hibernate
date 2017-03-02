package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class SelectAllBooksWhereCostGraterThan {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Query query = session.createQuery("from Book where cost>?");
			query.setDouble(0, 200.0);
			List<Book> list = query.list();
			for (Book book : list) {
				System.out.println(book.getName());
			}
		}
	}
}
