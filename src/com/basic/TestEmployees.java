package com.basic;
class TestEmployees
{
	public static void main(String[]args)
	{
		Employee e1=new Employee();
		e1.setAge(20);
		e1.setName("Rahul");
		
		Employee e2=new Employee();
		e2.setAge(30);
		e2.setName("Rakesh");
		
		Employee e3=new Employee();
		e3.setAge(35);
		e3.setName("Akhi");
		
		Employee e4=new Employee();
		e4.setAge(40);
		e4.setName("Brijesh");
		
		Employee employeeArr[]={e1,e2,e3,e4};
		
		for(int i=0; i< employeeArr.length; i++)
		{	
		System.out.println(employeeArr[i]);
		}
		
		
		
		
		
		
	}
}