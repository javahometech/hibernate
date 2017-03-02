package in.javahome.hibernate.critiria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class SelectCountExample {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Criteria crit = session.createCriteria(Book.class);
			crit.setProjection(Projections.count("name"));
			Object count = crit.uniqueResult();
			System.out.println("Books Count "+count);
		}
	}
}
