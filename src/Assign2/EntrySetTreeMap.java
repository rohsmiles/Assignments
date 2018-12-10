package Assign2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class EntrySetTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> mp=new TreeMap<>();
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
