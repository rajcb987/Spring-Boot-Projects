//Understanding concept of Spring Beans

package com.CodeNath.SpringBoot_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person (String name , int age, Address address) { }; //Person Constructor with these two arguments are automatically created for us.
record Address (String firstLine, String city) {};

@Configuration

public class HelloWorldConfiguration {

	
	@Bean
	public String name()
	{
		return "Raj";
	}
	
	@Bean
	public int age()
	{
		return 25;
	}
	
	@Bean
	public Person person()	
	{
		return new Person("Ravi", 20 , new Address ("Nagar", "Pune"));
	
	}
	
	@Bean
	public Person person2MethodCall()
	{
		return new Person(name(),age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3)
	{
		return new Person(name,age, address3);
	}
	
	@Bean (name = "address2")
	public Address address()
	{
		return new Address ("ABC Colony", "Pune");
		
	}
	
	@Bean (name = "address3")
	public Address address3()
	{
		return new Address ("DEF Colony", "Nashik");
		
	}
	
	
}
