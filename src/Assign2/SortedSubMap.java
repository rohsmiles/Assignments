package Assign2;
import java.util.*;

public class SortedSubMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> trmp=new TreeMap<>();
		SortedMap<Integer, String> subtree=new TreeMap<>();
		trmp.put(1, "RAM");
		trmp.put(2, "RAMU");
		trmp.put(3, "RAMA");
		trmp.put(4, "RAHIM");
		System.out.println(trmp);
		subtree=trmp.subMap(2, 4);
		System.out.println(subtree);
	}

}
