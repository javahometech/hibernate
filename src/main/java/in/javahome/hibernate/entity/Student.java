package in.javahome.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DEMO_AUTO")
public class Student implements Serializable {
	
	@Id
	@Column(name="STUD_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer stdId;
	@Column(name = "STUDENT_NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	
	public Student(String name, String email) {
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
