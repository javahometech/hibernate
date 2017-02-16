package in.javahome.hibernate.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="OWNER")
public class Owner implements Serializable{
   @Id
   @Column(name="OWNER_ID")
   private Integer ownerId;
   @Column(name="NAME")
   private String name;
   @Column(name="MOBILE")
   private String mobile;
   @OneToMany(mappedBy="owner")
   private Set<Vehicle> vehicles = new HashSet<>();
   // getters and setters
public Integer getOwnerId() {
	return ownerId;
}
public void setOwnerId(Integer ownerId) {
	this.ownerId = ownerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Set<Vehicle> getVehicles() {
	return vehicles;
}
public void setVehicles(Set<Vehicle> vehicles) {
	this.vehicles = vehicles;
}
   
}
