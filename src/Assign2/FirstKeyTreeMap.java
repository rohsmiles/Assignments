package Assign2;

import java.util.TreeMap;

public class FirstKeyTreeMap {
public static void main(String[] args) {
	TreeMap<Integer, String> mp=new TreeMap<>();
	mp.put(1, "RAM");
	mp.put(2, "RAMU");
	mp.put(3, "RAMA");
	mp.put(4, "RAHIM");
	System.out.println("First key is : "+ mp.firstKey());
	}

}
