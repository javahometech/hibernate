package in.javahome.hibernate.util;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.entity.Book;

public class DetachedCriteriaUtility {
	public static DetachedCriteria getBooksCostGraterThan(double cost){
		DetachedCriteria dc = DetachedCriteria.forClass(Book.class);
		dc.add(Restrictions.gt("cost", cost));
		return dc;
	}

}
