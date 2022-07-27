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
	        
	        
	        
//	        ManyToMany  Employee<---->Project
	        
	        Employee e1=new Employee();
	        Employee e2 = new Employee();
	        Employee e3 =new Employee();
	        
	        e1.setEid(1);
	        e2.setEid(2);
	        e3.setEid(3);
	        
	        e1.setName("Ram");
	        e2.setName("Ravi");
	        e3.setName("Rohit");
	        
	        
	        
	        Project p1  = new Project();
	        Project p2=new Project();
	        Project p3 = new Project();
	        
	        p1.setPid(101);
	        p2.setPid(102);
	        p3.setPid(103);
	        
	        p1.setName("Library management sysytem");
	        p2.setName("Employee Management");
	        p3.setName("Chatbot");
	        
	        List<Employee> list1 = new ArrayList<Employee>();
	        List<Project> list2 = new ArrayList<Project>();
	        
	        
	        List<Employee> list3 = new ArrayList<Employee>();
	        List<Project> list4 = new ArrayList<Project>();
	        
	        list1.add(e1);
	        list1.add(e2);
	        list1.add(e3);
	        
	        
	        list2.add(p1);
	        list2.add(p2);
	        list2.add(p3);
	        
	        
	        list3.add(e3);
	        list3.add(e2);
	        
	        list4.add(p1);
	        list4.add(p3);
	        
	        
	        
	        e1.setProject(list2);
	        p2.setEmployee(list1);
	       
	        e3.setProject(list4);
	        p3.setEmployee(list3);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        Session  session = factory.openSession();
	        
	        Transaction tx=session.beginTransaction();
	        session.save(e1);
	        session.save(e2);
	        session.save(e3);
	        session.save(p1);
	        session.save(p2);
	        session.save(p3);
	        tx.commit();
	        
	        
	        session.close();
	        
	        
	        
	        
	        factory.close();
	        
	    
	    
	    }

}
