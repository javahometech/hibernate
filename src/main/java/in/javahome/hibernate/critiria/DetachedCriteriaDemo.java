package in.javahome.hibernate.critiria;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Author;
import in.javahome.hibernate.entity.Book;

public class DetachedCriteriaDemo {
	public static void main(String[] args) {
		DetachedCriteria dc = DetachedCriteria.forClass(Book.class);
		dc.add(Restrictions.gt("cost", 200.0));
		try (Session session = MyHibUtil.getSession()) {

			Criteria crit = dc.getExecutableCriteria(session);
			crit.setFetchMode("authors", FetchMode.JOIN);
			List<Book> list = crit.list();
			for (Book book : list) {
				System.out.println(book.getName());
				Set<Author> authors = book.getAuthors();
				for (Author a : authors) {
					System.out.println(a.getName());
				}

			}
		}
	}
}
