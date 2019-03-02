package com.exception;

import com.collction.Student;

public class TestExcep {

	public static void main(String[] args) {
		try {
			Student s=null;
			
			s.getAge();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		
		System.out.println("yes........");

	}

}
