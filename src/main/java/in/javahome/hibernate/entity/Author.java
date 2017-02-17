package in.javahome.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORS")
public class Author {
	@Id
	@Column(name="AUTHOR_ID")
	private Integer authorId;
	@Column(name="NAME")
	private String name;
	@Column(name="E_MAIL")
	private String mail;
	@ManyToMany(mappedBy="authors",fetch=FetchType.EAGER)
	private Set<Book> books = new HashSet<>();
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
