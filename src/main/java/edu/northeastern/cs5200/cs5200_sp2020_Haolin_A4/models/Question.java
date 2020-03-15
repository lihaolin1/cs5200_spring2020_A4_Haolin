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
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int question_id;
	private String question;
	private int points;
	//multiple choice
	private String choices;
	private int correct;
	//true false
	private boolean isTrue;

	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	public String getChoices() {
		return choices;
	}
	public void setChoices(String choices) {
		this.choices = choices;
	}

	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public boolean isTrue() {
		return isTrue;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	
	@OneToMany(mappedBy = "Question", cascade = CascadeType.ALL)
	Collection<Answer> question_answer_collect;
	
	@ManyToOne()
	@JsonIgnore
	private QuizWidget quizwidget_quesion_g;

	public Question() {
		
	}
}
