package com.hash;

class Solution {

	public static void main(String rags[]) {
		int N = 5;
		StringBuilder sb = new StringBuilder("+");
		for(int i=2;i<=N;i++){
			if(i%2==0){
				sb.append("-");
			}else{
				sb.append("+");
			}
			
		}
		System.out.println(sb.toString());
	}

	
}