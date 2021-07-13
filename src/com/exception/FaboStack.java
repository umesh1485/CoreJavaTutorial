package com.exception;

import java.util.Stack;

public class FaboStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<0;i++){
			if(stack.isEmpty()){
				System.out.print(i+" "+1);
				stack.push(i);
				stack.push(1);
			}else{
				int sum = stack.pop()+stack.peek();
				System.out.print(" "+sum);
				stack.add(1,sum);
			}
		}
		

	}

}
