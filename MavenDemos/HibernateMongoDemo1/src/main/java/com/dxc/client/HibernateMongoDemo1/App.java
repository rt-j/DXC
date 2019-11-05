package com.dxc.client.HibernateMongoDemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.ogm.cfg.OgmConfiguration;

import com.dxc.model.Customer;
import com.dxc.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	OgmConfiguration cfg=new OgmConfiguration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	//Employee employee=new Employee(1001,"Roshan","Pune",1234);
    	Customer cust=new Customer(2, "Hen", "ingJong", 234);
    	//session.save(employee);
    	session.save(cust);
    	transaction.commit();
        System.out.println( "Hello World!" );
    }
}
