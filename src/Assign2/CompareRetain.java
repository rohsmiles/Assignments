package Assign2;

import java.util.HashSet;
import java.util.Set;

public class CompareRetain {
	public static void main(String[] args) {
		Set<String> al=new HashSet<>();
		al.add("Raj");
		al.add("Raja");
		al.add("Raju");
		al.add("Rajan");
		al.add("Rajshekar");
		Set<String> str=new HashSet<>();
		str.addAll(al);
		System.out.println(al.containsAll(str));
		System.out.println(str.retainAll(al));
	}
}
