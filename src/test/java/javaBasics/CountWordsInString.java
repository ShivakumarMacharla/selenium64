package javaBasics;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {
	
		String str = "I am learning learning java java programming";
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		String array[] = str.split(" ");
		
		Integer count =1;
		
		for(int i=0;i<array.length;i++) {
			
			if(!map.containsKey(array[i])) {
				map.put(array[i], count);
			}else {
				map.put(array[i], map.get(array[i])+1);
			}
		}
		
		for(String x :map.keySet()) {
			System.out.println("The count of word :"+x+" = "+map.get(x));
		}

	}

}
