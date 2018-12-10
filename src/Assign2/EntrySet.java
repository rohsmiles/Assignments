package Assign2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "RAM");
		mp.put(2, "RAMU");
		mp.put(3, "RAMA");
		mp.put(4, "RAHIM");
		Set<Entry<Integer, String>> keys=mp.entrySet();
		for (Entry<Integer,String> key:keys) {
			System.out.println(key.getKey()+"==>"+key.getValue());
		}
	}

}
