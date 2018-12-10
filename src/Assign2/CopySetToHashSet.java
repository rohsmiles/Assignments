package Assign2;

import java.util.HashSet;
import java.util.Set;

public class CopySetToHashSet {
	public static void main(String[] args) {
		Set<String> al=new HashSet<>();
		al.add("Raj");
		al.add("Raja");
		al.add("Raju");
		al.add("Rajan");
		al.add("Rajshekar");
		Set<String> str=new HashSet<>();
		str.addAll(al);
		for(String s:str) {
			System.out.println(s);
		}
	}

}
