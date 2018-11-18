package com.basic;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee.company="SBI";
		employee1.setName("Rakesh");
		employee1.setDob(new Date());
		employee1.setAge(29);
		
		System.out.println("employee1");
		System.out.println("Name: "+employee1.getName());
		System.err.println("Dob: "+employee1.getDob());
		System.out.println("Age: "+employee1.getAge());
		System.out.println("Company : "+employee1.getCompany());
		
		Employee employee2 = new Employee();
		employee2.setName("Brijesh");
		employee2.setDob(new Date());
		employee2.setAge(25);

		System.out.println("\n employee2 \n");
		System.out.println("Name: "+employee2.getName());
		System.err.println("Dob: "+employee2.getDob());
		System.out.println("Age: "+employee2.getAge());
		System.out.println("Company : "+employee2.getCompany());
		
	}

}
