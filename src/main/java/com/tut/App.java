  package com.tut;
  import org.hibernate.cfg.Configuration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
  import org.hibernate.Session;
  import org.hibernate.SessionFactory;
  import org.hibernate.Transaction;

  public class App 
	{
	    public static void main( String[] args ) throws Exception
	    {
	        System.out.println( "Project Started..." );
	        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	       
	        Student st = new Student();
	        st.setName("Soubhagya Nayak");
	        
	        st.setDob(new Date());
	        Session  session = factory.openSession();
	        
	        Address ad =new Address();
	        ad.setStreet("Buxibazar");
	        ad.setCity("Cuttack");
	        
	        st.setAddressId(1);
	        
	        
	        
	        
	        
	        // reading image
//	        FileInputStream  fis = new FileInputStream("src/main/java/my-img.jpeg");
//	        byte [] data= new byte[fis.available()];
	        st.setImage(null);
	        
	        
	        Certificate certi = new Certificate();
	        certi.setCourse("Java");
	        certi.setGrade("A");
	        
	        st.setCerti(certi);
	        
	        
	        
	        
	        Transaction tx=session.beginTransaction();
	        session.save(st);
	        tx.commit();
	        
	        
	        session.close();
	       
	        
	    }
	}
