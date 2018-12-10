package Assign2;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(300);
		al.add(210);
		al.add(102);
		al.add(20);
		for (Integer n:al) {
			System.out.println(n);
		}
		Collections.swap(al, 1, 4);
		for (Integer n:al) {
			System.out.println(n);
		}
	}

}
