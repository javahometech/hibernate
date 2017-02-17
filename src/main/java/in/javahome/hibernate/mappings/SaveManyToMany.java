package in.javahome.hibernate.mappings;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Author;
import in.javahome.hibernate.entity.Book;

public class SaveManyToMany {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Transaction tx = session.beginTransaction();
			Author a = new Author();
			a.setAuthorId(22);
			a.setName("Rakesh");
			a.setMail("rakesh@abc.com");
			
			Book b1  = new Book();
			b1.setBookId(33);
			b1.setName("Spring");
			b1.setCost(650.0);
			
			Book b2  = new Book();
			b2.setBookId(44);
			b2.setName("RESTFul");
			b2.setCost(850.0);
			
			b1.getAuthors().add(a);
			b2.getAuthors().add(a);
			
			session.save(a);
			session.save(b1);
			session.save(b2);
			tx.commit();
			
		}
	}
}
