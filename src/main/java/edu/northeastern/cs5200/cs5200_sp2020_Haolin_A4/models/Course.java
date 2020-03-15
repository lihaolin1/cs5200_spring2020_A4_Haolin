package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int course_id;
	private String label;
	public int getid() {
		return course_id;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "course_section_g", cascade = CascadeType.ALL)
	List<Section> course_section;
	
	public List<Section> findsectionforcourse() {
		return course_section;
	}
	
	@OneToMany(mappedBy = "course_module_g", cascade = CascadeType.ALL)
	Collection<Module> course_module;
	
	@ManyToOne()
	@JsonIgnore
	//@Column(name="Auther")
	private Faculty Auther;
	public Faculty getFaculty() {
		return Auther;
	}
	public void setFaculty(Faculty faculty) {
		this.Auther = faculty;
	}
	
	public Course create_course(String label, Faculty Auther) {
		this.setLabel(label);
		this.setFaculty(Auther);
		return this;
	}
	
	public Course() {
		
	}
}
