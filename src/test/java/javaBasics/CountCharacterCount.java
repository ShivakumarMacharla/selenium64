package javaBasics;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CountCharacterCount   {

	public static final Logger log = LogManager.getLogger(CountCharacterCount.class);
	
	public static void main(String[] args) {
		
//		String str = "Java is Object Oriented language";
//		
//		int result = str.length()-str.replaceAll("a", "").length();
//		System.out.println(result);=]]=]===]================
		
		String str = "java";
		
		char[] array = str.toCharArray();
		
		int count=1;
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<array.length;i++) {
			if(!map.containsKey(array[i])){
				map.put(array[i], count);
			}
			else {
				map.put(array[i], map.get(array[i])+1);
			}
		}
		
		for(Character ch : map.keySet()) {
//			if(map.get(ch)>1) {
//				System.out.println(ch +" "+map.get(ch));
			
			System.out.println(ch +" "+map.get(ch));
			}
		
		log.info("CountCharacterCount");
	}
}
