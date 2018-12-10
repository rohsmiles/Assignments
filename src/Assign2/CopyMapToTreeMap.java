package Assign2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CopyMapToTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "RAM");
		mp.put(2, "RAMU");
		mp.put(3, "RAMA");
		mp.put(4, "RAHIM");
		Map<Integer, String> hm=new TreeMap<>();
		hm.putAll(mp);
		System.out.println(hm);
}

}
