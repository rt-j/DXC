package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
private int empId;
private String empName;
private int salary;
private Address address;
public Employee() {
	// TODO Auto-generated constructor stub
}
@PostConstruct
public void start() {
	System.out.println(" via Annotations Init");
}
@PreDestroy
public void finish() {
	System.out.println("via annotaions destroy");
}
public Employee(int empId, String empName, int salary, Address address) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.address = address;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address + "]";
}
@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroy using interface");
}
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("init using interfces");
}

}
