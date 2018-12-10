package Assign2;

import java.util.HashMap;
import java.util.Map;

public class SearchValue {
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "RAM");
		mp.put(2, "RAMU");
		mp.put(3, "RAMA");
		mp.put(4, "RAHIM");
		if(mp.containsValue("RAMA"))
			System.out.println("It contains RAMA");
		else
			System.out.println("It not contains RAMA");
	}

}
