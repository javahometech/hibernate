package in.javahome.hibernate.critiria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class PaginationExample {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Criteria crit = session.createCriteria(Book.class);
			int pageNo = 1;
			int maxResults = 50;
			int nexPage = maxResults*pageNo;
			crit.setFirstResult(nexPage);
			crit.setMaxResults(maxResults);
			List<Book> list = crit.list();
			for (Book book : list) {
				System.out.println(book.getName());
			}
			// My changes
		}
	}
}
