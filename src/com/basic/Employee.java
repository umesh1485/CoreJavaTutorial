package com.basic;
import java.util.Date;

public class Employee {
	private String name;
	private Date dob;
	private int age;
	public static String company = "LIC";
	
	
	public Employee() {
		super();
		
	}

	public Employee(String name, Date dob, int age) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
	}
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}
	
	
	
}
