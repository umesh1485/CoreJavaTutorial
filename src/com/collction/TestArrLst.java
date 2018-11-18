package com.collction;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrLst {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(4);
		
		list.add("Umesh");
		list.add("Akhilesh");
		list.add("Rahul");
		list.add("Ravi");
		list.add("Planzer");
		list.add("Ravi");
		
		//System.out.println(list);
		/*System.out.println(list.contains("Ravi"));
		System.out.println(list.indexOf("Ravi"));
		System.out.println(list.lastIndexOf("Ravi"));
		System.out.println(list.get(list.size()/2));
		*/
		ArrayList<Student> stuList = new ArrayList<>();
		
		Student st1 = new Student("Umesh", 33);
		Student st2 = new Student("Akhi", 30);
		Student st3 = new Student("Rakesh", 29);
		Student st4 = new Student("Brijesh", 29);
		Student st5 = new Student("Akhi", 30);
		
		stuList.add(st1);
		stuList.add(st2);
		stuList.add(st3);
		stuList.add(st4);
		stuList.add(st5); 
		
		Student findObj = new Student("Akhi", 30); 
		System.out.println(stuList.contains(findObj));
		System.out.println(stuList.indexOf(findObj));
		System.out.println(stuList.lastIndexOf(findObj));
		
		/*for(Student st:stuList){
			//System.out.println(st);
		}*/
		
		/*Student param=new Student("Akhi", 30);
		 for(Student st11:stuList){
			if(st11.equals(param)){
				
			} 
		 }*/
		

	}

}
