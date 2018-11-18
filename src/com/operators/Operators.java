package com.operators;

public class Operators {

	public static void main(String[] args){
		int operand1 = 20;
		int operand2 = 10;
		
		int sum = operand1+operand2;
		int mul = operand1*operand2;
		int div = operand1/operand2;
		int sub = operand1-operand2;
		int mod = 5 % 3;
		
		System.out.println("sum :"+sum);
		System.out.println("mul :"+mul);
		System.out.println("div :"+div);
		System.out.println("sub :"+sub);
		System.out.println("mod :"+mod);
		
		//int increment = ++operand1;
		//System.out.println("increment :"+increment);
		//System.out.println("operand1 :"+operand1);
		
		operand1 *= 2;
		System.out.println("operand1 :"+operand1);
		operand1 +=operand2;
		System.out.println(operand1);
		 operand1 = 2>1?9:90;
		 System.out.println("? "+operand1);
		if(true){}
		
		
	}
}
