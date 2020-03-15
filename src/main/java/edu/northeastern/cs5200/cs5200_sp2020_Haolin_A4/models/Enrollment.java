package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository.University_SectionRepository;

@Entity
@Table
public class Enrollment {
	//@EmbeddedId
   //private EnrollmentId enrollment_id;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int enrollment_id;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    //@MapsId("studentId")
    //@Column(name = "to_student")
    private Student to_student;
 
    public void set_to_student(Student student) {
    	this.to_student = student;
    }
    
    public Student get_to_student() {
    	return to_student;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    //@Column(name = "to_section")
    //@MapsId("sectionId")
    private Section to_section;
    
    public void set_to_section(Section section) {
    	this.to_section = section;
    }
    public Section get_to_section() {
    	return to_section;
    }
    
    private int grade;
    private String feedback;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public Enrollment create_enrollment(int grade, Section section, Student student) {
//		University_SectionRepository sectioRepo;
//		int temp = section.getSeats()-1;
//		section.setSeats(temp);
//		sectioRepo.save(section)
		this.setGrade(grade);
		this.set_to_student(student);
		this.set_to_section(section);
		return this;
	}
	
	public Enrollment() {}
	
}
