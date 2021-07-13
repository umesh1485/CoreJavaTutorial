package competetion;

import java.util.Stack;

/**
 * Find shortest sub string to make a given string pallindrom  
 */
public class MakePallindrome {

	public static void main(String[] args) {
		String str = "Umesh";
		System.out.println("Substring is : "+makePallindrome(str));
		
	}
	static String makePallindrome(String str){
		Stack<Character> stk = new Stack<>();
		for(char c: str.toCharArray()){
			stk.push(c);
		}
		for(char c: str.toCharArray()){
			char peek = stk.peek();
			if(peek == c){
				stk.pop();
			}
		}
		if(stk.isEmpty()){
			return str;
		}else{
			String subStr = "";
			while(stk.isEmpty()==false){
				subStr += stk.pop();
			}
			System.out.println("Pallindrome word is :   "+str+subStr);
			return subStr;
		}
	}

}
