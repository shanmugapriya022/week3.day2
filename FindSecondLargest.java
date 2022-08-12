package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i = 0; i<data.length; i++){
			set.add(data[i]);
		}
		
		List<Integer> secondLargest = new ArrayList <Integer>(set);
		Collections.sort(secondLargest);
		System.out.println(secondLargest.get(secondLargest.size()-2));
		
		}
	
	//Arrange the array in ascending order
			//Arrays.sort(data);  //{2,3,4,6,7,11}
			
			//Pick the 2nd element from the last and print it
			//int secondLargest = (data[data.length-2]);
				//System.out.println(secondLargest);
}