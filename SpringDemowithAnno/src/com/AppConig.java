package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConig {
	//now scope by default is singleton
	//if we give @scope("prototype") then n number of objects are created
	//@Scope("prototype")
	@Bean
public Employee getEmployee() {
	return new Employee();
}
	@Bean
	//@Scope("prototype")
public Address getAddress() {
	return new Address();
}
}
