package Assign2;

import java.util.HashMap;
import java.util.Map;

public class SearchKey {
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "RAM");
		mp.put(2, "RAMU");
		mp.put(3, "RAMA");
		mp.put(4, "RAHIM");
		if(mp.containsKey(2))
			System.out.println("It contains 2");
		else
			System.out.println("It not contains 2");
	}
}
