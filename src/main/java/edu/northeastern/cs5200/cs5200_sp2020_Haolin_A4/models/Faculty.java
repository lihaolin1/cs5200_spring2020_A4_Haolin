package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import edu.northeastern.cs5200.cs5200_spring2020_li_haolin_jdbc.models.address;

@Entity
@Table
public class Faculty extends Person{
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private int faculty_id;
	private String office;
	private Boolean tenured;
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public Boolean getTenured() {
		return tenured;
	}
	public void setTenured(Boolean tenured) {
		this.tenured = tenured;
	}
	
	public Faculty create_faculty(String first_name, String last_name, String username, String password, String office, Boolean tenured) {
		//this.setId(id);
		this.setFirstName(first_name);
		this.setLadtName(last_name);
		this.setUsername(username);
		this.setPassword(password);
		this.setOffice(office);
		this.setTenured(tenured);
		return this;
	}
	
	
	//foreign key
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "Auther")
	private List<Course> Faculty_course_g = new ArrayList<Course>();
	
	public List<Course> getAuthoredCourses(){
		return Faculty_course_g;
	}
	
	public Faculty() {
		super();
	}
}
