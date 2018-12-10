package Assign2;

import java.util.LinkedList;

public class LinkedListToArray {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<>();
		al.add("Raj");
		al.add("Raja");
		al.add("Raju");
		al.add("Rajan");
		al.add("Rajshekar");
		String[] str=new String[al.size()];
		al.toArray(str);
		for (String s:str) {
			System.out.println(s);
		}
	}

}
