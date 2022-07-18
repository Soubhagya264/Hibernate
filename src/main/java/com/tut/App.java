package com.tut;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       System.out.println(factory);
        
    }
}
