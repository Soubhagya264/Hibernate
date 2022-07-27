package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
    private int ansId;
    private String answer;
    @ManyToOne
    private Questions question;
	 @Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", answer=" + answer + ", question=" + question + "]";
	}
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Answer(int ansId, String answer, Questions question) {
		super();
		this.ansId = ansId;
		this.answer = answer;
		this.question = question;
	}
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
