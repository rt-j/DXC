package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConig.class);
	Employee e=(Employee) context.getBean(Employee.class);
	Employee e2=context.getBean(Employee.class);
	Address a=(Address) context.getBean(Address.class);
	Address a2=context.getBean(Address.class);
	e.setEmpId(1);
	e.setEmpName("Kevun");
	e.setAddress(a);
	e2.setEmpId(2);
	e2.setEmpName("Jimmy");
	a.setCity("Brooklyn");
	a.setState("NY");
	a2.setCity("Kottayam");
	a2.setState("Kerala");
	System.out.println(e);
	e2.setAddress(a2);
	System.out.println(e2);
	context.registerShutdownHook();
}
}
