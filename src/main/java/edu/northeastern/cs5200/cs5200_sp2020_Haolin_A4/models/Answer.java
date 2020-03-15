package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

//import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int answer_id;
	private Boolean trueFalseAnswer;
	private int multipleChoiceAnswer;
	public Boolean getTrueFalseAnswer() {
		return trueFalseAnswer;
	}
	public void setTrueFalseAnswer(Boolean trueFalseAnswer) {
		this.trueFalseAnswer = trueFalseAnswer;
	}
	public int getMultipleChoiceAnswer() {
		return multipleChoiceAnswer;
	}
	public void setMultipleChoiceAnswer(int multipleChoiceAnswer) {
		this.multipleChoiceAnswer = multipleChoiceAnswer;
	}
	
	@ManyToOne()
	@JsonIgnore
	private Student Student;
	
	@ManyToOne()
	@JsonIgnore
	private Question Question;
	
	

}
