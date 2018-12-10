package Assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedList {
	public static void main(String[] args) {
		List<String> syncal=Collections.synchronizedList(new ArrayList<String>());
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
