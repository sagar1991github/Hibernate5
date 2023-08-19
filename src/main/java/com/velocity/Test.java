package com.velocity;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		 configuration.configure("com/velocity/hibernate.cfg.xml");
		
         //step-2
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		 
		// step-3
		Session session = sessionfactory.openSession();
		//step -4
		Transaction transaction = session.beginTransaction();
		
	//	Customer customer = new Customer();
	//	customer.setName("sagar");
	//	customer.setMobilenumber("8669774968");
	//	customer.setAddress("pune");
	//	Transection transection =new Transection();
	//	transection.setDate(LocalDate.now());
	//	transection.setAmount(4000l);
	//	customer.setTransection(transection);
		
		
		Customer customer2 = new Customer();
		customer2.setName("vinod");
		customer2.setMobilenumber("9356883154");
		customer2.setAddress("Ratnagiri");
		
		
		customer2.setTransection(null);
		

		//session.save(customer);
		session.save(customer2);
		transaction.commit();
		

	}

}
