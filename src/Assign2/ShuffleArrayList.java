package Assign2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(300);
		al.add(210);
		al.add(102);
		al.add(20);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			}
		System.out.println("----------------");
		Collections.shuffle(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			}
	}

}
