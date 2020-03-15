package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.io.Serializable;

//import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table
public class Person implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int person_id;
	private String username;
	private String firstName;
	private String lastName;
	private String password;
	
	public int getId() {
		return person_id;
	}
	public void setId(int personid) {
		this.person_id = personid;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLadtName() {
		return lastName;
	}
	public void setLadtName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
//	@OneToMany(mappedBy = "person_student")
//	Collection<Student> student_colletc;
//	
//	@OneToMany(mappedBy = "person_faculty")
//	Collection<Faculty> faculty_collect;
	
	//foreign key
//	@OneToMany(mappedBy = "student_answer")
//	Collection<Answer> student_collect;
	
//	@OneToMany(mappedBy = "")
	
	public void build_Person(String firstname, String lastname,String username) {
		this.username = username;
		this.firstName = firstname;
		this.lastName = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
