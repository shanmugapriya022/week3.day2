package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> num = new TreeMap<Integer,Integer>();
			for(int i = 0; i<input.length; i++) {
				num.put(input[i], num.getOrDefault(input[i], 0)+1);
			}
			System.out.println(num);

	}

}