package Assign2;
//How to clone a ArrayList

import java.util.ArrayList;
import java.util.List;

public class CloneArrayList {
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
		List<Integer> lst=(List<Integer>) al.clone();
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
			}
	}

}
