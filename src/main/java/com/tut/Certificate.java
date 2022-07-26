package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String Course;
	private String Grade;
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getGrade() {
		return Grade;
	}
	@Override
	public String toString() {
		return "Certificate [Course=" + Course + ", Grade=" + Grade + "]";
	}
	public Certificate(String course, String grade) {
		super();
		Course = course;
		Grade = grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	

}
