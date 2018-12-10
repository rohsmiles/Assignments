package Assign2;

import java.util.ArrayList;
import java.util.Collections;

public class MaxValueList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(300);
		al.add(210);
		al.add(102);
		al.add(20);
		System.out.println(Collections.max(al));
	}

}
