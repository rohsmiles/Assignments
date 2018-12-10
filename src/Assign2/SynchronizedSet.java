package Assign2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedSet {
	public static void main(String[] args) {
		Set<String> syncal=Collections.synchronizedSet(new HashSet<String>());
		syncal.add("Pen");
		syncal.add("Pencil");
		syncal.add("Rubber");
		syncal.add("Plastic");
		synchronized (syncal) {
			Iterator<String> itr=syncal.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}			
		}
	}

}
