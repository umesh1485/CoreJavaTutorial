package com.hash;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new  Employee("Umesh");
		Employee e2 = new  Employee("Umesh");
		
		Map<Employee, String> map = new HashMap<>();
		
		map.put(e1,"Umesh");
		map.put(e2,"Umesh");
		
		map.get(e1);

	}

}
