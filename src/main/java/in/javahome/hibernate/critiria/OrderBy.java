package in.javahome.hibernate.critiria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class OrderBy {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Criteria crit = session.createCriteria(Book.class);
			crit.addOrder(Order.desc("cost"));
//			Select * FROM BOOKS ORDER BY COST DESC
			List<Book> list = crit.list();
			for (Book book : list) {
				System.out.println("Name "+book.getName());
				System.out.println("Cost "+book.getCost());
			}
		}
	}
}
