package in.javahome.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name = "BOOKS")
public class Book {
	@Column(name = "BOOK_ID")
	@Id
	private Integer bookId;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Version
	@Column(name="OPT_VERSION")
	private int optVersion;
	
	@Column(name = "BOOK_NAME")
	private String name;

	@Column(name = "COST")
	private Double cost;
	@ManyToMany
	@JoinTable(name="BOOK_AUTHOR", 
	     joinColumns= @JoinColumn(name="BOOK_ID"),
        inverseJoinColumns=@JoinColumn(name="AUTHOR_ID"))
	private Set<Author> authors = new HashSet<>();
	
	@Transient
	private String demo;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
	}
}
