package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		 configuration.configure("com/velocity/hibernate.cfg.xml");
		
        //step-2
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		 
		// step-3
		Session session = sessionfactory.openSession();
		//step -4
		Transaction transaction = session.beginTransaction();
		
		Question question=new Question();
		question.setQuestion("What is java?");
		Answer ans1=new Answer();
		ans1.setAns("its a chat bot");
		ans1.setQuestion(question);
		Answer ans2=new Answer();
		ans2.setAns("its a programming");
		ans2.setQuestion(question);
		Answer ans3=new Answer();
		ans3.setAns("its a coffee bean");
		ans3.setQuestion(question);

       session.save(question);
       session.save(ans1);
       session.save(ans2);
       session.save(ans3);
       transaction.commit();
       
	}

}
