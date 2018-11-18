package com.basic;

import java.util.Date;

public class TestObj {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.setName("umesh");
		obj1.setDob(new Date());
		obj1.setAge(20);
		//System.out.println("obj1 name:"+obj1.getName());
		
		Employee obj2 = new Employee();
		obj2.setName("Rakesh");
		obj2.setDob(new Date());
		obj2.setAge(29);
		
		//System.out.println("obj2 name:"+obj2.getName());
		obj1.setName("Umesh Sonkar");
		obj2.setName("R Sonkar");
		
		obj1.company="Bajaj";
		
		System.out.println(obj1.getCompany()+"  --   "+obj2.getCompany());
		
		obj2.company="GlobalLogic";
		
		System.out.println(obj1.getCompany()+"  --   "+obj2.getCompany());
		

	}

}
