package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	int id;
	String firstName;
	String lastName;
	String nationalityId;
	Date birthday;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityId() {
		return nationalityId;
	}
	public void setIdentityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

}
