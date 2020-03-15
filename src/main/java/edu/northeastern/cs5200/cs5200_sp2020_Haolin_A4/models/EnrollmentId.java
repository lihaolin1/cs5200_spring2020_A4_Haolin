package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EnrollmentId implements Serializable{
	@Column(name = "student_id")
    private Long studentId;
 
    @Column(name = "section_id")
    private Long secctionId;
 
    private EnrollmentId() {}
 
}
