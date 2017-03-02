package in.javahome.hibernate.critiria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class OrExampleOne {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Criteria crit = session.createCriteria(Book.class);
//			Select * FROM BOOKS WHERE BOOK_NAME='Spring' OR COST>200.0
			SimpleExpression r1 = Restrictions.eq("name", "Spring");
			SimpleExpression r2 = Restrictions.gt("cost", 200.0);
			crit.add(Restrictions.or(r1,r2));
			List<Book> list = crit.list();
			for (Book book : list) {
				System.out.println("Name "+book.getName());
				System.out.println("Cost "+book.getCost());
			}
		}
	}
}
