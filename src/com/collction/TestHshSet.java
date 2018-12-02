package com.collction;

import java.util.HashSet;

public class TestHshSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Umesh");
		set.add("Akhilesh");
		set.add("Rahul");
		set.add("Ravi");
		set.add("Planzer");
		set.add("Ravi");
		//System.out.println(set);
		
		Student st1 = new Student("Umesh", 33);
		Student st2 = new Student("Akhi", 30);
		Student st3 = new Student("Rakesh", 29);
		Student st4 = new Student("Brijesh", 29);
		Student st5 = new Student("Akhi", 30);
		
		HashSet<Student> stuSet = new HashSet<>();
		stuSet.add(st1);
		stuSet.add(st2);
		stuSet.add(st3);
		stuSet.add(st4);
		stuSet.add(st5); 
		
		System.out.println(stuSet.size());
		

	}

}
