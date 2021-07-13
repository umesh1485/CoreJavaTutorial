package competetion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *WAP to find count of anagram pairs from array of int 
 */

public class FindAnagramPairs {

	public static void main(String args[]) {

		int numbers[] = { 74, 47,58,85,128,281,182,821,812,6,9};
		System.out.println(getAnagramPairCount(numbers));
	}

	static int getAnagramPairCount(int[] numbers){
		
		Set<Integer> intSet = new HashSet<>();
		for(int n:numbers){
			if(n>9){
				intSet.add(n);
			}
		}
		Map<Integer, String> countMap = new HashMap<>();
		for(int num: intSet){
			int ascii = getAsciiCode(num);
			if(countMap.containsKey(ascii)){
				countMap.put(ascii, countMap.get(ascii)+","+num);
			}else{
				countMap.put(ascii, ""+num);
			}
		}
		int pairsCount = 0;
		for(Map.Entry<Integer, String> entry: countMap.entrySet()){
			if(entry.getValue().split(",").length > 1){
				System.out.println(entry.getValue()+"    >"+entry.getKey());
				pairsCount++;
			}
		}
		return pairsCount;
	}
	
	public static int getAsciiCode(int a) {
		int ascii = 0;
		for (int first = a; first != 0; first = first / 10) {
			ascii = ascii + (char) first % 10;
		}
		return ascii;
	}

}
