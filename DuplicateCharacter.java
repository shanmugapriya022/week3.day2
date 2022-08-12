package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String str = "abbaba";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] charArray = str.toCharArray();
		for(int i = 1; i<charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
		}
		
		
	
		int maxOccurance = 0;
		char maxOcc = 0;
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > maxOccurance) {
				maxOccurance = entry.getValue();
				maxOcc = entry.getKey();
			}
		}
		System.out.println("Max occuring is " +maxOcc+ " and by number of occrances as: " +maxOccurance);
		
			
		
	}

}