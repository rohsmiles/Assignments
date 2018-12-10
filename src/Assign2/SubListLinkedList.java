package Assign2;

import java.util.LinkedList;
import java.util.List;

public class SubListLinkedList {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<>();
		al.add("Raj");
		al.add("Raja");
		al.add("Raju");
		al.add("Rajan");
		al.add("Rajshekar");
		List<String> sublist=al.subList(1, 3);
		for (String s:sublist) {
			System.out.println(s);
		}
	}

}
