package Assign2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllKeysTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> mp=new TreeMap<>();
		mp.put(1, "RAM");
		mp.put(2, "RAMU");
		mp.put(3, "RAMA");
		mp.put(4, "RAHIM");
		Set<Integer> keys=mp.keySet();
		for (Integer key:keys) {
			System.out.println(key);
		}
	}

}
