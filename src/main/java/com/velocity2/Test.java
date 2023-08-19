package com.velocity2;

import java.time.LocalDate;

import javax.persistence.criteria.Selection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.velocity.Customer;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		 configuration.configure("com/velocity2/hibernate.cfg.xml");
		
        //step-2
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		 
		// step-3
		Session session = sessionfactory.openSession();
		//step -4
		Transaction transaction = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setName("sagar");
		customer.setMobilenumber("8669774968");
		customer.setAddress("pune");
		Transection transection =new Transection();
		transection.setDate(LocalDate.now());
		transection.setAmount(4000l);
		customer.setTransection(transection);
		
		

		
		
	
		

		session.save(customer);
		
		transaction.commit();
		

	}



	}


