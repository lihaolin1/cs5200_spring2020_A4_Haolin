package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class QuizWidget extends Widget{
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private int quizwidget_id;
	
	@OneToMany(mappedBy = "quizwidget_quesion_g", cascade = CascadeType.ALL)
	Collection<Question> quizwidget_quesion;
}
