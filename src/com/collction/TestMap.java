package com.collction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Onee", 11);
		
		System.out.println(map);
		
		LinkedHashMap<String, Integer> linkmap = new LinkedHashMap<>();
		
		linkmap.put("One", 1);
		linkmap.put("Two", 2);
		linkmap.put("Three", 3);
		linkmap.put("Onee", 11);
		
		System.out.println(linkmap);	

	}

}
