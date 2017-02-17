package in.javahome.hibernate.mappings;

import java.util.Set;

import org.hibernate.Session;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Author;
import in.javahome.hibernate.entity.Book;

public class SelectManyToMany {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			
			Author a = session.get(Author.class, 22);
			
			System.out.println("Name "+a.getName());
			
			Set<Book> books = a.getBooks();
			System.out.println("--------------------");
			for (Book book : books) {
				System.out.println("Book Name "+book.getName());
				System.out.println("Cost "+book.getCost());
				System.out.println("--------------------");
			}
			
		}
	}
}
