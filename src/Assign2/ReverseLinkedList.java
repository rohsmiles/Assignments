package Assign2;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<>();
			al.add("Raj");
			al.add("Raja");
			al.add("Raju");
			al.add("Rajan");
			al.add("Rajshekar");
			Collections.reverse(al);
			for (String s:al) {
				System.out.println(s);
			}
	}

}
