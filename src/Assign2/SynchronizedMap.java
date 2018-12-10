package Assign2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SynchronizedMap {
	public static void main(String[] args) {
		Map<Integer, String> syncal=Collections.synchronizedMap(new TreeMap<>());
		syncal.put(1, "RAM");
		syncal.put(2, "RAMU");
		syncal.put(3, "RAMA");
		syncal.put(4, "RAHIM");
		Set set=syncal.entrySet();
		synchronized (syncal) {			
				Iterator itr=set.iterator();
				while(itr.hasNext()) {
					Map.Entry me=(Map.Entry)itr.next();
					System.out.println(me.getKey()+"===>"+me.getValue());
				}			
			
			}			
		}
	}
