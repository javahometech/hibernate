package in.javahome.hibernate.critiria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Book;

public class SelectNameFromBook {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Criteria crit = session.createCriteria(Book.class);
			ProjectionList projectionList = Projections.projectionList();
			projectionList.add(Projections.property("name"));
			projectionList.add(Projections.property("cost"));
			crit.setProjection(projectionList);
//			Select Name,Cost FROM BOOKS
			List<Object[]> records = crit.list();
			for (Object[] record : records) {
				System.out.println("Name "+record[0]);
				System.out.println("Cost "+record[1]);
			}
		}
	}
}
