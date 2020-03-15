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
public class Topic {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int topic_id;
	private String label;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@OneToMany(mappedBy = "topic_widget_g", cascade = CascadeType.ALL)
	Collection<Widget> tpoic_widget;
	
	@ManyToOne()
	@JsonIgnore
	private Lesson lesson_topic_g;
	
	public Topic() {
		
	}
}
