package com.Return;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());

	}
	
	static int m1(){
		try{
			return 01;
		}catch(Exception e){
			return 22;
		}
		finally {
			System.out.println("jjjjj");
		}
		
	}

}
