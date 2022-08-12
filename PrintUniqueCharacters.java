package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacters {
	public static void main(String[] args) {
		String str = "google";
		char[] ch = str.toCharArray();
		Set<Character> Uniquech = new LinkedHashSet<Character>();
		for (int i=0; i<ch.length; i++)
		{
			Uniquech.add(ch[i]);
			}
	System.out.println(Uniquech);
	
}
}