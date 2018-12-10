package Assign2;

import java.util.Iterator;
import java.util.TreeSet;

public class SubSetFromSortedSet {
	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<>();
		al.add("Raj");
		al.add("Raja");
		al.add("Raju");
		al.add("Rajan");
		al.add("Rajshekar");
		TreeSet<String> sub=new TreeSet<>();
		sub=(TreeSet<String>)al.subSet("Raj", "Raju");
//		for (String s:sub) {
//			System.out.println(s);
//		}
		Iterator itr=sub.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
