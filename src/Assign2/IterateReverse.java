package Assign2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateReverse {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<>();
			al.add("Raj");
			al.add("Raja");
			al.add("Raju");
			al.add("Rajan");
			al.add("Rajshekar");
			Collections.reverseOrder();
			Iterator<String> itr=al.descendingIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}	
}
