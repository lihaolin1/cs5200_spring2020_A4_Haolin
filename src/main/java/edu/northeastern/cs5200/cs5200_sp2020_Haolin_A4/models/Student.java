package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.JoinColumn;

@Entity
@Table
public class Student extends Person{
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private int student_id;
	private int gradYear;
	private Long scholarship;
	
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	public Long getScholarship() {
		return scholarship;
	}
	public void setScholarship(Long scholarship) {
		this.scholarship = scholarship;
	}
	
	public void build_Student(int gradYear, Long scholarship) {
		this.gradYear = gradYear;
		this.scholarship = scholarship;
	}
	
	public Student create_student(String first_name, String last_name, String username, String password, int grad_year, Long scholarship) {
		//this.setId(id);
		this.setFirstName(first_name);
		this.setLadtName(last_name);
		this.setUsername(username);
		this.setPassword(password);
		this.setGradYear(grad_year);
		this.setScholarship(scholarship);
		return this;
	}
	
	@OneToMany(mappedBy = "Student", cascade = CascadeType.ALL)
	Collection<Answer> student_answer_collect;
	
	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "to_student",cascade = CascadeType.ALL,orphanRemoval = true)
	//Collection<Enrollment> student_enrollment;
	//@LazyCollection(LazyCollectionOption.FALSE)
	private List<Enrollment> student_enrollment = new ArrayList<Enrollment>();
	public Set<Section> findsectionforstudent(){
		Set<Section> set_section = new HashSet<Section>();
		for (int i = 0; i < student_enrollment.size(); i++) {
			set_section.add(student_enrollment.get(i).get_to_section());
		}
		return set_section;
	}
	
//	@ManyToMany
//	@JoinTable(name = "Enrollment",
//    joinColumns =  @JoinColumn(name = "fk_Student") ,
//    inverseJoinColumns =  @JoinColumn(name = "fk_Section") )
//	private Set<Section> sections = new HashSet<Section>();
	
	public Student() {
		super();
	}
}
