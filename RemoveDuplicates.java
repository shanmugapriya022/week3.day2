package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> dups = new LinkedHashSet<String>();
		
		for(String s:split) {
			dups.add(s);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(String str: dups) {
			sb.append(str + " ");
		}
		
		System.out.print(sb);
	}
}