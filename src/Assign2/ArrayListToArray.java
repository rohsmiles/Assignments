package Assign2;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(300);
		al.add(210);
		al.add(102);
		al.add(20);
		Object[] obj=al.toArray();
		for (int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}

}
