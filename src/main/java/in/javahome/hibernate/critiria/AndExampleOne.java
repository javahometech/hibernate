package in.javahome.hibernate.critiria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class AndExampleOne {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Criteria crit = session.createCriteria(Book.class);
//			Select * FROM BOOKS WHERE BOOK_NAME='Spring' AND COST>200.0
			crit.add(Restrictions.eq("name", "Spring"));
			crit.add(Restrictions.gt("cost", 200.0));
			List<Book> list = crit.list();
			for (Book book : list) {
				System.out.println("Name "+book.getName());
				System.out.println("Cost "+book.getCost());
			}
		}
	}
}
