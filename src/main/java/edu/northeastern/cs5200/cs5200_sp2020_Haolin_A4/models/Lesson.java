package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Lesson {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lesson_id;
	private String label;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@OneToMany(mappedBy = "lesson_topic_g", cascade = CascadeType.ALL)
	Collection<Topic> lesson_tpoic;
	
	@ManyToOne()
	@JsonIgnore
	private Module module_lesson_g;
	
	public Lesson() {
		
	}
}
