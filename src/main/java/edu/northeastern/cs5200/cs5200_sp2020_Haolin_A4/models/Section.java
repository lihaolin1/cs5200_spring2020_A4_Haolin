package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_StudentRepository;

@Entity
@Table
public class Section {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int section_id;
	private String title;
	private int seats;
	public int getid() {
		return section_id;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	
	@ManyToOne()
	@JsonIgnore
	//@Column(name = "course_section_g")
	private Course course_section_g;
	public Course getCourse() {
		return course_section_g;
	}
	public void setCourse(Course course) {
		this.course_section_g = course;
		//return course;
	}
	
	public Section create_section(String title, int seats, Course course_section) {
		this.settitle(title);
		this.setSeats(seats);
		this.setCourse(course_section);
		return this;
	}
	
//	@ManyToMany(mappedBy="sections")
//    private Set<Student> stores = new HashSet<Student>();
	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "to_section",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Enrollment> section_enrollment = new ArrayList<Enrollment>();
	public Set<Student> findstudentsinsection(){
		Set<Student> set_student = new HashSet<Student>();
		for (int i = 0; i < section_enrollment.size(); i++) {
			set_student.add(section_enrollment.get(i).get_to_student());
		}
		return set_student;
	}
	public Section() {
		
	}
}
