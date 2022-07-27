package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMain {
	 public static void main( String[] args ) throws Exception
	    {
	        System.out.println( "Project Started..." );
	        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	        // creating question
	        
	        Questions q1=new Questions();
	        q1.setQuestionId(101);
	        q1.setQuestion("What is Java");
	        
	        // creating answer
	        
	        Answer answer1= new Answer();
	        answer1.setAnsId(201);
	        answer1.setAnswer("Java is a  programming language");
	        
	        Answer answer2=new Answer();
	        answer2.setAnsId(202);
	        answer2.setAnswer("Java is Object oriented programming language");
	        
	        List<Answer> list=new ArrayList<Answer>();
	        list.add(answer1);
	        list.add(answer2);
	        q1.setAnswer(list);
	        
	        
//	        q1.setAnswer(answer1);
	        
	        Session  session = factory.openSession();
	        
	        Transaction tx=session.beginTransaction();
	        session.save(q1);
	        session.save(answer1);
	        session.save(answer2);
	        tx.commit();
	        
	        
	        session.close();
	        
	        
	        
	        
	        factory.close();
	        
	    
	    
	    }

}
