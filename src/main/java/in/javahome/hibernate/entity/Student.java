package in.javahome.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student implements Serializable {
	
	@Id
	@Column(name="STUD_ID")
	private Integer stdId;
	
	@Column(name = "STUDENT_NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	
	public Student(Integer stdId, String name, String email) {
		this.stdId = stdId;
		this.name = name;
		this.email = email;
	}
	public Student() {
	}

	// getters and setters

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
