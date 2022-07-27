package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Questions {
	@Id
	private int questionId;
	private String question;
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}

	@OneToMany(mappedBy="question")
	private List<Answer> answer;

	

	public Questions(int questionId, String question, List<Answer> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	
	public List<Answer> getAnswer() {
		return answer;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	

}
